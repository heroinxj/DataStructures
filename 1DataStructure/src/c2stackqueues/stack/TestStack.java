package c2stackqueues.stack;

import c3linkedlist.LinkedListStack;

import java.util.Random;

/**
 * 两种栈 用时相比较
 *
 * @author Heroin X
 * @date 2019/9/3 14:47
 */
public class TestStack {

    private static double testTwoStack(Stack<Integer> stack,int opCount){
        long startTime=System.nanoTime();
        Random random = new Random();
        for (int i=0;i<opCount;i++){
            stack.push(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i=0;i<opCount;i++){
            stack.pop();
        }

        long endTime=System.nanoTime();
        return (endTime-startTime)/1000000000.0;

    }

    public static void main(String[] args) {
        int opCount=5;
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        double time1 = testTwoStack(arrayStack, opCount);
        System.out.println("arrayStack use time :"+time1+"s");

        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        double time2 = testTwoStack(linkedListStack, opCount);
        System.out.println("linkedListStack use time :"+time2+"s");
    }


}
