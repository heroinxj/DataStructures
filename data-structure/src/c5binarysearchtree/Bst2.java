package c5binarysearchtree;

/**
 * @author Heroin X
 * @date 2019/10/5 18:49
 */
public class Bst2<E extends Comparable<E>> {
    class Node{
        E e;
        Node left;
        Node right;

        public Node(E e) {
            this.e=e;
        }
    }

    Node root;
    int size;

    public Bst2() {
    }

    public Bst2(Node root, int size) {
        this.root = root;
        this.size = size;
    }

    boolean isEmpty(){
        return size==0;
    }

    int getSize(){
        return size;
    }


    /**
     * 1.添加
     * @param e
     */
    void add(E e){
        if (root==null){
//        if (size==0){
            root=new Node(e);
//            root.e=e;
            size++;
        }else {
            add(root,e);
        }
    }

    private void add(Node node,E e){
        if (e.equals(node.e)){
            return;
        } else if (e.compareTo(node.e)>0&&node.right==null){
            root.right=new Node(e);
            size++;
            return;
        }else if (e.compareTo(node.e)<0&&node.left==null){
            root.left=new Node(e);
            size++;
            return;
        }

        //开始递归调用
        if (e.compareTo(node.e)>0){
            add(node.right,e);
        }else {
            add(node.left,e);
        }
    }


    /**
     * 2.搜索
     * @param e
     * @return
     */
    boolean contains(E e){
        return contains(root,e);
    }

    private boolean contains(Node node,E e){
        if (node==null){
            return false;
        }

        if (e.compareTo(node.e)==0){
            return true;
        }else if (e.compareTo(node.e)<0){
            return contains(node.left,e);
        }else {
            return contains(node.right,e);
        }
    }

    /**
     * 3.1 前序遍历
     */
    void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node==null){
            return;
        }

        //简单化表示遍历，直接打印
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * 3.2 中序遍历——表现为顺序排列
     */
    void minOrder(){
        minOrder(root);
    }

    private void minOrder(Node node) {
        if (node==null){
            return;
        }

        minOrder(node.left);
        System.out.println(node.e);
        minOrder(node.right);
    }

    /**
     * 3.3 后序遍历
     */
    void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node) {

        if (node==null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e);
    }


}
