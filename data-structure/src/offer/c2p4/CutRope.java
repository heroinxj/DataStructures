package offer.c2p4;

/**
 * 2.4.4 动态规划与贪婪
 *
 * 面试题14：剪绳子
 *
 *      给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1），每段绳子的长度记为k[0],k[1],...,k[m]。
 *      请问k[0]xk[1]x...xk[m]可能的最大乘积是多少？
 *      例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 *
 * @author Heroin X
 * @date 2019/12/26 20:38
 */
public class CutRope {

    public static void main(String[] args) {
        int len=8;
        int i = new CutRope().cutRope(len);
        System.out.println(i);
    }

    /**
     * @param target 给定的绳子长度
     * @return
     */
    public int cutRope(int target) {
        return 0;

    }
}
