package c4.demo4;

import c4.demo4.gen4.LabeledExprLexer;
import c4.demo4.gen4.LabeledExprParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author Heroin X
 * @date 2019/10/22 21:17
 */
public class Calc {
    public static void main(String[] args) {

    }

    public static void run(String expr) throws Exception{
        ANTLRInputStream in = new ANTLRInputStream(expr);

        //
        LabeledExprLexer lexer = new LabeledExprLexer(in);

        //
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LabeledExprParser parser = new LabeledExprParser(tokens);
        //开始语法分析
        ParseTree tree = parser.prog();
    }
}
