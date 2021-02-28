import java.awt.*;
import java.util.*;
import java.util.List;

public class EvalVisitor extends calBaseVisitor<Integer>
{
    Map<String, Integer> memory = new HashMap<String, Integer>();
    Map<String, calParser.Parameter_listContext> function_parameters = new HashMap<>();
    Map<String, calParser.Dec_listContext> function_dec_list = new HashMap<>();
    Map<String, calParser.Statement_blockContext> function_stmblk = new HashMap<>();
    Map<String, calParser.ExpressionContext> function_expression = new HashMap<>();
    SymbolTable ST = new SymbolTable();
    public String CurrentScope = "global";

    @Override
    public Integer visitVar_decl(calParser.Var_declContext ctx) {
        String id = ctx.ID().getText();
        String type = ctx.type().getText();
        // Check to see if variable id already exists
        if (memory.containsKey(CurrentScope + id))
            throw new RuntimeException(String.format("Variable %s already exists", id));
        Integer value = null;
        // Stores variable id and value(null) in memory
        memory.put(CurrentScope + id, value);
        // Adds the symbol to the symbol table
        ST.addSymbol(id, type, CurrentScope);
        return value;
    }

    @Override
    public Integer visitConst_decl(calParser.Const_declContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expression());
        String type = ctx.type().getText();
        // Check to see if constant id already exists
        if (memory.containsKey(CurrentScope + id))
            throw new RuntimeException(String.format("Constant %s is already exists", id));
        //Check to see if value type matches the declared type
        // Gets rid of brackets and arguments so if the value is a function
        ST.CompareTypeAndValue(type, ctx.expression().getText().split("\\(")[0]);
        // Stores Constant id and value(null) in memory
        memory.put(CurrentScope + id, value);
        // Adds the symbol to the symbol table
        ST.addSymbol(id, type, CurrentScope);
        return  value;
    }

    @Override
    public Integer visitAssignStm (calParser.AssignStmContext ctx)
    {
        String id = ctx.ID().getText();
        int value = visit(ctx.expression());
        // Stores id and value into memory
        if(!memory.containsKey(CurrentScope + id))
        {
            ST.addSymbol(id, "integer", CurrentScope);
        }
        memory.put(CurrentScope + id, value);
        return value;
    }

    @Override
    public Integer visitIfStm(calParser.IfStmContext ctx) {
        //Check to see if is a valid comparative statement
        ST.CheckIfComparative(ctx.condition().getText());
        // Check if the condition is true
        if(this.visit(ctx.condition()) == 1) {
            visit(ctx.statement_block(0));
        }
        // Go to else statement if condition is false
        else if (ctx.statement_block(1) != null){
            visit(ctx.statement_block(1));
        }
        return visitChildren(ctx);
    }

    @Override
    public Integer visitWhileStm(calParser.WhileStmContext ctx) {
        // Continuous loop of statement block until condition is false
        while (visit(ctx.condition()) == 1) {
            visit(ctx.statement_block());
        }
        return visitChildren(ctx);
    }

    @Override
    public Integer visitCondition(calParser.ConditionContext ctx) {
        // This checks if brackets or neg statement is present so it knows whether to visit ctx.condition(_).expression(_) or ctx.expression(_)
        calParser.ConditionContext bracket_test = ctx.condition(0);
        char neg_test = ctx.getText().charAt(0);
        int x = 0;
        int y = 0;
        // for 2 conditions with an and or an or
        if (ctx.condition(0) != null && ctx.condition(1) != null) {
            x = visit(ctx.condition(0));
            y = visit(ctx.condition(1));
            switch (ctx.op.getType()) {
                case calParser.AND:
                    return ((x == 1) && (y == 1)) ? 1 : 0;
                case calParser.OR:
                    return ((x == 1) || (y == 1)) ? 1 : 0;
            }
        }

        if(bracket_test != null)
        {
            try{
            x = visit(ctx.condition(0).expression(0));
            y = visit(ctx.condition(0).expression(1));
            }
            // for 2 conditions within brackets
            catch (NullPointerException e){
                System.out.println(ctx.condition(0).condition(1).getText());
                x = visit(ctx.condition(0).condition(0));
                y = visit(ctx.condition(0).condition(1));
                switch (ctx.condition(0).op.getType()) {
                    case calParser.AND:
                        System.out.println("ff");
                        return ((x == 1) && (y == 1)) ? 1 : 0;
                    case calParser.OR:
                        return ((x == 1) || (y == 1)) ? 1 : 0;
                }
            }
        }
        if(bracket_test == null)
        {
            x = visit(ctx.expression(0));
            y = visit(ctx.expression(1));
        }

        int comparative_op = 0;

        // retrieve comparative operator
        if(bracket_test != null)
        {
            comparative_op = ctx.condition(0).comp_op().op.getType();
        }
        else {
            comparative_op = ctx.comp_op().op.getType();
        }
        // Evaluate the comparative statement and check for neg operator
        switch (comparative_op) {
           case calParser.EQUAL:
               if(Character.toString(neg_test).equals("~") && x == y){
                   return 0;
               }
               else if(Character.toString(neg_test).equals("~") && x != y) {
                   return 1;
               }
               if (x == y) return 1;
               return 0;
            case calParser.NOTEQUAL:
               if(Character.toString(neg_test).equals("~") && x != y){
                   return 0;
               }
               else if(Character.toString(neg_test).equals("~") && x == y) {
                   return 1;
               }
                if (x != y) return 1;
                return 0;
            case calParser.LT:
               if(Character.toString(neg_test).equals("~") && x < y){
                   return 0;
               }
               else if(Character.toString(neg_test).equals("~") && x >= y) {
                   return 1;
               }
                if (x < y) return 1;
                return 0;
            case calParser.GT:
               if(Character.toString(neg_test).equals("~") && x > y){
                   return 0;
               }
               else if(Character.toString(neg_test).equals("~") && x <= y) {
                   return 1;
               }
                if (x > y) return 1;
                return 0;
            case calParser.LTE:
               if(Character.toString(neg_test).equals("~") && x <= y){
                   return 0;
               }
               else if(Character.toString(neg_test).equals("~") && x > y) {
                   return 1;
               }
                if (x <= y) return 1;
                return 0;
            case calParser.GTE:
               if(Character.toString(neg_test).equals("~") && x >= y){
                   return 0;
               }
               else if(Character.toString(neg_test).equals("~") && x < y) {
                   return 1;
               }
                if (x >= y) return 1;
                return 0;
        }
       return null;
    }

    @Override
    public Integer visitFragExp(calParser.FragExpContext ctx) {
        if (ctx.frag() != null) {
            char a;
            a = ctx.frag().getText().charAt(0);
            int x = 0;
            // If first character of the fragment is a digit then the fragment is an integer
            if(Character.isDigit(a))
            {
                x = Integer.parseInt(ctx.frag().getText());
                return x;
            }
            // Next check if fragment is a boolean value
            if(ctx.frag().getText().equalsIgnoreCase("true")){
                x = 1;
                return x;
            }
            if(ctx.frag().getText().equalsIgnoreCase("false")){
                return x;
            }
            // Final check is to see if it is an id stored in memory
            if (memory.containsKey(CurrentScope + ctx.frag().getText())) {
                x = memory.get(CurrentScope + ctx.frag().getText());
                return x;
            }
        }
        return visitChildren(ctx);
    }

    @Override
    public Integer visitFrag(calParser.FragContext ctx) {
        int x = 0;
        // return id
        if(ctx.ID() != null)
        {
            x = memory.get(CurrentScope + ctx.ID().getText());
            return x;
        }
        // return true or false
        if(ctx.getText().equalsIgnoreCase("true")){
            x = 1;
            return x;
        }
        if(ctx.getText().equalsIgnoreCase("false")){
            return x;
        }
        // return integer
        return Integer.parseInt(ctx.getText());
    }

    @Override
    public Integer visitAddSubOp(calParser.AddSubOpContext ctx) {
        int x = visit(ctx.frag(0));
        int y = visit(ctx.frag(1));
        // Get arithmetic operator and Evaluate statement
        if (ctx.binary_arith_op().op.getType() == calParser.ADD) {
            return x + y;
        } else if (ctx.binary_arith_op().op.getType() == calParser.MINUS) {
            return x - y;
        }
        return visitChildren(ctx);
    }

    @Override
    public Integer visitParens (calParser.ParensContext ctx)
    {
        return visit(ctx.expression());
    }

    @Override
    public Integer visitFunction(calParser.FunctionContext ctx) {
        String id = ctx.ID().getText();
        String type = ctx.type().getText();
        //Add function to the symbol table
        ST.addSymbol(id, type, "global");
        //Store functions in memory and set there values to 0
        memory.put(CurrentScope + id, 0);
        // Store all parts of the function defined in the grammar into hashmaps
        calParser.Parameter_listContext paramaters = ctx.parameter_list();
        function_parameters.put(CurrentScope + id, paramaters);
        calParser.Dec_listContext dec_list = ctx.dec_list();
        function_dec_list.put(CurrentScope + id, dec_list);
        calParser.Statement_blockContext stm_block = ctx.statement_block();
        function_stmblk.put(CurrentScope + id, stm_block);
        calParser.ExpressionContext expr = ctx.expression();
        function_expression.put(CurrentScope + id, expr);
        return visitChildren(ctx);
    }

    @Override
    public Integer visitArgList(calParser.ArgListContext ctx) {
        //Change current scope to local as program is now inside a function
        CurrentScope = "local";
        ST.StackMarker("{");
        String id = ctx.ID().getText();

        String arguments = ctx.arg_list().getText();
        String[] arguments_list = arguments.split(",");

        if(arguments_list[0].isEmpty())
            arguments_list = new String[]{};

        List<String> parameterList = new ArrayList<>();
        if(function_parameters.get("global" + id) != null) {
            for (String param : function_parameters.get("global" + id).getText().split(",")) {
                String param_id = param.split(":")[0];
                parameterList.add(param_id);
            }
        }

       if (arguments_list.length != parameterList.size()) {
            throw new RuntimeException("Incorrect amount of arguments given");
        }

        Integer returned = DoFunction(id, parameterList, arguments_list);

        return returned;
    }

    @Override
    public Integer visitArgStm(calParser.ArgStmContext ctx) {
        //Change current scope to local as program is now inside a function
        CurrentScope = "local";
        ST.StackMarker("{");
        String id = ctx.ID().getText();

        String arguments = ctx.arg_list().getText();
        String[] arguments_list = arguments.split(",");

        if(arguments_list[0].isEmpty())
            arguments_list = new String[]{};

        List<String> parameterList = new ArrayList<>();
        if(function_parameters.get("global" + id) != null) {
            for (String param : function_parameters.get("global" + id).getText().split(",")) {
                String param_id = param.split(":")[0];
                parameterList.add(param_id);
            }
        }

        Integer returned = DoFunction(id, parameterList, arguments_list);

        return visitChildren(ctx);
    }

    public Integer DoFunction(String id, List<String> parameterList, String[] arguments_list){
        for (int i = 0; i < arguments_list.length; i++ ) {
            String argument_id = arguments_list[i];
            String parameter_id = parameterList.get(i);
            int argument_value = memory.get("global" + argument_id);
            memory.put(CurrentScope + parameter_id, argument_value);
            ST.addSymbol(parameter_id, "integer", CurrentScope);
        }

        visit(function_dec_list.get("global" + id));
        visit(function_stmblk.get("global" + id));

        ST.StackMarker("}");
        int value = 0;
        String empty_return = null;

        try{
            value = visit(function_expression.get("global" + id));
            empty_return = "not null";
        }
        catch (NullPointerException e){
        }

        //Pop items in the function scope off the undo stack
        String topOfStack = "";
        while(!topOfStack.equals("{")){
            topOfStack = ST.exitScope();
            if(!topOfStack.equals("{"))
                memory.remove("local" + topOfStack);
        }
        //Change current scope back to global as program is exiting the function
        CurrentScope = "global";

        if(empty_return != null)
            return value;
        return null;
    }

}