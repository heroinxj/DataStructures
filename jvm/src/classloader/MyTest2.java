package classloader;

/**
 * @author Heroin X
 * @date 2019/12/6 17:00
 *
 * 加上 final 关键字之后 静态代码块 不打印：
 * 1.常量 在编译阶段会存入到 调用这个常量的方法 所在的类 的常量池中
 * 2.本质上，调用类并没有直接引用到定义常量的类，因此不会被触发 定义常量的类 的初始化，即没有执行该静态代码块
 * 注意： 这里指的是将常量存放到了MyTest2的常量池中，之后 MyTest2 与 Parent2 就没有任何关系了。
 *       甚至可以将Parent2的class文件删除。
 *
 * 助记符：
 *
 * ldc，表示int,float,String,类型的常量值从常量池中推送至栈顶。
 * bipush 表示将单字节 byte（-128~127，1位、8字节、2^8=256）的常量值推送至栈顶
 * sipush 表示将一个短整型常量值 short（-32768~32768，2位、16字节、2^16=65536）推送至栈顶
 * iconst_1 表示将int类型的1推送至栈顶 （iconst_(-1)~iconst_5）
 *
 *
 * 反编译不会处理 :(
 *
 * byte、short、int、long
 *
 */
public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(Parent2.str1);
    }
}

class Parent2{


    public static final int i0=0;
    public static final int i1=1;
    public static final int i2=5;
    public static final int i3=6;
    public static final short s1=127;
//    public static String str1="parent2 hello world";
    public static final String str1="parent2 hello world";

    static {
        System.out.println("parent2 static block");
    }
}
