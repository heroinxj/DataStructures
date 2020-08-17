package jstudy.concur;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Heroin X
 * @date 2020/8/14 22:23
 */
public class CallableThreadTest implements Callable<Integer> {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableThreadTest ctt = new CallableThreadTest();
        // FutureTask是一个包装器，它通过接受Callable来创建，它同时实现了Future和Runnable接口。
        FutureTask<Integer> ft = new FutureTask<>(ctt);

        for(int i = 0;i < 50;i++) {
            System.out.println(Thread.currentThread().getName()+" 的循环变量i的值"+i);
            if(i==0) {
                new Thread(ft,"有返回值的线程2").start();
                Integer integer = ft.get();
                System.out.println(integer);
            }
        }
    }

    @Override
    public Integer call() throws Exception {
        int i = 0;
        for(;i<20;i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        return i;
    }

}
