package c4.demo8;

import c4.demo8.gen8.RowsLexer;
import c4.demo8.gen8.RowsParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * @author Heroin X
 * @date 2019/10/28 19:18
 */
public class Col {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        RowsLexer lexer = new RowsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        int col = Integer.valueOf(args[0]);
        // pass column number!,传递列号作为参数
        RowsParser parser = new RowsParser(tokens, col);
        // don't waste time bulding a tree，
        parser.setBuildParseTree(false);
        // parse，开始语法分析
        parser.file();
    }
}
