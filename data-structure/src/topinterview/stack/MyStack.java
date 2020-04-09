package topinterview.stack;

import java.util.LinkedList;

/**
 * @author Heroin X
 * @date 2020/3/1 20:49
 */
public class MyStack {

//    public static void main(String[] args) {
//        MyStack myStack = new MyStack();
//        myStack.push(1);
//        myStack.push(3);
//        System.out.println(myStack.top());
//        System.out.println(myStack.poll());
//    }

    LinkedList<Integer> queue1 = new LinkedList<>();
    LinkedList<Integer> queue2 = new LinkedList<>();

    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        if(queue1.isEmpty()){
            queue2.offer(x);
        }else{
            queue1.offer(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {

        if(queue1.isEmpty()){
            while(queue2.size()>1){
                queue1.offer(queue2.poll());
            }
            return queue2.poll();
        }else{
            while(queue1.size()>1){
                queue2.offer(queue1.poll());
            }
            return queue1.poll();
        }
    }

    /** Get the top element. */
    public int top() {
        int top = 0;
        if(queue1.isEmpty()){
            while(queue2.size()>1){
                queue1.offer(queue2.poll());
            }
            top = queue2.poll();
            queue1.offer(top);
        }else{
            while(queue1.size()>1){
                queue2.offer(queue1.poll());
            }
            top =  queue1.poll();
            queue2.offer(top);
        }
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}