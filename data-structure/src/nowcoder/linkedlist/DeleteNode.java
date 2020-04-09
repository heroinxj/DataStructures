package nowcoder.linkedlist;

/**
 * 面试题18-1：删除链表的头结点
 *
 * @author Heroin X
 * @date 2020/1/2 21:16
 */
public class DeleteNode {
    public static void main(String[] args) {

    }

    public ListNode deleteOneNode(ListNode head,ListNode delNode){

        //error input
        if (head==null || delNode==null){
            return null;
        }

        //delNode is the first one
        if (head.next==null){
            head=null;
            return head;
        }

        ListNode curNode=head;

        //delNode is the last one
        if (delNode.next==null){
            while (curNode.next!=delNode){
                curNode=curNode.next;
            }
            curNode.next=null;
            delNode=null;
            return head;
        }

        //generally
        curNode=delNode.next;
        delNode.val=curNode.val;
        delNode.next=curNode.next;
        curNode.next=null;

        //other
//        curNode=delNode.next;
//        delNode=curNode;
//        curNode.next=null;

        return head;
    }
}
