package offer.c2p3;

import java.util.Stack;

/**
 * 面试题9-1：用两个栈实现队列
 *
 *      要求实现队列的两个函数功能，尾部添加元素，头部删除元素。
 *
 * @author Heroin X
 * @date 2019/12/17 10:18
 */
public class BuildQueueByTwoStack {
    public static void main(String[] args) {

        Stack stack1=new Stack();
        Stack stack2=new Stack();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        System.out.println("最初："+stack1);
        new BuildQueueByTwoStack().deleteHead(stack1,stack2);
        new BuildQueueByTwoStack().addTail(stack1,stack2,5);
        new BuildQueueByTwoStack().deleteHead(stack1,stack2);
    }


    public void deleteHead(Stack stack1,Stack stack2){

        if (!stack1.empty()&&stack2.empty()){
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        stack2.pop();
        while (!stack2.empty()){
            stack1.push(stack2.pop());
        }
        System.out.println("头部出队列："+stack1);
    }

    public void addTail(Stack stack1,Stack stack2,int e){

        //多余了
//        if (!stack1.empty()&&stack2.empty()){
//            stack1.push(e);
//        }
        if (stack1.empty()&& !stack2.empty()){
            while (!stack2.empty()){
                stack1.push(stack2.pop());
            }
        }
        stack1.push(e);
        System.out.println("尾部增加一个："+stack1);
    }
}
