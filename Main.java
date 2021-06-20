import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main 
{
    public static void main(String[] args) throws Exception 
	{
//        CharStream input = CharStreams.fromStream(System.in);
        CharStream input = CharStreams.fromString(
                "int myfun (int a,int b){\n" +
                        "if a > b then\n" +
                        "a =  a + 1\n" +
                        "fi\n" +
                        "return a\n" +
                        "}\n" +
                        "\n" +
                        "c = 10\n" +
                        "d = 4\n" +
                        "\n" +
                        "print myfun(c,d)");
		MyGrammarLexer lexer = new MyGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyGrammarParser parser = new MyGrammarParser(tokens);
        ParseTree tree = parser.start();
        MyVisitor visitor = new MyVisitor();
        visitor.visit(tree);
	}
}