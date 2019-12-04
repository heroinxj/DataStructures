//package c4.demo7;
//
//import c4.demo7.gen7.JavaLexer;
//import c4.demo7.gen7.JavaParser;
//import org.antlr.runtime.ANTLRStringStream;
//import org.antlr.runtime.RuleReturnScope;
//import org.antlr.runtime.tree.CommonTree;
//import org.antlr.runtime.tree.CommonTreeNodeStream;
//import org.antlr.v4.runtime.CharStream;
//import org.antlr.v4.runtime.CommonTokenStream;
//
///**
// * @author Heroin X
// * @date 2019/11/2 10:59
// */
//public class Demo {
//    public static void main(String[] args) {
//        String input = "public class HelloWord {" +
//                "public void print(String r){" +
//                "for(int i = 0;true;i+=2)" +
//                "System.out.println(r);" +
//                "}" +
//                "}";
//
//        CharStream cs = new ANTLRStringStream(input);
//        JavaLexer jl = new JavaLexer(cs);
//
//        CommonTokenStream tokens = new CommonTokenStream();
//        tokens.setTokenSource(jl);
//        JavaParser jp = new JavaParser(tokens);
//        RuleReturnScope result = jp.compilationUnit();
//        CommonTree t = (CommonTree) result.getTree();
//
//        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
//
//        nodes.setTokenStream(tokens);
//
//        JavaTreeParser walker = new JavaTreeParser(nodes);
//
//        System.out.println("\nWalk tree:\n");
//
//        printTree(t, 0);
//
//
//        System.out.println(tokens.toString());
//    }
//
//
//    public static void printTree(CommonTree t, int indent) {
//        if (t != null) {
//            StringBuffer sb = new StringBuffer(indent);
//            for (int i = 0; i < indent; i++)
//                sb = sb.append(" ");
//            for (int i = 0; i < t.getChildCount(); i++) {
//                System.out.println(sb.toString() + t.getChild(i).toString());
//                printTree((CommonTree) t.getChild(i), indent + 1);
//            }
//        }
//    }
//}