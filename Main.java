import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main 
{
    public static void main(String[] args) throws Exception 
	{
//        CharStream input = CharStreams.fromStream(System.in);
        CharStream input = CharStreams.fromString("a = 10 \n while a>0 do a = a - 1 od");
		MyGrammarLexer lexer = new MyGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyGrammarParser parser = new MyGrammarParser(tokens);
        ParseTree tree = parser.start();
        MyVisitor visitor = new MyVisitor();
        visitor.visit(tree);
    }
}