package offer.c2p4;

/**
 * 2.4.1 递归和循环
 *
 * 面试题10-1：斐波那契数列
 *      求斐波那契数列的第n项。
 *      n=0,f(n)=0;
 *      n=1,f(n)=1;
 *      n>1,f(n)=f(n-1)+f(n-2)
 *
 * @author Heroin X
 * @date 2019/12/17 18:58
 */
public class FibonacciNum {
    public static void main(String[] args) {
        Integer num1 = new FibonacciNum().getFibonacciNum1(6);
        Integer num2 = new FibonacciNum().getFibonacciNum2(6);
        System.out.println(num1);
        System.out.println(num2);
    }

    /**
     * 解法1
     * @param n
     * @return
     */
    public Integer getFibonacciNum1(Integer n){
        if (n==0){
            return 0;
        }else if (n==1){
            return 1;
        }else if (n>1){
            return getFibonacciNum1(n-1)+getFibonacciNum1(n-2);
        }else {
            return null;
        }
    }

    /**
     * 解法2
     * @param n
     * @return
     */
    public Integer getFibonacciNum2(Integer n){
        int[] num = new int[n+2];
        num[0]=0;
        num[1]=1;
        int i=2;
        while (i<=n){
            num[i]=num[i-1]+num[i-2];
            i++;
        }
        return num[n];
    }
}
