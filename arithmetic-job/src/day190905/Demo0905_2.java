package day190905;

/**
 * @author Heroin X
 * @date 2019/9/5 21:15
 */
public class Demo0905_2 {

    public static void main(String[] args) {
        System.out.println(get(2019));
    }

    static int get(int n) {
        int a = 1;
        int b = 10 * a;
        int c = 0;
        while (n >= a) {
            switch ((n % b) / a) {
                case 0:
                    c += (n / b) * a;
                case 1:
                    c += (n / b) * a;
                    c += n % a + 1;
                    break;
                default:
                    c += (n / b + 1) * a;
                    break;
            }
            a *= 10;
        }
        return c;
    }


}