package jstudy.concur;

/**
 * 懒汉式
 * @author Heroin X
 * @date 2020/6/3 20:29
 */
public class Singleton1 {

    private static Singleton1 instance = null;

    private Singleton1(){}

    /**
     * 懒汉模式(多线程不安全)
     * @return
     */
    public static Singleton1 getInstance1(){

        if(instance == null){
            instance = new Singleton1();
        }

        return instance;
    }

    /**
     * 懒汉模式 多线程环境，但效率不高
     * @return
     */
    public static synchronized Singleton1 getInstance2(){

        if (instance == null){
            instance = new Singleton1();
        }

        return instance;
    }
}
