package c4.demo6java.demo;

import c4.demo6java.gen6.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

/**
 * @author Heroin X
 * @date 2020/5/8 16:50
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\lib\\IDEA_space\\mygithub-repository\\data-structures\\antlr-demo1\\src\\main\\java\\c4\\demo6java\\hello\\HelloWord.java";
        String inputString = readFile(path);
        ANTLRInputStream inputStream = new ANTLRInputStream(inputString);
        Java8Lexer lexer = new Java8Lexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        System.out.println(tokens);

        Java8Parser parser = new Java8Parser(tokens);
        ParseTree tree = parser.expressionName();

        //Visito模式或者Listener模式遍历AST
        System.out.println("Visitor:");
        Java8Visitor evalByVisitor = new Java8BaseVisitor();
        evalByVisitor.visit(tree);

        //Listener模式遍历AST
        System.out.println("Listener:");
        ParseTreeWalker walker = new ParseTreeWalker();
        Java8Listener evalByListener = new Java8BaseListener();
        walker.walk(evalByListener, tree);


    }

    private static String readFile(String pathname) throws IOException {
        File file = new File(pathname);
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, Charset.forName("UTF-8"));
    }
}
