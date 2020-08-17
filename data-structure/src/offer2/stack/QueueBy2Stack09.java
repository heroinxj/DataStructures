package offer2.stack;

import java.util.Stack;

/**
 * @author Heroin X
 * @date 2020/5/21 9:36
 */
public class QueueBy2Stack09 {
    private Stack<Integer> addStack;
    private Stack<Integer> delStack;

    public QueueBy2Stack09() {
        addStack = new Stack<>();
        delStack = new Stack<>();
    }

    public void appendTail(int value) {
        addStack.push(value);
    }

    public int deleteHead() {

        if(delStack.isEmpty()){
            if(addStack.isEmpty()){
                return -1;
            }
            while(!addStack.isEmpty()){
                delStack.push(addStack.pop());
            }
        }

        return delStack.pop();
    }
}
