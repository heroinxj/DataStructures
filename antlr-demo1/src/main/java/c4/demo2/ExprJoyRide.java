package c4.demo2;

import c4.demo2.gen.ExprLexer;
import c4.demo2.gen.ExprParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Heroin X
 * @date 2019/10/22 19:07
 */
public class ExprJoyRide {
    public static void main(String[] args) throws IOException {
        String inputFile=null;
        if (args.length>0){
            inputFile=args[0];
        }
        InputStream is =System.in;
        if (inputFile!=null){
            is=new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);
        //词法分析器
        ExprLexer lexer = new ExprLexer(input);
        //语法分析器对象
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        //从prog规则开始进行语法分析,真正的启动了语法分析器，开始解析过程。
        //调用一条规则对应的方法即是指定该规则开始语法分析，我们可以调用任何我们所希望的规则方法
        ParseTree tree = parser.prog();
        //以文本形式将该规则方法prog()返回的语法分析树打印出来
        System.out.println(tree.toStringTree(parser));
    }


}
