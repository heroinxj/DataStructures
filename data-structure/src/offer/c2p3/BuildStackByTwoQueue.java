package offer.c2p3;

import java.util.LinkedList;

/**
 * 面试题9-2：用两个队列实现栈
 * 
 * @author Heroin X
 * @date 2019/12/17 14:54
 */
public class BuildStackByTwoQueue {
    public static void main(String[] args) {

        LinkedList<Integer> q1 = new LinkedList<>();
        LinkedList<Integer> q2 = new LinkedList<>();
        q1.offer(1);
        q1.offer(2);
        q1.offer(3);
        q1.offer(4);
        System.out.println("初始："+q1);
        new BuildStackByTwoQueue().push(q1,q2,5);
        new BuildStackByTwoQueue().pop(q1,q2);
        new BuildStackByTwoQueue().push(q1,q2,6);
    }

    /**
     * 入栈
     * @param q1
     * @param q2
     * @param i
     */
    private void push(LinkedList q1, LinkedList q2, int i) {
        if (!q1.isEmpty() && q2.isEmpty()){
            q1.offer(i);
            System.out.println("入栈1："+q1);
        } else if (q1.isEmpty() && !q2.isEmpty()){
            q2.offer(i);
            System.out.println("入栈2："+q2);
        }
    }

    /**
     * 出栈
     * @param q1
     * @param q2
     */
    private void pop(LinkedList q1, LinkedList q2) {

        if (!q1.isEmpty() && q2.isEmpty()){
            while (q1.size()>1){

                q2.offer(q1.poll());
            }
            q1.poll();
            System.out.println("出栈1："+q2);
        } else if (q1.isEmpty() && !q2.isEmpty()){
            while (q2.size()>1){
                q1.offer(q2.poll());
            }
            q2.poll();
            System.out.println("出栈2："+q1);
        }
    }
}

