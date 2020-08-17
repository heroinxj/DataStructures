package day200611;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Heroin X
 * @date 2020/6/14 17:01
 */
public class TwoStackSort {
    public static void main(String[] args) {

        int[] arr = new int[]{5,2,3,7,1};
        ArrayList<Integer> res = new TwoStackSort().twoStack(arr);
        System.out.println(res);
    }

    public ArrayList<Integer> twoStack(int[] numbers){

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0;i< numbers.length;i++){
            stack1.push(numbers[i]);
        }

        while (!stack1.isEmpty()){
            int tmp = stack1.pop();
            while (!stack2.isEmpty()&& stack2.peek()>tmp){
                stack1.push(stack2.pop());
            }
            stack2.push(tmp);
        }

        while (!stack2.isEmpty()){
            list.add(stack2.pop());
        }

        return list;
    }
}
