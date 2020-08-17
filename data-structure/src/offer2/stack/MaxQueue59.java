package offer2.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 59-2-M-队列的最大值
 *
 * @author Heroin X
 * @date 2020/6/9 16:45
 */
public class MaxQueue59 {
    Deque<Integer> queue;
    Deque<Integer> queueMax;
    public MaxQueue59() {
        queue = new ArrayDeque<>();
        queueMax = new ArrayDeque<>();
    }

    public int max_value() {
        if(queueMax.isEmpty()){
            return -1;
        }
        // error 写成pop()
        return queueMax.peek();
    }

    public void push_back(int value) {
        queue.offer(value);
        if(queueMax.isEmpty()){
            queueMax.offer(value);
        }else{
            while(!queueMax.isEmpty() && queueMax.peekLast() <= value){
                queueMax.pollLast();
            }
            queueMax.offer(value);
        }

    }

    public int pop_front() {

        if(queue.isEmpty() || queueMax.isEmpty()){
            return -1;
        }
        int tmp = queue.pop();
        if(queueMax.peek()==tmp){
            queueMax.pop();
        }
        return tmp;
    }
}
