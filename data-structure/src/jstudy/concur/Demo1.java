package jstudy.concur;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @author Heroin X
 * @date 2020/4/9 8:27
 */
public class Demo1 {
    public static void main(String[] args) {


//        ExecutorService pool = Executors.newCachedThreadPool();
//        ExecutorService pool1 = Executors.newFixedThreadPool();
//        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool();
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//
//        ScheduledExecutorService scheduledExecutorService1 = Executors.newSingleThreadScheduledExecutor();
//        ExecutorService pool2 = Executors.newWorkStealingPool();
//
//        ThreadPoolExecutor executor = new ThreadPoolExecutor();


        Thread thread = new Thread();
        new Demo1().testForProcess();
    }

    private void testForProcess(){

        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        // 不需要获取同步的 monitor 和 synchronizer 信息，仅获取线程和线程堆栈信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        // 遍历线程信息，仅打印线程 ID 和线程名称信息
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("[" + threadInfo.getThreadId() + "] " + threadInfo.getThreadName());
        }
    }
    
    
}
