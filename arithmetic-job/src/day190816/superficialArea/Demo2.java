package day190816.superficialArea;

/**
 * @author Heroin X
 * @date 2019/8/24 19:09
 */
public class Demo2 {
    public static void main(String[] args) {
        int a = get();
        System.out.println(a);

    }

    public static int get() {
        int i=10;
        try {
            i=i/2;
            return --i;
        } catch (Exception e) {
            --i;
            return i--;
        }

        finally {
            --i;
            return i--;
        }

}
}
