package offer2.stack;

import java.util.Stack;

/**
 * 最小栈的实现
 *
 * @author Heroin X
 * @date 2020/6/9 16:42
 */
public class MinStack30 {
    /** initialize your data structure here. */
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack30() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);

        if(minStack.isEmpty()){
            minStack.push(x);
        }else{
            int tmp = minStack.peek();
            if(x <= tmp){
                minStack.push(x);
            }
        }

    }

    public void pop() {
        int tmp = stack.pop();
        if(tmp == minStack.peek()){
            minStack.pop();
        }

    }

    public int top() {
        if(!stack.isEmpty()){
            return stack.peek();
        }else{
            return -1;
        }

    }

    public int min() {
        if(!minStack.isEmpty()){
            return minStack.peek();
        }else{
            return -1;
        }
    }
}
