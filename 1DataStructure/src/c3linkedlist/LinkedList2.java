package c3linkedlist;

/**
 * 增加了虚拟头结点 dummyHead,针对在任一位置增加元素时遇到的问题
 *
 * 链表有:头结点dummyHead(head)、尾节点、大小size 三个属性
 *
 *    一个内部类Node，包含 元素e和 指针next
 *
 *    confusion:——引用
 *      在删除节点中：
 *          cur=cur.next ；(指针的移动)
 *      VS:
 *          pre.next=delNode.next;
 *          delNode.next=null;
 *
 *
 * @author Heroin X
 * @date 2019/9/2 9:34
 */
public class LinkedList2<E> {


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
     * 真正的头节点（虚拟）
     */
    private Node dummyHead;

    /**
     * 链表大小
     */
    private int size;

    public LinkedList2(){
        this.dummyHead=new Node(null,null);
        this.size=0;
    }

    /**
     * 在链表的index位置添加新元素
     *     一般我们选择了链表的数据结构，就不会做索引插入的操作，练习使用
     *
     * @param e
     * @param index 实际索引是index-1,不过链表中没有这个概念？
     */
    public void add(int index,E e){
        if (index<0||index>size){
            throw new IllegalArgumentException("add failed.index out boundary");
        }

        //因为要找index的前一个节点，所以从dummyHead开始
        Node prev=dummyHead;
        for (int i=0;i<index;i++){
            prev=prev.next;
        }

        Node node = new Node(e);
        node.next=prev.next;
        prev.next=node;
//            prev.next=new Node(e,prev.next);//一替三

        size++;
    }

    /**
     * 链表头节点插入元素
     * @param e
     */
    public void addFist(E e){
        add(0,e);
    }

    public void addLast(E e){
        add(size,e);
    }

    /**
     * 获取index位置处的元素（实际不使用）
     * @param index
     * @return
     */
    public E get(int index){
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException("illegal index");
        }

        // 要找index,故从第一元素开始遍历，注意与上面的区别
        Node cur=dummyHead.next;
        for (int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur.e;
    }

    public E getFirst(){
        return get(0);
    }

    public E getLast(){
        return get(size-1);
    }

    /**
     * 修改元素
     * @param index
     * @param e
     */
    public void set(int index,E e){
//        Node pre = new Node(get(index-1));
//        Node indexNode=pre.next;
//        indexNode.next=new Node(get(index)).next; 自己写的
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException("illegal index");
        }

        Node cur=dummyHead.next;
        for (int i=0;i<index;i++){
            cur=cur.next;
        }
        cur.e=e;
    }


    /**
     * 判断是否包含某个元素
     * @param e
     * @return
     */
    public boolean contains(E e){
        Node cur=dummyHead.next;
        //当前元素不为空时（即不是最后一个元素），都在该循环体中执行。
        while (cur!=null){
            //如果当前元素如果相等，就返回true
            if (cur.e.equals(e)){
                return true;
            }
            //指针一直向后
            cur=cur.next;
        }
        //一直全部遍历结束了，没找到
        return false;
    }

    /**
     * 删除index位置元素，并返回被删除的元素
     * @param index
     * @return
     */
    public E remove(int index){
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException("index error");
        }
        Node prev=dummyHead;
        for (int i=0;i<index;i++){
            prev=prev.next;
        }

        Node remNode=prev.next;
        prev.next=remNode.next;
        remNode.next=null;
        size--;

        //not return (E) remNode;
        return remNode.e;
    }

    public E removeFirst(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size);
    }







    public boolean isEmpty(){
        return size==0;
    }

    @Override
    public String toString() {
        StringBuilder res=new StringBuilder();

        //写法1
//        Node cur=dummyHead.next;
//        while (cur!=null){
//            res.append(cur+"->");
//            cur=cur.next;
//        }

        //等价写法2
        for (Node cur=dummyHead.next;cur!=null;cur=cur.next){
            res.append(cur+"->");
        }

        res.append("NULL");
        return res.toString();
    }


    public Node getDummyHead() {
        return dummyHead;
    }

    public void setDummyHead(Node dummyHead) {
        this.dummyHead = dummyHead;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



}
