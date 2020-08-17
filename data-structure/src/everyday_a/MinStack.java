package everyday_a;

import java.util.Stack;

/**
 * 最小栈
 * @author Heroin X
 * @date 2020/4/11 10:12
 */
public class MinStack {

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(5);
        stack.push(3);
        stack.push(4);
        stack.push(1);
        stack.pop();
        stack.getMin();
        stack.pop();
        stack.getMin();
        stack.pop();
        stack.getMin();
        stack.pop();
        stack.getMin();
    }

    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int x) {
        // only push the old minimum value when the current
        // minimum value changes after pushing the new value x
        if(x <= min){
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        // if pop operation could result in the changing of the current minimum value,
        // pop twice and change the current minimum value to the last minimum value.
//        if(stack.pop() == min) {
//            min=stack.pop();
//        }
        Integer pop = stack.pop();
        if (pop==min){
            int tmp = stack.pop();
            min = tmp;
        }

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
