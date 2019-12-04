import ilog.concert.IloException;
import ilog.concert.IloNumVar;
import ilog.cplex.IloCplex;

/**
 * @author Heroin X
 * @date 2019/9/14 16:32
 *
 * max x1+2x2+3x3
 * s.t. −x1+x2+x3≤20
 *      x1−3x2+x3≤300
 *      ≤x1≤40
 *
 * （1）使用 IloCplex 类新建一个 cplex 类， 使用 IloNumVar 定义求解变量， 使用 addMaximize 或addMinimize 定义求解目标， 
 *
 * 使用 addLe 添加约束条件， 使用 solve() 方法求解。
 *
 * （2）使用 IloNumExpr 定义中间变量。
 *
 * （3）cplex 的 java api 不支持加减乘除符号，加必须用 sum 方法， 减必须用 diff 方法， 乘除必须用 prod 方法。
 * ————————————————
 * 版权声明：本文为CSDN博主「心态与做事习惯决定人生高度」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/robert_chen1988/article/details/78678289
 */
public class Demo1 {
    public static void main(String[] args) {
        try {
            // 1.IloCplex 类新建一个 cplex 类
            IloCplex cplex = new IloCplex();

            double[] lb = {0.0, 0.0, 0.0};
            double[] ub = {40.0, Double.MAX_VALUE, Double.MAX_VALUE};

            // 2.IloNumVar 定义求解变量
            IloNumVar[] x = cplex.numVarArray(3, lb, ub);

            double[] objvals = {1.0, 2.0, 3.0};

            //3.使用 addMaximize 或addMinimize 定义求解目标，
            cplex.addMaximize(cplex.scalProd(x, objvals));

            double[] coeff1 = {-1.0, 1.0, 1.0};
            double[] coeff2 = {1.0, -3.0, 1.0};

            //4.使用 addLe 添加约束条件
            cplex.addLe(cplex.scalProd(x, coeff1), 20.0);
            cplex.addLe(cplex.scalProd(x, coeff2), 30.0);

            //5.使用 solve() 方法求解
            if (cplex.solve()) {
                cplex.output().println("Solution status = " + cplex.getStatus());
                cplex.output().println("Solution value = " + cplex.getObjValue());
                double[] val = cplex.getValues(x);
                for (int j = 0; j < val.length; j++){
                    cplex.output().println("x" + (j+1) + "  = " + val[j]);
                }
            }
        } catch (IloCplex.UnknownObjectException e) {
            e.printStackTrace();
        } catch (IloException e) {
            e.printStackTrace();
        }
    }
}
