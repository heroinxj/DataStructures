package simulateAn;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
/**
 *
 * 爬山算法
 * @author Heroin X
 * @date 2019/9/15 10:37
 *
 * 爬山算法是一种局部择优的方法，采用启发式方法，是对深度优先搜索的一种改进，它利用反馈信息帮助生成解的决策。
 * 该算法每次从当前解的临近解空间中选择一个最优解作为当前解，直到达到一个局部最优解。属于人工智能算法的一种。
 *
 * 爬山算法实现很简单，其主要缺点是会陷入局部最优解，而不一定能搜索到全局最优解。
 * 如下图所示：假设C点为当前解，爬山算法搜索到A点这个局部最优解就会停止搜索，因为在A点无论向那个方向小幅度移动都不能得到更优的解。
 * ————————————————
 * 版权声明：本文为CSDN博主「wangqiuyun」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/wangqiuyun/article/details/8810456
 */

public class HillClimbing {

    /**
     * 迭代次数
     */
    private int MAX_GEN;

    /**
     * 城市数量,编码长度
     */
    private int cityNum;

    /**
     * 距离矩阵
     */
    private int[][] distance;

    /**
     * 最佳出现代数
     */
    private int bestT;

    /**
     * 最好的路径编码
     */
    private int[] bestGh;

    private int bestEvaluation;

    private Random random;

    public HillClimbing() {

    }

    /**
     * constructor of GA
     *
     * @param n 城市数量
     * @param g 运行代数
     **/
    public HillClimbing(int n, int g) {
        cityNum = n;
        MAX_GEN = g;
    }

    // 给编译器一条指令，告诉它对被批注的代码元素内部的某些警告保持静默
    @SuppressWarnings("resource")
    /**
     * 初始化HillClimbing算法类
     * @param filename 数据文件名，该文件存储所有城市节点坐标数据
     * @throws IOException
     */
    private void init(String filename) throws IOException {
        // 读取数据
        int[] x;
        int[] y;
        String strbuff;
        BufferedReader data = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        distance = new int[cityNum][cityNum];
        x = new int[cityNum];
        y = new int[cityNum];

        for (int i = 0; i < cityNum; i++) {
            // 读取一行数据，数据格式1 6734 1453
            strbuff = data.readLine();
            // 字符分割
            String[] strcol = strbuff.split(" ");
            // x坐标，y坐标
            x[i] = Integer.valueOf(strcol[1]);
            y[i] = Integer.valueOf(strcol[2]);
        }
        // 计算距离矩阵
        // 针对具体问题，距离计算方法也不一样，
        // 此处用的是att48作为案例，它有48个城市，距离计算方法为伪欧氏距离，最优值为10628
        for (int i = 0; i < cityNum - 1; i++) {
            // 对角线为0
            distance[i][i] = 0;

            //伪欧氏距离
            for (int j = i + 1; j < cityNum; j++) {
                double rij = Math.sqrt(((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j])) / 10.0);

                // 四舍五入，取整
                int tij = (int) Math.round(rij);
                if (tij < rij) {
                    distance[i][j] = tij + 1;
                    distance[j][i] = distance[i][j];
                } else {
                    distance[i][j] = tij;
                    distance[j][i] = distance[i][j];
                }
            }
        }

        //？？？
        distance[cityNum - 1][cityNum - 1] = 0;

        //最好的路径编码 ？？？
        bestGh = new int[cityNum];

        bestEvaluation = Integer.MAX_VALUE;

        //最佳出现代数 ？？？
        bestT = 0;

        // ？？？
        random = new Random(System.currentTimeMillis());
    }


    /**
     * 初始化编码Gh ？？？
     *
     * 最好的路径编码-bestGh
     */
    void initGroup() {
        int i, j;
        bestGh[0] = random.nextInt(65535) % cityNum;
        // 编码长度
        for (i = 1; i < cityNum;)
        {
            bestGh[i] = random.nextInt(65535) % cityNum;
            for (j = 0; j < i; j++) {
                if (bestGh[i] == bestGh[j]) {
                    break;
                }
            }
            if (j == i) {
                i++;
            }
        }
    }

    /**
     * 评价 ？？？
     * @param chr 数组
     * @return
     */
    public int evaluate(int[] chr) {
        int len = 0;
        // 染色体，起始城市,城市1,城市2...城市n
        for (int i = 1; i < cityNum; i++) {
            len += distance[chr[i - 1]][chr[i]];
        }
        // 城市n,起始城市
        len += distance[chr[cityNum - 1]][chr[0]];
        return len;
    }

    /**
     * 爬山算法
     * @param Gh
     * @param T
     */
    public void pashan(int[] Gh, int T) {
        int i, temp, tt = 0;
        int ran1, ran2;
        int e;// 评价新值
        int[] tempGh = new int[cityNum];
        bestEvaluation = evaluate(Gh);

        // 爬山代数T
        for (tt = 0; tt < T; tt++) {
            for (i = 0; i < cityNum; i++) {
                tempGh[i] = Gh[i];
            }
            ran1 = random.nextInt(65535) % cityNum;
            ran2 = random.nextInt(65535) % cityNum;
            while (ran1 == ran2) {
                ran2 = random.nextInt(65535) % cityNum;
            }

            // 两交换法实施邻域操作
            temp = tempGh[ran1];
            tempGh[ran1] = tempGh[ran2];
            tempGh[ran2] = temp;

            // 评价新值
            e = evaluate(tempGh);

            if (e < bestEvaluation) {
                // 最佳长度出现代数
                bestT = tt;

                // 最佳长度：
                bestEvaluation = e;
                for (i = 0; i < cityNum; i++) {
                    Gh[i] = tempGh[i];
                }
            }
        }

    }

    public void solve() {
        initGroup();// 初始化编码
        pashan(bestGh, MAX_GEN);

        System.out.println("最佳长度出现代数：");
        System.out.println(bestT);
        System.out.println("最佳长度");
        System.out.println(bestEvaluation);
        System.out.println("最佳路径：");
        for (int i = 0; i < cityNum; i++) {
            System.out.print(bestGh[i] + ",");
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
        }
    }

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Start....");
        //城市数量、运行代数
        HillClimbing hillClimbing = new HillClimbing(48, 5000);
        hillClimbing.init("d://data2.txt");
        hillClimbing.solve();
    }
}