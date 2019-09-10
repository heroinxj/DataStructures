package c4recursion.remove_linkedlist_elements;

/**
 * @author Heroin X
 * @date 2019/9/6 9:18
 *
 * leetcode203,Remove all elements from a linked list of integers that have value val.
 *
 * Example:
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 *
 *  * public class ListNode {
 *  *     int val;
 *  *     ListNode next;
 *
 *  *     ListNode(int x) { val = x; }
 *  * }
 *
 */
public class Solution {

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {

        int[] nums={1,2,4,6,3,5,6};
        ListNode listNode = new ListNode(nums);
        System.out.println(listNode);
        ListNode listNode1 = new Solution().removeElements(listNode, 6);
        System.out.println(listNode1);
    }



    public ListNode removeElements(ListNode head, int val) {
        //不用if
        while (head != null && head.val == val) {
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
//            head=head.next;一替三
        }

        /*?
        * 空链表
        * */
        if (head == null) {
            return null;
        }


        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;

//                prev.next=prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return head;

    }
}
