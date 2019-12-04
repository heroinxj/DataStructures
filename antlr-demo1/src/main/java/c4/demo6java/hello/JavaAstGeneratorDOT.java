package c4.demo6java.hello;

import c4.demo6java.gen6.Java8Lexer;
import c4.demo6java.gen6.Java8Parser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;

/**
 * @author Heroin X
 * @date 2019/10/28 20:00
 *
 * 从java 源代码中创建ast并提取方法，变量和注释的简单实例
 * https://stackoverflow.com/questions/21534316/is-there-a-simple-example-of-using-antlr4-to-create-an-ast-from-java-source-code?noredirect=1&lq=1
 * https://github.com/satnam-sandhu/ASTGenerator
 *
 */
public class JavaAstGeneratorDOT {
    static ArrayList<String> LineNum = new ArrayList<String>();
    static ArrayList<String> Type = new ArrayList<String>();
    static ArrayList<String> Content = new ArrayList<String>();
    static ArrayList<String> RawLineNum = new ArrayList<String>();

    private static String readFile(String pathname) throws IOException {
        File file = new File(pathname);
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, Charset.forName("UTF-8"));
    }

    public static void main(String args[]) throws IOException {
        String path = "D:\\lib\\IDEA_space\\mygithub-repository\\data-structures\\antlr-demo1\\src\\main\\java\\c4\\demo6java\\hello\\HelloWord.java";
        String inputString = readFile(path);
        ANTLRInputStream input = new ANTLRInputStream(inputString);
        Java8Lexer lexer = new Java8Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Java8Parser parser = new Java8Parser(tokens);
        ParserRuleContext ctx = parser.compilationUnit();
//      ParserRuleContext ctx = parser.statementExpressionList();
//      ParserRuleContext ctx = parser.methodDeclaration();

        generateAST(ctx, false, 0, tokens);
        String filename = path.substring(path.lastIndexOf("\\") + 1, path.lastIndexOf("."));
        String save_dot_filename = String.format("ast_%s.dot", filename);
        PrintWriter writer = new PrintWriter(save_dot_filename);
        writer.println(String.format("digraph %s {", filename));
        printDOT(writer);
        writer.println("}");
        writer.close();
    }

    private static void generateAST(RuleContext ctx, boolean verbose, int indentation, CommonTokenStream tokens) {
        boolean toBeIgnored = !verbose && ctx.getChildCount() == 1 && ctx.getChild(0) instanceof ParserRuleContext;
        if (!toBeIgnored) {
            String ruleName = Java8Parser.ruleNames[ctx.getRuleIndex()];
            LineNum.add(Integer.toString(indentation));
            Type.add(ruleName);
            Content.add(ctx.getText());

            // get line number, added by tsmc.sumihui, 20190425
            Interval sourceInterval = ctx.getSourceInterval();
            Token firstToken = tokens.get(sourceInterval.a);
            int lineNum = firstToken.getLine();
            RawLineNum.add(Integer.toString(lineNum));
        }
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                generateAST((RuleContext) element, verbose, indentation + (toBeIgnored ? 0 : 1), tokens);
            }
        }
    }

    private static void printDOT(PrintWriter writer) {
        printLabel(writer);
        int pos = 0;
        for (int i = 1; i < LineNum.size(); i++) {
            pos = getPos(Integer.parseInt(LineNum.get(i)) - 1, i);
            writer.println((Integer.parseInt(LineNum.get(i)) - 1) + Integer.toString(pos) + "->" + LineNum.get(i) + i);
        }
    }

    private static void printLabel(PrintWriter writer) {
        for (int i = 0; i < LineNum.size(); i++) {
//          writer.println(LineNum.get(i)+i+"[label=\""+Type.get(i)+"\\n "+Content.get(i)+" \"]");
            writer.println(LineNum.get(i) + i + "[label=\"" + Type.get(i) + "\", linenum=\"" + RawLineNum.get(i) + "\"]");
        }
    }

    private static int getPos(int n, int limit) {
        int pos = 0;
        for (int i = 0; i < limit; i++) {
            if (Integer.parseInt(LineNum.get(i)) == n) {
                pos = i;
            }
        }
        return pos;
    }
}
