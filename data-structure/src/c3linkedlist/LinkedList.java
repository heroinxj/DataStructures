package c3linkedlist;

/**
 * 单向链表
 *
 * @author Heroin X
 * @date 2019/9/2 9:34
 */
public class LinkedList<E> {


    /**
     * 内部类（可以用static修饰）
     */
    private class Node{
        //元素
        public E e;
        //指向node的引用
        public Node next;


        public Node() {
            this.e=null;
            this.next=null;
        }

        public Node(E e){
            this.e=e;
            this.next=null;
        }

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        @Override
        public String toString() {
//            return super.toString();
            return e.toString();
        }
    }

    /**
     * 头节点 head
     */
    private Node head;

    /**
     * 链表大小
     */
    private int size;


    public LinkedList(){
        this.head=null;
        this.size=0;
    }


    /**
     * 链表头节点插入元素
     * @param e
     */
    public void addFist(E e){
        Node newNode = new Node(e);
        newNode.next=head;
        //?,头结点变成真正的头结点，而不是以前失效的头结点！
        head=newNode;
//        head = new Node(e, head);//代替前面三句

        size++;
    }


    /**
     * 在链表的index位置添加新元素
     *     一般我们选择了链表的数据结构，就不会做索引插入的操作，练习使用
     *
     * @param e
     * @param index 实际索引是index-1,不过链表中没有这个概念？
     */
    public void add(E e,int index){
        if (index<0||index>size){
            throw new IndexOutOfBoundsException("add failed.index out boundary");
        }
        if (index==0){
            addFist(e);
        }else {

            //找到第index个节点，需要类似计数
            /**
             * （1）将查找的指针定位到头结点
             * （2）根据头结点的next指针定位到第2个节点
             * （3）重复（2），依次查找。
             */
            Node prev=head;
            for (int i=0;i<index-1;i++){
                prev=prev.next;
            }

            Node newNode = new Node(e);
            newNode.next=prev.next;
            prev.next=newNode;
//            prev.next=new Node(e,prev.next);//一替三

            size++;
        }
    }


    public void addLast(E  e){
        add(e,size);
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }
}
