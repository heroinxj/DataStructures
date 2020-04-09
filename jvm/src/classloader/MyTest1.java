package classloader;

/**
 *
 * 1.对于静态字段来说，只有直接定义了该字段的类才会被初始化；
 * 2.当一个类在初始化时，要求其父类全部都已经初始化完毕了；
 *      -XX:+TraceClassLoading ,
 *
 *      格式 -XX:+<option>, 开启option选项，布尔
 *          -XX:-<option>, 关闭option选项，布尔
 *          -XX:<option> = <value>, 赋值
 *
 * @author Heroin X
 * @date 2019/12/6 15:11
 */
public class MyTest1 {
    public static void main(String[] args) {
        //System.out.println(Child1.str1);
        System.out.println("-----------------------");
        System.out.println(Child1.str2);
    }
}

class Parent1{
    public static String str1 = "hello world";

    // 1.静态代码块是最先执行的！
    static {
        System.out.println("parent static block");
    }
}

class Child1 extends Parent1{

    public static String str2 = "welcome";
    static {
        System.out.println("child static block");
    }
}
