package c4recursion.remove_linkedlist_elements;

/**
 * @author Heroin X
 * @date 2019/9/6 14:53
 *
 * 递归算法来解决
 *
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution3 {

    public static void main(String[] args) {

        int[] nums={1,2,4,6,3,5,6};
        ListNode listNode = new ListNode(nums);
        System.out.println(listNode);
        ListNode listNode1 = new Solution3().removeElements(listNode, 6,0);
        System.out.println(listNode1);
    }

    String generateDepthString(int depth){
        StringBuilder res = new StringBuilder();
        for (int i=0;i<depth;i++){
            res.append("--");
        }
        return res.toString();
    }

    public ListNode removeElements(ListNode head, int val,int depth) {
        String depthString=generateDepthString(depth);
        System.out.print(depthString);
        System.out.println("Call: remove "+val+" in "+ head);

        if (head==null){
            System.out.print("return:"+head);
            return null;
        }

        ListNode listNode = removeElements(head.next, val,depth+1);
        System.out.print(depthString);
        System.out.println("after remove "+val+" : "+listNode);

        if (head.val==val){

            return listNode;
        }else {
            head.next=listNode;

            return head;
        }

//        return head.val==val?head.next:head; 一替四


    }


}
