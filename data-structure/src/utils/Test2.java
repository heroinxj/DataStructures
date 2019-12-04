package utils;

/**
 * @author Heroin X
 * @date 2019/11/22 17:12
 */
public class Test2 {
    public static void main(String[] args) {

        System.out.println(get(2));

    }

    static int get(int a){
        int b=0;

        switch (a){
            case 1:
                b= 100;
                break;
            case 2:
                b= 90;
                break;
            case 3:
                b= 80;
                break;
                default:
        }
        return b;
    }



}
