package topinterview.linkedlist;

import topinterview.ListNode;

/**
 * @author Heroin X
 * @date 2020/1/18 15:34
 */
public class OddEvenLinkedList328 {
    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode listNode = new OddEvenLinkedList328().oddEvenList(node1);
        System.out.println(listNode);

    }


    public ListNode oddEvenList(ListNode head) {

        ListNode root = head;
        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(0);
        ListNode root1 = head1;
        ListNode root2 = head2;

        // get the  element
        while (head!=null){
            head1.next = new ListNode(head.val);
            head = head.next;
            head1 = head1.next;
            if(head!=null){
                head2.next = new ListNode(head.val);
                head = head.next;
                head2 = head2.next;
            }
        }

        head1.next = root2.next;
        return root1.next;
    }

}
