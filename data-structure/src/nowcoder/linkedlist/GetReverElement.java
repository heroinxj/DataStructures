package nowcoder.linkedlist;

import java.util.Stack;

/**
 * 面试题22：链表中倒数第k个结点
 * 输入一个链表，输出该链表中倒数第k个结点。
 * @author Heroin X
 * @date 2020/1/3 20:29
 */
public class GetReverElement {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;

        new GetReverElement().FindKthToTail(listNode1,1);

    }

    public ListNode FindKthToTail(ListNode head,int k) {
        Stack<Integer> stack = new Stack<>();
        ListNode node=head;
        while(node!=null){
            stack.push(node.val);
            node=node.next;
        }
        ListNode node1=null;
        int a=0;
        for(int i=0;i<k;i++){
            head.val =stack.pop();
        }
        //node1.next.val=stack.pop();
        //System.out.println(node1);
        //node.val=a;
        System.out.println(head);
        return head;
    }
}
