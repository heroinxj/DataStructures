package topinterview.linkedlist;

import topinterview.Node;

/**
 * @author Heroin X
 * @date 2020/1/18 16:55
 */
public class CopyRandomList138 {

    public static void main(String[] args) {

    }

    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }

        Node root =head;

        while(head != null){
            Node temp = head.next;
            Node copyNode = new Node(head.val,head.next,head.random);
            head.next = copyNode;
            copyNode.next = temp;
            head =temp;
        }

        head = root;

        // add random pointer
        while(head.next !=null){
            Node copy = head.next;
            copy.random = head.random.next;
            head = head.next.next;
        }

        head = root;
        Node copyHead = new Node();
        //split
        while(head.next != null){
            copyHead.next = head.next;
            head = head.next.next;
        }
        return copyHead.next;
    }
}
