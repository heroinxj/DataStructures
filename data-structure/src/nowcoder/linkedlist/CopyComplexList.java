package nowcoder.linkedlist;

import java.util.HashMap;

/**
 * 面试题35,：复杂链表的复制
 *
 * @author Heroin X
 * @date 2020/1/4 19:54
 */
public class CopyComplexList {


    public static void main(String[] args) {
        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        RandomListNode node4 = new RandomListNode(4);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;

        node1.random=node3;
        node2.random=node4;

        new CopyComplexList().Clone(node1);

    }

    public RandomListNode Clone(RandomListNode pHead){
        RandomListNode head = new RandomListNode(1);
        RandomListNode root = head;
        RandomListNode pRoot = pHead;
        HashMap<RandomListNode,RandomListNode> hash=new HashMap<>();

        if(pHead==null){
            return null;
        }

        while(pHead!=null){
            head.next=new RandomListNode(pHead.label);

            hash.put(pHead,pHead.random);
            head=head.next;
            pHead=pHead.next;
        }

        head=root;
        pHead=pRoot;

        // while(head!=null) ,nullPointerException
        while(head.next!=null){
            head.next.random=hash.get(pHead);
            head=head.next;
            pHead=pHead.next;
        }
        System.out.println(root);
        return root.next;
    }
}


 class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}