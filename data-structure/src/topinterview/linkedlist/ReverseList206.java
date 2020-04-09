package topinterview.linkedlist;

import topinterview.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * LeetCode206 :反转链表
 *
 * @author Heroin X
 * @date 2020/1/17 9:36
 */
public class ReverseList206 {
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

//        ListNode listNode = new ReverseList206().reverseList(node1);
        ListNode listNode = new ReverseList206().reverseList2(node1);
        System.out.println(listNode);
    }

    /**
     * 方法1：在LeetCode上提交报内存超出限制的错误，本地测试OK
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        if(head == null){
            return null;
        }

        ArrayList<ListNode> list = new ArrayList<>();
//        list.
        while(head!=null){
            list.add(head);
            head=head.next;
        }

        ListNode node = new ListNode(0);
        ListNode node2 = node;

        while(!list.isEmpty()){
            node.next = list.remove(list.size()-1);
            node =node.next;
        }

        System.out.println(node);
        return node2.next;
    }

    ListNode nodeH = new ListNode(0);
    ListNode nodeH2 = nodeH;

    public ListNode reverseList2(ListNode head) {

        if(head.next!=null){
            reverseList2(head.next);
        }

        Stack<Object> objects = new Stack<>();
//        objects.
        nodeH.next=head;
        nodeH = nodeH.next;
        return nodeH2.next;

    }
}
