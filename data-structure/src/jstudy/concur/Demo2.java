package jstudy.concur;

/**
 * @author Heroin X
 * @date 2020/4/10 10:31
 */
public class Demo2 {

    /**
     * 资源1,2
     */
    private static Object resource1 = new Object();
    private static Object resource2 = new Object();

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        demo2.testForDeadLock1();
    }

    private void testForDeadLock1(){

        int a = 5;
        int b = 12;
        System.out.printf("%02d:%02d",a,b);

        new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread() + "get resource1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waiting get resource2");
                synchronized (resource2) {
                    System.out.println(Thread.currentThread() + "get resource2");
                }
            }
        }, "线程 1").start();


        new Thread(() -> {
            synchronized (resource2) {
                System.out.println(Thread.currentThread() + "get resource2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waiting get resource1");
                synchronized (resource1) {
                    System.out.println(Thread.currentThread() + "get resource1");
                }
            }
        }, "线程 2").start();

    }

    private void testForDeadLock2(){
        Thread thread1 = new Thread("T1");
        Thread thread2 = new Thread("T2");

    }


}
