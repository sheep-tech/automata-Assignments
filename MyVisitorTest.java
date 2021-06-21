import gen.MyGrammarLexer;
import gen.MyGrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.BeforeAll;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MyVisitorTest {

    MyVisitor visitor;

    MyGrammarLexer lexer;
    CommonTokenStream tokens;
    MyGrammarParser parser;
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    ParseTree visit(CharStream input){

        MyGrammarLexer lexer = new MyGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyGrammarParser parser = new MyGrammarParser(tokens);
        ParseTree tree = parser.start();
        return tree;
    }

    @org.junit.jupiter.api.Test
    void visitPrint() throws IOException {

        PrintStream ps = new PrintStream(output);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        CharStream input = CharStreams.fromString("print 10");
        visitor = new MyVisitor();
        visitor.visit(visit(input));
        // Put things back
        System.out.flush();
        System.setOut(old);
        assertEquals("10",output.toString().replaceAll(System.getProperty("line.separator"), ""));
    }

    @org.junit.jupiter.api.Test
    void visitLoop() {
        CharStream input = CharStreams.fromString("a = 10 \n while (a>0) do {a = a - 1 }");
        visitor = new MyVisitor();
        visitor.visit(visit(input));
        assertEquals(0.0,visitor.getMemory().get(0).get("a").asDouble());
    }

    @org.junit.jupiter.api.Test
    void visitIfStatWithoutElse() {
        CharStream input = CharStreams.fromString("a = 10 \n if a>8 then a = a - 1 fi");
        visitor = new MyVisitor();
        visitor.visit(visit(input));
        assertEquals(9.0,visitor.getMemory().get(0).get("a").asDouble());
    }

    @org.junit.jupiter.api.Test
    void visitIfStatWithElse() {
        CharStream input = CharStreams.fromString("a = 8 \n if a>8 then a = a - 1 else a = a + 1 fi");
        visitor = new MyVisitor();
        visitor.visit(visit(input));
        assertEquals(9.0,visitor.getMemory().get(0).get("a").asDouble());
    }

    @org.junit.jupiter.api.Test
    void visitGteqLteqExpr() {
        String inputStr = "a = 8 \n if a>=8 then a = a - 1 fi \n if a<=7 then a = a + 1 fi";
        CharStream input = CharStreams.fromString(inputStr);
        visitor = new MyVisitor();
        visitor.visit(visit(input));
        assertEquals(8.0,visitor.getMemory().get(0).get("a").asDouble());
    }

    @org.junit.jupiter.api.Test
    void visitEqualityExpr() {
        String inputStr = "a = 8 \n if a==8 then a = a - 1 fi \n if a != 7 then a = a + 1 fi";
        CharStream input = CharStreams.fromString(inputStr);
        visitor = new MyVisitor();
        visitor.visit(visit(input));
        assertEquals(7.0,visitor.getMemory().get(0).get("a").asDouble());
    }

    @org.junit.jupiter.api.Test
    void visitAndExpr() {
        String inputStr = "a = 8 \n b = 9 \n if a==8 && b==9 then a = a - 1 fi";
        CharStream input = CharStreams.fromString(inputStr);
        visitor = new MyVisitor();
        visitor.visit(visit(input));
        assertEquals(7.0,visitor.getMemory().get(0).get("a").asDouble());
    }

    @org.junit.jupiter.api.Test
    void visitOrExpr() {
        String inputStr = "a = 8 \n b = 9 \n if a == 8 || b == 7 then a = a - 1 fi";
        CharStream input = CharStreams.fromString(inputStr);
        visitor = new MyVisitor();
        visitor.visit(visit(input));
        assertEquals(7.0,visitor.getMemory().get(0).get("a").asDouble());
    }



    @org.junit.jupiter.api.Test
    void visitAssignExpr() {
        String inputStr = "a = 8";
        CharStream input = CharStreams.fromString(inputStr);
        visitor = new MyVisitor();
        visitor.visit(visit(input));
        assertEquals(8.0,visitor.getMemory().get(0).get("a").asDouble());
    }


    @org.junit.jupiter.api.Test
    void visitMulDivExpr() {
        String inputStr = "a = 80 \n b = 10 \n c = a * b \n d = a / b";
        CharStream input = CharStreams.fromString(inputStr);
        visitor = new MyVisitor();
        visitor.visit(visit(input));
        assertEquals(800.0,visitor.getMemory().get(0).get("c").asDouble());
        assertEquals(8.0,visitor.getMemory().get(0).get("d").asDouble());
    }

    @org.junit.jupiter.api.Test
    void visitPlusMinusExpr() {
        String inputStr = "a = 8 \n b = 10 \n c = a - b \n d = a + b";
        CharStream input = CharStreams.fromString(inputStr);
        visitor = new MyVisitor();
        visitor.visit(visit(input));
        assertEquals(-2.0,visitor.getMemory().get(0).get("c").asDouble());
        assertEquals(18.0,visitor.getMemory().get(0).get("d").asDouble());
    }
}