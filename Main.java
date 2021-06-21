import gen.MyGrammarLexer;
import gen.MyGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main 
{
    public static void main(String[] args) throws Exception 
	{
        CharStream input = CharStreams.fromStream(System.in);
//        CharStream input = CharStreams.fromString("print 10,2");
		MyGrammarLexer lexer = new MyGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyGrammarParser parser = new MyGrammarParser(tokens);
        ParseTree tree = parser.start();
        MyVisitor visitor = new MyVisitor();
        visitor.visit(tree);
    }
}