package topinterview.linkedlist;

import topinterview.ListNode;

import java.util.ArrayList;

/**
 * @author Heroin X
 * @date 2020/1/19 10:31
 */
public class AddTwoNumber {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(9);
        ListNode node4 = new ListNode(9);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(2);

        node1.next = node2;
        node2.next = node3;

//        node4.next = node5;
//        node5.next = node6;

        ListNode listNode = new AddTwoNumber().addTwoNumbers(node1, node4);
        System.out.println(listNode);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long c1 =1,c2=1;
        long sum1 =0,sum2=0;
        while(l1 != null){
            sum1 =sum1 + l1.val*c1;
            c1=c1*10;
            l1 = l1.next;
        }

        while(l2 != null){
            sum2 =sum2 + l2.val*c2;
            c2=c2*10;
            l2 = l2.next;
        }

        ArrayList<Integer> objects = new ArrayList<>();
        int[] a =new int[5];

        long sum =sum1+sum2;

        ListNode root = new ListNode(0);
        ListNode head = root;
        do{
            int node = (int) (sum % 10);
            root.next = new ListNode(node);
            root = root.next;
            sum = sum/10;
        }while(sum>0);
        return head.next;
    }
}
