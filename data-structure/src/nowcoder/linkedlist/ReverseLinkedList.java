package nowcoder.linkedlist;

import java.util.Stack;

/**\
 * 面试题24：反转链表
 * @author Heroin X
 * @date 2020/1/3 22:35
 */
public class ReverseLinkedList {
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
        new ReverseLinkedList().ReverseList(listNode1);

    }

    public ListNode ReverseList(ListNode head) {


        ListNode node=head;

        Stack<Integer> stack = new Stack<>();

        while(node!=null){
            stack.push(node.val);
            node=node.next;
        }

        int size=stack.size();
        System.out.println(stack);
        ListNode nHead=new ListNode(stack.pop());
        head=nHead;
        for(int i=1;i<size;i++){
            nHead.next=new ListNode(stack.pop());
            nHead=nHead.next;
        }

        System.out.println(head.toString());
        return head;
    }
}
