package c4.demo6java.hello;

import c4.demo6java.gen6.Java8Lexer;
import c4.demo6java.gen6.Java8Parser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

/**
 * @author Heroin X
 * @date 2019/10/30 21:22
 */
public class ASTGenerator {

    public static String readFile() throws IOException {
        File file = new File("D:\\lib\\IDEA_space\\mygithub-repository\\data-structures\\antlr-demo1\\src\\main\\java\\c4\\demo6java\\hello\\HelloWord.java");
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, Charset.forName("UTF-8"));
    }

    public static void main(String args[]) throws IOException {
        String inputString = readFile();
        ANTLRInputStream input = new ANTLRInputStream(inputString);
        Java8Lexer lexer = new Java8Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Java8Parser parser = new Java8Parser(tokens);
        ParserRuleContext ctx = parser.compilationUnit();

        printAST(ctx, false, 0);
    }

    private static void printAST(RuleContext ctx, boolean verbose, int indentation) {
        boolean toBeIgnored = !verbose && ctx.getChildCount() == 1 && ctx.getChild(0) instanceof ParserRuleContext;

        if (!toBeIgnored) {
            String ruleName = Java8Parser.ruleNames[ctx.getRuleIndex()];
            for (int i = 0; i < indentation; i++) {
                System.out.print("  ");
            }
            System.out.println(ruleName + " -> " + ctx.getText());
        }
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
//            System.out.println(element);
            if (element instanceof RuleContext) {
                printAST((RuleContext) element, verbose, indentation + (toBeIgnored ? 0 : 1));
            }
        }
    }
}
