package jstudy.concur;

import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池
 *
 * @author Heroin X
 * @date 2020/4/14 21:37
 */
public class Demo3 {

    private static final int CORE_POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE = 10;
    private static final int QUEUE_CAPACITY = 100;
    private static final Long KEEP_ALIVE_TIME = 1L;

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                CORE_POOL_SIZE, MAX_POOL_SIZE, KEEP_ALIVE_TIME,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(QUEUE_CAPACITY),
                new ThreadPoolExecutor.CallerRunsPolicy());

        for (int i = 0; i < 10; i++){
            MyRunable myRunable = new MyRunable( " "+i);
            executor.execute(myRunable);

        }

        executor.shutdown();
        while (!executor.isTerminated()){

        }
        System.out.println(" finished all thread ");

    }
}
class MyRunable implements Runnable{

    private String cpmmand;

    public MyRunable(String cpmmand) {
        this.cpmmand = cpmmand;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" start time = "+new Date());
        processCommand();
        System.out.println(Thread.currentThread().getName()+" end time"+new Date());

    }

    private void processCommand(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "MyRunable{" +
                "cpmmand='" + cpmmand + '\'' +
                '}';
    }
}
