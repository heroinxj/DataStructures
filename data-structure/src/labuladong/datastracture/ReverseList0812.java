package labuladong.datastracture;

import topinterview.ListNode;

/**
 * @author Heroin X
 * @date 2020/8/12 14:59
 */
public class ReverseList0812 {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ListNode listNode = new ReverseList0812().reverseList(n1);
        System.out.println(listNode);
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = new ListNode(head.val);
        ListNode post = null;
        head = head.next;
        while(head != null){
            post = head.next;
            head.next = pre;
            pre =  head;
            head = post;
        }
        return pre;
    }
}
