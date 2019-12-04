package c3linkedlist;

import c2stackqueues.queue.Queue;

/**
 * 基于链表实现的队列
 *
 *    增加了头结点、尾节点、大小
 *
 * @author Heroin X
 * @date 2019/9/3 15:27
 */
public class LinkedListQueue<E> implements Queue<E> {

    public  class Node{
        public E e;
        public Node next;

        public Node(E e,Node next){
            this.e=e;
            this.next=next;
        }

        public Node(E e){
            this.e=e;
            this.next=null;
        }

        public Node(){
            this.e=null;
            this.next=null;
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    /**
     * 不是虚拟头结点
     */
    private Node head;

    /**
     * 尾节点
     */
    private Node tail;

    private int size;

    public LinkedListQueue(){
        head=null;
        tail=null;
        size=0;
    }

/*    @Override
    public void enqueue(E e) {

        Node insertNode=new Node(e);
        tail.next=insertNode;

        insertNode.next=null;
        size++;
    }*/


    @Override
    public void enqueue(E e){
        if (tail==null){
            tail=new Node(e);
            head=tail;
        }else {
            // 有next就想到指向，否则就是赋值
            tail.next=new Node(e);
            // 指针向后移动非常重要，否则后面再添加一个点时，就会有bug
            tail=tail.next;
        }
        size++;
    }


    /**
     * 出队列
     * @return
     */
    @Override
    public E dequeue() {
        if (isEmpty()){
            throw new IndexOutOfBoundsException("cann't dequeue from an empty queue");
        }else {
            Node deNode=head;
            head=head.next;
            deNode.next=null;
            if (head==null){
                tail=null;
            }
            size--;
            return deNode.e;


        }
    }

    @Override
    public E getFront() {
        if (isEmpty()){
            throw new IndexOutOfBoundsException("cann't dequeue from an empty queue");
        }
        return head.e;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        /*Node cur=head.next;
        while (cur.next!=tail){
            if (cur.equals(null)){
                return true;
            }
            cur=cur.next;
        }
        return false;*/
        return size==0;
    }

    @Override
    public String toString() {
/*        return "LinkedListQueue{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';*/

        StringBuilder res = new StringBuilder();
        res.append("Queue: front ");

        Node curNode=head;
        while (curNode!=null){
            res.append(curNode+"->");
            curNode=curNode.next;
        }
        res.append("NUll tail");
        return res.toString();
    }

    public static void main(String[] args) {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();

        for (int i=0;i<5;i++){
            queue.enqueue(i);
            System.out.println(queue);
        }

        queue.dequeue();
        System.out.println(queue);
    }

}
