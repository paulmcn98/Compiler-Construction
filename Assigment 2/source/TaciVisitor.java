public class TaciVisitor extends calBaseVisitor<String>{

    private final IrCode output;
    private int count;
    private boolean StmBlk;
    private String part_of_stmblk;

    public TaciVisitor(String path) {
        this.output = new IrCode(path);
        this.count = 0;
        this.StmBlk = false;
        this.part_of_stmblk = "";
    }

    @Override
    public String visitMain(calParser.MainContext ctx) {
        //Begin main block
        output.write("main:" + "\n");
        return super.visitMain(ctx);
    }

    @Override
    public String visitAssignStm(calParser.AssignStmContext ctx) {
        String id = ctx.ID().getText();
        String expression = ctx.expression().getText();
        //Checking if park of a statement block for a label
        if (StmBlk) {
            this.part_of_stmblk += id + "=" + expression + "\n";
        }
        else {
            output.append(id + " = " + expression + "\n");
        }
        return null;
    }

    @Override
    public String visitConst_decl(calParser.Const_declContext ctx) {
        String id = ctx.ID().getText();
        String expression = ctx.expression().getText();
        output.append(id + " = " + expression + "\n");
        return null;
    }
    
    @Override
    public String visitIfStm(calParser.IfStmContext ctx) {
        this.StmBlk = true;
        this.count++;
        String condition = ctx.condition().getText();
        // Getting rid of brackets for Ir code
        condition = condition.replace("(", "");
        condition = condition.replace(")", "");
        String label = "Label" + count;
        //Implementation for and
        if(condition.contains("&")){
            String[] parts = condition.split("&");
            output.append(String.format("if %s goto %s\n", parts[0], label));
            output.append(String.format("%s:\n",label));
            this.count++;
            label = "Label" + count;
            output.append(String.format("if %s goto %s\n", parts[1], label));

            visit(ctx.statement_block(0));
            part_of_stmblk = part_of_stmblk.replace(";", "\n").replace(":=", "=");
            output.prepend(String.format("%s:\n%sreturn\n",label, this.part_of_stmblk));

            return null;
        }
        output.append(String.format("if %s goto %s\n", condition, label));

        visit(ctx.statement_block(0));
        part_of_stmblk = part_of_stmblk.replace(";", "\n").replace(":=", "=");
        output.prepend(String.format("%s:\n%sreturn\n",label, this.part_of_stmblk));

        // if there is an else statement
        if (ctx.statement_block(1) != null) {
            this.part_of_stmblk = "";
            this.count++;
            label = "Label" + count;
            visit(ctx.statement_block(1));
            output.prepend(String.format("%s:\n%sreturn\n",label, this.part_of_stmblk));
            output.append(String.format("ifz %s goto %s\n", condition, label));
            this.part_of_stmblk = "";
        }
        return null;
    }

    @Override
    public String visitWhileStm(calParser.WhileStmContext ctx) {
        System.out.println("whileStm");
        this.StmBlk = true;
        count++;
        String condition = ctx.condition().getText();
        condition = condition.replace("(", "");
        condition = condition.replace(")", "");
        visit(ctx.statement_block());
        //block = block.replace(";", "\n").replace(":=", "=");
        String blockLabel = "Label" + count;
        count++;
        String conditionLabel = "Label" + count;
        // if statement
        output.prepend(String.format("%s:\n%sgoto %s\n",blockLabel, this.part_of_stmblk, conditionLabel));
        // statement block
        output.prepend(String.format("%s:\nif %s goto %s\nreturn\n",conditionLabel, condition, blockLabel));
        output.append("goto " + conditionLabel + "\n");
        this.part_of_stmblk = "";
        this.StmBlk = false;
        return null;
    }

}