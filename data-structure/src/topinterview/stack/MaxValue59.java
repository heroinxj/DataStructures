package topinterview.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 面试题59 - II. 队列的最大值/
 * @author Heroin X
 * @date 2020/3/16 22:02
 */
public class MaxValue59 {

    Deque<Integer> queue;
    Deque<Integer> maxQueue;

    public static void main(String[] args) {
        MaxValue59 maxValue59 = new MaxValue59();
        maxValue59.push_back(1);
        maxValue59.push_back(2);
        System.out.println(maxValue59.max_value());
        System.out.println(maxValue59.pop_front());
        System.out.println(maxValue59.max_value());

    }

    public MaxValue59() {
        queue = new ArrayDeque<>();
        maxQueue = new ArrayDeque<>();
    }

    public int max_value() {
        if(queue.isEmpty()){
            return -1;
        }
        return maxQueue.peek();
    }

    public void push_back(int value) {

        while(!maxQueue.isEmpty() && maxQueue.peekLast() < value){
            maxQueue.pollLast();
        }
        queue.push(value);
        maxQueue.push(value);
    }

    public int pop_front() {
        if(queue.isEmpty()){
            return -1;
        }

        int tmp = queue.pop();
        if(maxQueue.peek() == tmp){
            maxQueue.pop();
        }
        return tmp;
    }
}
