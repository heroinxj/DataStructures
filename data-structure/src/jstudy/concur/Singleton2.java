package jstudy.concur;

/**
 * 饿汉模式
 *
 * @author Heroin X
 * @date 2020/6/3 20:33
 */
public class Singleton2 {

    private static Singleton2 instance = new Singleton2();
    private Singleton2 (){}

    public static Singleton2 getInstance() {
        return instance;
    }

}
