package simulateAn;


/**
 * 实现模拟退火算法
 *
 * 此时，模拟退火算法中会以一定的 “概率” 跳出这样的局部最优解，以寻找目标函数的全局最优解。
 * 如上图中所示，若此时寻找到了A点处的解，模拟退火算法会以一定的概率跳出这个解，
 * 如跳到了D点重新寻找，这样在一定程度上增加了寻找到全局最优解的可能性。
 *
 * 求解函数最小值问题：
 * F(x)=6x^7+8x^6+7x^3+5x^2−xy
 *
 * 其中，0≤x≤1000，输入任意yy值，求F(x)的最小值。
 * ————————————————
 * 版权声明：本文为CSDN博主「zhiyong_will」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/google19890102/article/details/45395257
 *
 * @author zzy
 *Email:zhaozhiyong1989@126.com
 */
public class SATest {
    // 初始化温度
    public static final int T = 100;
    // 温度的下界
    public static final double Tmin = 1e-8;
    // 迭代的次数
    public static final int k = 10;
    // 温度的下降率
    public static final double delta = 0.98;

    //用来比较的随机数
    public static double getX() {
        return Math.random() * 100;
    }

    /**
     * 求得函数的值
     *
     * @paramx 目标函数中的一个参数
     * @param y 目标函数中的另一个参数  F(x)=6x^7+8x^6+7x^3+5x^2−xy
     * @return 函数值
     */
    public static double getFuncResult(double x, double y) {
        double result = 6 * Math.pow(x, 7) + 8 * Math.pow(x, 6) + 7
                * Math.pow(x, 3) + 5 * Math.pow(x, 2) - x * y;

        return result;
    }

    /**
     * 模拟退火算法的过程
     * @param y 目标函数中的一个参数
     * @return 最优解
     */
    public static double getSA(double y) {
        // 初始化最终的结果，？
        double result = Double.MAX_VALUE;

        // 初始化温度T，模拟退火算法从某一较高的温度出发，这个温度称为初始温度
        double t = T;

        // 迭代的次数
        double x[] = new double[k];

        // 初始化初始解
        for (int i = 0; i < k; i++) {
            x[i] = getX();
        }


        // 迭代的过程，满足该条件时，即迭代!!!
        while (t > Tmin) {
            for (int i = 0; i < k; i++) {
                // 计算此时的函数结果
                double funTmp = getFuncResult(x[i], y);
                // 在邻域内产生新的解，(Math.random() * 2 - 1)？？？
                double x_new = x[i] + (Math.random() * 2 - 1) * t;

                // 判断新的x不能超出界
                if (x_new >= 0 && x_new <= 100) {
                    double funTmp_new = getFuncResult(x_new, y);

                    //若ΔEk⩽0，该位移可采纳，而变化后的系统状态可作为下次变化的起点；
                    if (funTmp_new - funTmp < 0) {
                        // 替换
                        x[i] = x_new;
                    } else {
                        // 若ΔEk>0，位移后的状态可采纳的概率为 Pk=1/(1+e−ΔEk/T)
                        double p = 1 / (1 + Math
                                .exp(-(funTmp_new - funTmp) / t));
                        //然后从(0,1)区间均匀分布的随机数中挑选一个数R，若R<Pk，则将变化后的状态作为下次的起点；
                        // 否则，将变化前的状态作为下次的起点。
                        if (Math.random() < p) {
                            x[i] = x_new;
                        }
                    }
                }
            }
            //for 循环结束

            // 温度的下降率，下降一个步长，进行新一轮的while循环
            t = t * delta;
        }
        //while 循环结束

        //取出最小的结果，最优解？？？ 不是很理解
        for (int i = 0; i < k; i++) {
            result = Math.min(result, getFuncResult(x[i], y));
        }
        return result;
    }


    public static void main(String args[]) {
        // 设置y的值
        int y = 0;
        System.out.println("最优解为：" + getSA(y));
    }

}

