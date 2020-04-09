package nowcoder.linkedlist;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Heroin X
 * @date 2020/1/2 9:24
 */
public class RevertOutList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        listNode.next=new ListNode(4);
        new RevertOutList().printListFromTailToHead(listNode);
    }


    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {


        ArrayList<Integer> list = new ArrayList<>();

        //error1
        Stack<Integer> stack = new Stack<>();

        //边界条件一定要考虑!error3
        if (listNode == null) {
            return list;
        }

        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;

        }

        //java.util.EmptyStackException
        while (stack!=null) {
            //error2
            list.add(stack.pop());
        }
        System.out.println(list);
        return list;
    }




}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

}
