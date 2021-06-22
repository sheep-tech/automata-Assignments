import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class Main 
{
    public static void main(String[] args) throws Exception 
	{
        CharStream input = CharStreams.fromStream(System.in);
		MyGrammarLexer lexer = new MyGrammarLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MyGrammarParser parser = new MyGrammarParser(tokens);

        ParseTree tree = parser.myStart();

//        MyVisitor visitor = new MyVisitor();
//        visitor.visit(tree);

        GraphVizListener graphVizListener = new GraphVizListener();
        ParseTreeWalker.DEFAULT.walk(graphVizListener, tree);
    }
}