package day190929;

/**
 * @author Heroin X
 * @date 2019/9/29 19:06
 */
public class Demo1 {
    private void test(){
        String aStr="CAT";
        String bStr=aStr;
        aStr.toLowerCase();
        aStr.replace("c","W");
        System.out.println("["+aStr+","+bStr+"]");

    }

    public static void main(String[] args) {
        new Demo1().test();
    }
}
