package offer.c2p4;

/**
 *
 * 面试题10-2：青蛙跳台阶问题
 *      青蛙一次可以跳一个台阶，也可以跳2个台阶，求跳上n级台阶可以有多少种跳法？
 *
 * @author Heroin X
 * @date 2019/12/21 11:59
 */
public class FrogJump {

    public static void main(String[] args) {
        int totalChoice = getTotalChoice(6);
        System.out.println(totalChoice);
    }

    static int getTotalChoice(int n){

        if (n == 1){
            return 1;
        }

        if (n == 2){
            return 2;
        }

        if (n > 2){
            int i = getTotalChoice(n - 1) +getTotalChoice (n - 2) ;
            return i;
        }

        return 0;
    }
}



