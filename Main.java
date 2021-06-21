import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main 
{
    public static void main(String[] args) throws Exception 
	{
//        CharStream input = CharStreams.fromStream(System.in);
        CharStream input = CharStreams.fromString("r = 22\n" +
                "s = 20\n" +
                "i = 1\n" +
                "int myFun(int a, int b)\n" +
                "{\n" +
                "    while (b > 0) do {\n" +
                "     b = b - 1\n" +
                "     if a > b then\n" +
                "        a = a + 1\n" +
                "     else\n" +
                "        a = a + 2\n" +
                "     fi\n" +
                "    }\n" +
                "\n" +
                "    if a > 10 then\n" +
                "     a = a * 2\n" +
                "     a = a + i\n" +
                "     fi\n" +
                "\n" +
                "     return a\n" +
                "}");
		MyGrammarLexer lexer = new MyGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyGrammarParser parser = new MyGrammarParser(tokens);
        ParseTree tree = parser.start();
        MyVisitor visitor = new MyVisitor();
        visitor.visit(tree);
    }
}