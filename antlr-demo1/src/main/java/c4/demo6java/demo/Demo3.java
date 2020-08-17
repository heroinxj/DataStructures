package c4.demo6java.demo;

import c4.demo6java.gen6.Java8Lexer;
import c4.demo6java.gen6.Java8Parser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Heroin X
 * @date 2020/5/8 17:01
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("D:\\lib\\IDEA_space\\mygithub-repository\\data-structures\\antlr-demo1\\src\\main\\java\\c4\\demo6java\\hello\\HelloWord.java"); // or System.in;


        ANTLRInputStream input = new ANTLRInputStream(is);
        Java8Lexer lexer = new Java8Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);


        Java8Parser parser = new Java8Parser(tokens);
        ParseTree tree = parser.expressionName(); // calc is the starting rule

        System.out.println("LISP:");
        System.out.println(tree.toStringTree(parser));
        System.out.println();

//        System.out.println("Visitor:");
//        EvalVisitor evalByVisitor = new EvalVisitor();
//        evalByVisitor.visit(tree);
//        System.out.println();
//
//        System.out.println("Listener:");
//        ParseTreeWalker walker = new ParseTreeWalker();
//        Evaluator evalByListener = new Evaluator();
//        walker.walk(evalByListener, tree);
    }
}
