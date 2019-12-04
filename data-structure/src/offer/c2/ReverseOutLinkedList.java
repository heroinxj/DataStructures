package offer.c2;

import java.util.Stack;

/**
 * 链表节点
 */
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
    Node(){}
}

/**
 * 面试题6：从尾到头打印链表
 *      输入一个链表的头结点，倒序输出每个节点的值
 *
 * @author Heroin X
 * @date 2019/12/2 20:26
 */
public class ReverseOutLinkedList {

    public static void main(String[] args) {
        //给出头结点
        Node headNode = new Node(1);
        //链表赋值
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(2);
        Node node5 = new Node(5);
        headNode.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;

        //new ReverseOutLinkedList().test1(headNode);
        new ReverseOutLinkedList().test2(headNode);
    }

    public void test1(Node headNode){

        Stack<Integer> stack = new Stack<>();
        /**
         * 1.用头结点可以找到这个链表  {1,3,4,2,5}
         * 2.怎么知道长度，不知道长度怎么遍历——最后一个 指针为空值的时候遍历停止呗
         */
        while (headNode!=null){
            stack.push(headNode.data);
            headNode=headNode.next;
        }
        //stack.push(headNode.data);
        System.out.println("倒序输出：");
        while (stack.size()!=0){
            System.out.print(stack.pop() );
        }
    }

    public void test2(Node headNode){
        //{1, 3, 4, 2, 5}
        if (headNode!=null){
//            while (headNode.next!=null){ //错误写法
            int data = headNode.data;
            if (headNode.next!=null){
                headNode=headNode.next;
                test2(headNode);
            }
            System.out.print(data+" ");
        }
    }
}

