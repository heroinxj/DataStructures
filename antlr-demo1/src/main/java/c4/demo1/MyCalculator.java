package c4.demo1;

import c4.demo1.antlrout.DemoLexer;
import c4.demo1.antlrout.DemoParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author Heroin X
 * @date 2019/10/13 14:18
 */
public class MyCalculator {
    public static void run(String expr) throws Exception{

        //对每一个输入的字符串，构造一个 ANTLRStringStream 流 in
        ANTLRInputStream in = new ANTLRInputStream(expr);

        //用 in 构造词法分析器 lexer，词法分析的作用是产生记号
        DemoLexer lexer = new DemoLexer(in);

        //用词法分析器 lexer 构造一个记号流 tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //再使用 tokens 构造语法分析器 parser,至此已经完成词法分析和语法分析的准备工作
        DemoParser parser = new DemoParser(tokens);

        //最终调用语法分析器的规则 prog，完成对表达式的验证
//        DemoParser.ProgContext prog = parser.prog();
        ParseTree tree = parser.prog();
        System.out.println(tree.toStringTree(parser));


//        System.out.println("--------------------------------");
    }

    public static void main(String[] args) throws Exception{


        String[] testStr={
                "2",
                "a+b+3",
                "(a-b)+3",
                "a+(b*3)"
        };

        for (String s:testStr){
//            System.out.println("Input expr:"+s);
            run(s);
        }
    }
//————————————————
//    版权声明：本文为CSDN博主「九师兄-梁川川」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
//    原文链接：https://blog.csdn.net/qq_21383435/article/details/80814618
}
