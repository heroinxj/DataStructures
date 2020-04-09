package classloader;

import java.util.UUID;

/**
 * @author Heroin X
 * @date 2019/12/11 17:16
 *
 * 因为常量值str 的获取类UUID在编译期间的值是不知道，只有在运行期才知道；
 * 则该值就不会被放到调用类的常量池中，这是在程序运行时，会导致主动使用
 * 这个常量所在的类，显然会导致这个类被初始化。
 */
public class MyTest3 {
    public static void main(String[] args) {
        System.out.println(Parent3.str);
    }
}

class Parent3{

    static final String str= UUID.randomUUID().toString();

    static {
        System.out.println("parent3 static code ");
    }

}