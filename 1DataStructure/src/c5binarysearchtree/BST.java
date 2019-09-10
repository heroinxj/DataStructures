package c5binarysearchtree;

/**
 * 二分搜索树
 *
 * @author Heroin X
 * @date 2019/9/7 10:19
 *
 * BST:
 *  Node root
 *  int size
 *
 *      Node:
 *          left, right, e
 *
 */
public class BST<E extends Comparable<E>> {

    /**
     * 内部类
     */
    private class Node{
        public E e;
        public Node right;
        public Node left;


        public Node(E e){
            this.e=e;
            left=null;
            right=null;
        }
    }

    private Node root;
    private int size;


    public BST(){
        root=null;
        size=0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }


    /**
     * 向二分搜索树中 添加新的元素e
     * @param e
     */
    public void add(E e){

        root=add(root,e);
/*        if (root==null){
           root= new Node(e);
           size++;
        }
        else {
            add(root,e);
        }*/

    }

    /**
     * 递归，私有方法，以node为根的二分搜索树中 添加元素e
     * 返回插入新的节点二分搜索树的 根节点
     *
     * @param node
     * @param e
     */
    private Node add(Node node,E e){

        //递归终止条件,改写
        if (node==null){
            size++;
            return new Node(e);
        }

/*        if (e.equals(node.e)){
            return;
        }else if (e.compareTo(node.e)<0&&node.left==null){
            node.left=new Node(e);
            size++;
            return;
        }else if (e.compareTo(node.e)>0&&node.right==null){
            node.right=new Node(e);
            size++;
            return;
        }*/

        // 递归函数
        if (e.compareTo(node.e)<0){
            node.left=add(node.left,e);
        }else if(e.compareTo(node.e)>0){
            node.right=add(node.right,e);
        }
        return node;

    }

    /**
     * 看二分搜索树种是否包含元素e
     * @param e
     * @return
     */
    public boolean contains(E e){
        return contains(root,e);
    }

    /**
     * 看以node为根的二分搜索树种是否包含元素e,递归算法,私有的
     * @param node
     * @param e
     * @return
     */
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
     * 1.二分搜索树的前序遍历，最常用
     */
    public void preOrder(){
        preOrder(root);
    }

    /**
     * 前序遍历以node为根的二分搜索树，递归算法，私有
     * @param node
     */
    private void preOrder(Node node){

        //递归终止条件
        if (node==null){
            return;
        }

        //递归组成的最小逻辑
        System.out.println("preOrder:"+node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * 二分搜索树的中序遍历
     */
    public void inOrder(){
        inOrder(root);
    }

    /**
     * 中序遍历以node为根的二分搜索树，递归算法，私有
     * @param node
     */
    private void inOrder(Node node){
        if (node==null){

        }
    }





















    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        generateBSTString(root,0,res);
        return res.toString();
    }

    /**
     * 生成以node为根节点，深度为depth的描述二叉树的字符串
     * @param node
     * @param depth
     * @param res
     */
    private void generateBSTString(Node node,int depth,StringBuilder res){
        if (node== null){
            res.append(generateDepthSting(depth)+"null\n");
            return;
        }
        res.append(generateDepthSting(depth)+node.e+"\n");
    }

    private String generateDepthSting(int depth){
        StringBuilder res = new StringBuilder();
        for (int i=0;i<depth;i++){
            res.append("--");
        }
        return res.toString();
    }


}
