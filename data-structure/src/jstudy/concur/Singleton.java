package jstudy.concur;

/**
 * 单例模式，双重校验锁
 *
 * @author Heroin X
 * @date 2020/4/14 10:12
 */
public class Singleton {

    /**
     * volatile 关键字修饰：
     * volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行
     */
    private volatile static Singleton uniqueInstance;

    /**
     * 私有的构造方法
     */
    private Singleton(){}

    /**
     * 静态成员变量的Getter方法
     *
     * @return
     */
    public static Singleton getUniqueInstance(){
        if (uniqueInstance == null){
            synchronized (Singleton.class){
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

}
