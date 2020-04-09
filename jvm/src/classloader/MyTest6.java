package classloader;

/**
 * @author Heroin X
 * @date 2019/12/12 10:00
 *
 *
 */
public class MyTest6 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println("counter1:"+Singleton.counter1);
        System.out.println("counter2:"+Singleton.counter2);
    }
}

class Singleton{
    public static int counter1;
    public static int counter2=0;

    private static Singleton singleton=new Singleton();

    private Singleton(){
        counter1++;
        counter2++;
    }

    public static Singleton getInstance(){
        return singleton;
    }
}