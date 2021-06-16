import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class Main 
{
    public static void main(String[] args) throws Exception 
	{
        CharStream input = CharStreams.fromString("print 10");
		MyGrammarLexer lexer = new MyGrammarLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MyGrammarParser parser = new MyGrammarParser(tokens);

        ParseTree tree = parser.start();

        MyVisitor visitor = new MyVisitor();
        visitor.visit(tree);
    }
}