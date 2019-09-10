package c4recursion.remove_linkedlist_elements;

/**
 * @author Heroin X
 * @date 2019/9/6 10:11
 *
 * 使用虚拟头结点
 *
 *  * Remove all elements from a linked list of integers that have value val.
 *  *
 *  * Example:
 *  * Input:  1->2->6->3->4->5->6, val = 6
 *  * Output: 1->2->3->4->5
 *  *
 *  *  * public class ListNode {
 *  *  *     int val;
 *  *  *     ListNode next;
 *  *
 *  *  *     ListNode(int x) { val = x; }
 *  *  * }
 */
public class Solution2 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead=new ListNode(1);
        dummyHead.next=head;

        ListNode prev=dummyHead;

        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return dummyHead.next;


    }

}
