package classloader;

/**
 * @author Heroin X
 * @date 2019/12/11 17:38
 *
 * p7:
 *
 * 1.首次初始化时 静态代码块会执行，不是首次就不会再执行了，即只执行一次。
 * 2. Parent4[] my=new Parent4[1];不是对类的主动使用，
 * 3.对于数组实例，其类型是由JVM在运行期动态生成的，表示为  形式。动态生成的类型，其父类型就是Object
 *   对于数组来说，javaDoc经常将构成数组的元素为component，实际上就是将数组降低一个维度后的类型。
 *
 *  助记符：
 *      anewarray: 创建一个引用类型（如类、接口、数组）的数组，并将其压如数组，并将其引用值压入栈顶
 *      newarray：创建一个指定的原始类型（int、float、char等）的数组，并将其引用值压入栈顶
 *
 *
 */
public class MyTest4 {
    public static void main(String[] args) {
        Parent4 parent4 = new Parent4();
        System.out.println("-------");
        Parent4 parent5 = new Parent4();

        //有意思，Parent4类型的数组；
        //创建了一个实例，但是不是Parent4的实例；
        Parent4[] my=new Parent4[1];
        //[Lclassloader.Parent4;一个数组类型；java虚拟机在运行期生成的
        System.out.println(my.getClass());
        System.out.println(my.getClass().getSuperclass());

        //2维数组
        Parent4[][] my2=new Parent4[3][5];
        //[[Lclassloader.Parent4;
        System.out.println(my2.getClass());

        System.out.println("---ints---");
        int[] ints = new int[1];
        System.out.println(ints.getClass());
        System.out.println(ints.getClass().getSuperclass());

        System.out.println("---chars---");
        char[] chars = new char[1];
        System.out.println(chars.getClass());
        System.out.println(chars.getClass().getSuperclass());

        System.out.println("---boolean---");
        boolean[] booleans = new boolean[1];
        System.out.println(booleans.getClass());

        System.out.println("---short---");
        short[] shorts = new short[1];
        System.out.println(shorts.getClass());

        System.out.println("---byte---");
        byte[] bytes = new byte[1];
        System.out.println(bytes.getClass());
    }
}

class Parent4{
    static {
        System.out.println("parent4 static block");
    }
}