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
    ParseTree tree;
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @org.junit.jupiter.api.Test
    void visitPrint() throws IOException {

        PrintStream ps = new PrintStream(output);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);

        CharStream input = CharStreams.fromString("print 10");
        MyGrammarLexer lexer = new MyGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyGrammarParser parser = new MyGrammarParser(tokens);
        ParseTree tree = parser.start();
        visitor = new MyVisitor();
        visitor.visit(tree);
        assertEquals("10", System.out.toString().getBytes());

        // Put things back
        System.out.flush();
        System.setOut(old);
    }

    @org.junit.jupiter.api.Test
    void visitLoop() {
    }

    @org.junit.jupiter.api.Test
    void visitIfStat() {
    }

    @org.junit.jupiter.api.Test
    void visitGtLtExpr() {
    }

    @org.junit.jupiter.api.Test
    void visitGteqLteqExpr() {
    }

    @org.junit.jupiter.api.Test
    void visitEqualityExpr() {
    }

    @org.junit.jupiter.api.Test
    void visitAndExpr() {
    }

    @org.junit.jupiter.api.Test
    void visitOrExpr() {
    }

    @org.junit.jupiter.api.Test
    void visitTrueExpr() {
    }

    @org.junit.jupiter.api.Test
    void visitFalseExpr() {
    }

    @org.junit.jupiter.api.Test
    void visitAssignExpr() {
    }

    @org.junit.jupiter.api.Test
    void visitNumber() {
    }

    @org.junit.jupiter.api.Test
    void visitId() {
    }

    @org.junit.jupiter.api.Test
    void visitMulDivExpr() {
    }

    @org.junit.jupiter.api.Test
    void visitPlusMinusExpr() {
    }

    @org.junit.jupiter.api.Test
    void visitParens() {
    }
}