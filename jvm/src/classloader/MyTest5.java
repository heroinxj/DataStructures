package classloader;

import java.util.Random;

/**
 * @author Heroin X
 * @date 2019/12/12 9:22
 * p8:接口初始化规则
 *
 * 当一个接口在初始化时，并不要求父接口都完成了初始化；
 * 只有在真正使用到父接口时（如引用接口中所定义的常量时），才会初始化。
 *
 * 类加载不一定初始化；但是初始化了就一定被加载过了
 */
public class MyTest5 {
    public static void main(String[] args) {
        System.out.println(Child5.b);
    }
}

interface Parent5{
    public static final int a=new Random().nextInt(5);
}

interface Child5 extends Parent5{
    //成员变量默认修饰 public static final
//    public static final int b=6;
    public static final int b=new Random().nextInt(3);
}