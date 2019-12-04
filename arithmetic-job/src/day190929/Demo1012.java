package day190929;

/**
 * @author Heroin X
 * @date 2019/10/12 19:11
 */
public class Demo1012 {
    public static void main(String[] args) {
        String a=" sss";
        String b=" sss";
        String c=new String("sss");
        String d=new String("sss");

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(c==d);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(c.equals(d));
    }


}
