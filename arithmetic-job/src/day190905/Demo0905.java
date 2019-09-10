package day190905;

/**
 * @author Heroin X
 * @date 2019/9/5 21:15
 */
public class Demo0905 {

    public static void main(String[] args) {

        get();
    }

    static int get(){
        int c=0x000ffeff;
        int i=0;
        while (c!=0){
            i++;
            c&=(c-1);
        }
        System.out.println(i);
        return 0;
    }
}
