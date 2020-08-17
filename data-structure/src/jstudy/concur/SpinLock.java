package jstudy.concur;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author Heroin X
 * @date 2020/4/16 10:45
 */
public class SpinLock {
    private AtomicReference<Thread> cas = new AtomicReference<Thread>();

    public void lock(){
        Thread current = Thread.currentThread();
        while (!cas.compareAndSet(null,current)){
            // do nothing
        }
    }

    public void unlock(){
        Thread current = Thread.currentThread();
        cas.compareAndSet(current,null);
    }
}
