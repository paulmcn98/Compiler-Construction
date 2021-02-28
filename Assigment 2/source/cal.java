import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;

public class cal
{
    public static void main (String[] args) throws Exception
    {
        String inputFile = null;

        if (args.length > 0)
            inputFile = args [0];
            File f = new File(args [0]);

        InputStream is = System.in;
        if (inputFile!=null) is = new FileInputStream(inputFile);
        calLexer lexer = new calLexer (CharStreams.fromStream(is));
        CommonTokenStream tokens = new CommonTokenStream (lexer);
        calParser parser = new calParser (tokens);

        ParseTree tree = parser.program();

        EvalVisitor eval = new EvalVisitor ();
        eval.visit(tree);

        TaciVisitor taci = new TaciVisitor("src/generatedCode.tac");
        taci.visit(tree);

    }
}