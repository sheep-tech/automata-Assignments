import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main 
{
    public static void main(String[] args) throws Exception 
	{
//        CharStream input = CharStreams.fromStream(System.in);
        CharStream input = CharStreams.fromString("a = 8 \n b = 9 \n if a==8 && b==9 then a = a - 1 fi print a");
		MyGrammarLexer lexer = new MyGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyGrammarParser parser = new MyGrammarParser(tokens);
        ParseTree tree = parser.start();
        MyVisitor visitor = new MyVisitor();
        visitor.visit(tree);
	}
}