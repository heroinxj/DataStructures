//package c4.demo4;
//
//import c4.demo4.gen4.LabeledExprBaseVisitor;
//import c4.demo4.gen4.LabeledExprParser;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author Heroin X
// * @date 2019/10/22 22:21
// */
//public class EvalVisitor extends LabeledExprBaseVisitor<Integer> {
//
//    /** "memory" for our calculator; variable/value pairs go here */
//    Map<String, Integer> memory = new HashMap<String, Integer>();
//
//    /** ID '=' expr NEWLINE */
//    @Override
//    public Integer visitAssign(LabeledExprParser.AssignContext ctx) {
//        // id is left-hand side of '='，id在=的左边
//        String id = ctx.ID().getText();
//        // compute value of expression on right，计算右侧表达式的值
//        int value = visit(ctx.expr());
//        // store it in our memory，将这个映射关系存到内存中去
//        memory.put(id, value);
//        return value;
//    }
//
//    /** expr NEWLINE */
//    @Override
//    public Integer visitPrintExpr(LabeledExprParser.PrintExprContext ctx) {
//        Integer value = visit(ctx.expr()); // evaluate the expr child，计算expr子节点的值
//        System.out.println(value);         // print the result
//        return 0;                          // return dummy value，假值
//    }
//
//    /** INT */
//    @Override
//    public Integer visitInt(LabeledExprParser.IntContext ctx) {
//        return Integer.valueOf(ctx.INT().getText());
//    }
//
//    /** ID */
//    @Override
//    public Integer visitId(LabeledExprParser.IdContext ctx) {
//        String id = ctx.ID().getText();
//        if ( memory.containsKey(id) ) return memory.get(id);
//        return 0;
//    }
//
//    /** expr op=('*'|'/') expr */
//    @Override
//    public Integer visitMulDiv(LabeledExprParser.MulDivContext ctx) {
//        int left = visit(ctx.expr(0));  // get value of left subexpression
//        int right = visit(ctx.expr(1)); // get value of right subexpression
//        if ( ctx.op.getType() == LabeledExprParser.MUL ) return left * right;
//        return left / right; // must be DIV
//    }
//
//    /** expr op=('+'|'-') expr */
//    @Override
//    public Integer visitAddSub(LabeledExprParser.AddSubContext ctx) {
//        int left = visit(ctx.expr(0));  // get value of left subexpression
//        int right = visit(ctx.expr(1)); // get value of right subexpression
//        if ( ctx.op.getType() == LabeledExprParser.ADD ) return left + right;
//        return left - right; // must be SUB
//    }
//
//    /** '(' expr ')' */
//    @Override
//    public Integer visitParens(LabeledExprParser.ParensContext ctx) {
//        return visit(ctx.expr()); // return child expr's value
//    }
//}
