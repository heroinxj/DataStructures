package jstudy.concur;

/**
 * @author Heroin X
 * @date 2020/6/28 10:49
 */
public class Singleton0628 {

    private static Singleton0628 single1 = null;
    private static Singleton0628 single2 = new Singleton0628();
    private volatile static Singleton0628 single3 = null;

    private Singleton0628 (){}

    /**
     * 懒汉
     * @return
     */
    public static Singleton0628 getSingle1(){
        if (single1 == null){
            single1 = new Singleton0628();
        }
        return single1;
    }

    /**
     * 饿汉
     * @return
     */
    public static Singleton0628 getSingle2(){
        return single2;
    }

    /**
     * 双重校验锁
     * @return
     */
    public static Singleton0628 getSingle3() {

        if (single3 == null) {
            synchronized (Singleton0628.class) {
                if (single3 == null) {
                    single3 = new Singleton0628();
                }
            }
        }
        return single3;
    }

    public static void main(String[] args) {


    }
}
