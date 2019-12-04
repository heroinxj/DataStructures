package simulateAn;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * ģ���˻�-�������������
 *
 * @author Heroin X
 * @date 2019/9/15 9:31
 */
public class SA{

    /**
     * �������������볤��
     */
    private int cityNum;

    /**
     *ÿ���¶ȵ�������
     */
    private int N;

    /**
     * ���´���
     */
    private int T;

    /**
     * ����ϵ��
     */
    private float a;

    /**
     * ��ʼ�¶�
     */
    private float t0;

    /**
     * // �������
     */
    private int[][] distance;

    /**
     * // ��ѳ��ִ���
     */
    private int bestT;

    /**
     * ��ʼ·������
     */
    private int[] Ghh;

    private int GhhEvaluation;

    /**
     * ��õ�·������
     */
    private int[] bestGh;

    private int bestEvaluation;

    /**
     * �����ʱ����
     */
    private int[] tempGhh;

    private int tempEvaluation;

    private Random random;

    public SA() {
    }

    /**
     * constructor of SA
     *
     * @param cn ��������
     * @param t  ���´���
     * @param n  ÿ���¶ȵ�������
     * @param tt ��ʼ�¶�
     * @param aa ����ϵ��
     **/
    public SA(int cn, int n, int t, float tt, float aa) {
        cityNum = cn;
        N = n;
        T = t;
        t0 = tt;
        a = aa;
    }



    // ��������һ��ָ��������Ա���ע�Ĵ���Ԫ���ڲ���ĳЩ���汣�־�Ĭ
    @SuppressWarnings("resource")
    /**
     * ��ʼ�� �㷨��
     * @param filename �����ļ��������ļ��洢���г��нڵ���������
     * @throws IOException
     */
    private void init(String filename) throws IOException {
        // ��ȡ����
        int[] x;
        int[] y;
        String strbuff;
        BufferedReader data = new BufferedReader(new InputStreamReader(
                new FileInputStream(filename)));
        distance = new int[cityNum][cityNum];
        x = new int[cityNum];
        y = new int[cityNum];
        for (int i = 0; i < cityNum; i++) {
            // ��ȡһ�����ݣ����ݸ�ʽ1 6734 1453
            strbuff = data.readLine();
            // �ַ��ָ�
            String[] strcol = strbuff.split(" ");
            // x����  y����
            x[i] = Integer.valueOf(strcol[1]);
            y[i] = Integer.valueOf(strcol[2]);
        }
        // ����������
        // ����Ծ������⣬������㷽��Ҳ��һ�����˴��õ���att48��Ϊ����������48�����У�������㷽��Ϊαŷ�Ͼ��룬����ֵΪ10628
        for (int i = 0; i < cityNum - 1; i++) {
            // �Խ���Ϊ0
            distance[i][i] = 0;
            for (int j = i + 1; j < cityNum; j++) {


                double rij = Math
                        .sqrt(((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j])
                                * (y[i] - y[j])) / 10.0);
                // �������룬ȡ��
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
        distance[cityNum - 1][cityNum - 1] = 0;

        Ghh = new int[cityNum];
        bestGh = new int[cityNum];
        bestEvaluation = Integer.MAX_VALUE;
        tempGhh = new int[cityNum];
        tempEvaluation = Integer.MAX_VALUE;
        bestT = 0;
        random = new Random(System.currentTimeMillis());

        System.out.println(cityNum+","+N+","+T+","+a+","+t0);

    }

    /**
     * ��ʼ·������Ghh
     */
    void initGroup() {
        int i, j;
        Ghh[0] = random.nextInt(65535) % cityNum;
        // ���볤��
        for (i = 1; i < cityNum;)
        {
            Ghh[i] = random.nextInt(65535) % cityNum;
            for (j = 0; j < i; j++) {
                if (Ghh[i] == Ghh[j]) {
                    break;
                }
            }
            if (j == i) {
                i++;
            }
        }
    }

    /**
     * ���Ʊ����壬���Ʊ���Gha��Ghb
     * @param Gha
     * @param Ghb
     */
    public void copyGh(int[] Gha, int[] Ghb) {
        for (int i = 0; i < cityNum; i++) {
            Ghb[i] = Gha[i];
        }
    }

    //
    public int evaluate(int[] chr) {
        // 0123
        int len = 0;
        // ���룬��ʼ����,����1,����2...����n
        for (int i = 1; i < cityNum; i++) {
            len += distance[chr[i - 1]][chr[i]];
        }
        // ����n,��ʼ����
        len += distance[chr[cityNum - 1]][chr[0]];
        return len;
    }

    /**
     * ���򽻻����õ��ھ�
     * @param Gh
     * @param tempGh
     */
    public void Linju(int[] Gh, int[] tempGh) {
        int i, temp;
        int ran1, ran2;

        for (i = 0; i < cityNum; i++) {
            tempGh[i] = Gh[i];
        }
        ran1 = random.nextInt(65535) % cityNum;
        ran2 = random.nextInt(65535) % cityNum;
        while (ran1 == ran2) {
            ran2 = random.nextInt(65535) % cityNum;
        }
        temp = tempGh[ran1];
        tempGh[ran1] = tempGh[ran2];
        tempGh[ran2] = temp;
    }

    public void solve() {
        // ��ʼ������Ghh
        initGroup();

        // ���Ƶ�ǰ����Ghh����ñ���bestGh
        copyGh(Ghh, bestGh);

        bestEvaluation = evaluate(Ghh);
        GhhEvaluation = bestEvaluation;

        // ���´���
        int k = 0;

        // ��������
        int n = 0;
        float t = t0;
        float r = 0.0f;

        while (k < T) {
            n = 0;
            //��40����������ѭ��40�Σ�
            while (n < N) {
                // �õ���ǰ����Ghh���������tempGhh
                Linju(Ghh, tempGhh);
                tempEvaluation = evaluate(tempGhh);

                //�Ƚ����ۺ������µ�С�ھɵģ��򻻳��µ�
                if (tempEvaluation < bestEvaluation)
                {
                    copyGh(tempGhh, bestGh);
                    bestT = k;
                    bestEvaluation = tempEvaluation;
                }
                //������һ���ĸ���ֵ�����µ�xֵ
                r = random.nextFloat();
                if (tempEvaluation < GhhEvaluation || Math.exp((GhhEvaluation - tempEvaluation) / t) > r) {
                    copyGh(tempGhh, Ghh);
                    GhhEvaluation = tempEvaluation;
                }
                n++;
            }
            t = a * t;
            k++;
        }

        System.out.println("��ѳ��ȳ��ִ�����");
        System.out.println(bestT);
        System.out.println("��ѳ���");
        System.out.println(bestEvaluation);
        System.out.println("���·����");
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

        //����������ÿ���¶Ȳ��������´�������ʼ�¶ȡ�����ϵ��
        SA sa = new SA(48, 40, 400, 250.0f, 0.98f);
        sa.init("d://data2.txt");
        sa.solve();
    }

//��������������������������������
//    ��Ȩ����������ΪCSDN������wangqiuyun����ԭ�����£���ѭ CC 4.0 BY-SA ��ȨЭ�飬ת���븽��ԭ�ĳ������Ӽ���������
//    ԭ�����ӣ�https://blog.csdn.net/wangqiuyun/article/details/8918523

}