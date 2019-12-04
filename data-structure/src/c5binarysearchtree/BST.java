package c5binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
 * E需要有可比较性
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
     * 1.向二分搜索树中 添加新的元素e
     * @param e
     */
    public void add(E e){
        root=add(root,e);
    }

    /**
     * 递归，私有方法，以node为根的二分搜索树中 添加元素e
     * 返回插入新的节点二分搜索树的 根节点
     *
     * @param node
     * @param e
     */
    private Node add(Node node,E e){

        //递归终止条件,改写,一直找到空节点位置，存值。否则一直向下迭代
        if (node==null){
            size++;
            return new Node(e);
        }

        // 递归函数
        if (e.compareTo(node.e)<0){
            node.left=add(node.left,e);
        }else if(e.compareTo(node.e)>0){
            node.right=add(node.right,e);
        }
        return node;
    }

    /**
     * 2.看二分搜索树种是否包含元素e
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
     * 3.1 二分搜索树的前序遍历，最常用
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
        System.out.println("preOrder- "+node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * 3.2 二分搜索树的中序遍历——排序树
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
            return;
        }
        inOrder(node.left);
        System.out.println("inOrder- "+node.e);
        inOrder(node.right);
    }

    /**
     * 3.3 二分搜索树的后序遍历
     */
    public void postOrder(){
        postOrder(root);
    }

    /**
     * 后序遍历以node为根的二分搜索树，递归
     * @param node
     */
    private void postOrder(Node node){
        if (node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println("postOrder- "+node.e);
    }


    /**
     * 3.1.1 二分搜索树的非递归 前序遍历
     */
    public void preOrderNr(){
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node cur = stack.pop();
            System.out.println(cur.e);

            if (cur.right!=null){
                stack.push(cur.right);
            }
            if (cur.left!=null){
                stack.push(cur.left);
            }
        }

    }

    /**
     * 4. 广度优先遍历——层序遍历
     *
     * 应用于更快的找到问题的解，常用于算法设计中——最短路径
     * 图中也有深度优先遍历和广度优先遍历
     */
    public void levelOrder(){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node cur = queue.remove();
            System.out.println(cur);
            if (cur.left!=null){
                queue.add(cur.left);
            }
            if (cur.right!=null){
                queue.add(cur.right);
            }
        }
    }

    /**
     * 5.1 获取最小值——递归
     * @return
     */
    public E minimum(){
        if (size==0){
            throw new IllegalArgumentException("BST is empty");
        }
        return minimum(root).e;
    }

    private Node minimum(Node node) {
        if(node.left==null){
            return node;
        }

        return minimum(node.left);
    }

    /**
     * 5.2 获取最大值
     * @return
     */
    public E maximum(){
        if (size==0){
            throw new IllegalArgumentException("BST is empty");
        }
        return maximum(root).e;
    }

    private Node maximum(Node node) {
        if (node.right==null){
            return node;
        }
        return maximum(node.right);
    }

    /**
     * 5.3 删除最小元素
     * @return
     */
    public E removeMin(){
        root=removeMin(root);
        return minimum();
    }

    /**
     * 遍历到最左边的子树
     * @param node
     * @return
     */
    private Node removeMin(Node node) {
        if (node.left==null){
            Node rightNode = node.right;
            node.right=null;
            size--;
            return rightNode;
        }
        //产生了一个新的最小值
        node.left = removeMin(node.left);
        return node;
    }


    /**
     * 5.4 删除最大元素
     * @return
     */
    public E removeMax(){
        root=removeMax(root);
        return maximum();
    }

    private Node removeMax(Node node) {
        if (node.right==null){
            Node leftNode = node.left;
            node.left=null;
            size--;
            return leftNode;
        }
        //产生了新的最大值
        node.right=removeMax(node.right);
        return node;
    }

    /**
     * 5.5 删除任意元素
     * @return
     */
    public void remove(E e){
        root=remove(root,e);
    }

    private Node remove(Node node, E e) {
        if (node==null){
            return null;
        }

        if (e.compareTo(node.e)<0){
            node.left=remove(node.left,e);
            return node;
        }else if (e.compareTo(node.e)>0){
            node.right = remove(node.right, e);
            return node;
        }else {
            //e==node.e

            if (node.left == null) {
                Node rightNode=node.right;
                node.right=null;
                size--;
                return rightNode;
            }
            if (node.right==null){
                Node leftNode=node.left;
                node.left=null;
                size--;
                return leftNode;
            }

            Node successor=minimum(node.right);
            successor.right=removeMin(node.right);
            size++;
            successor.left=node.left;
            node.left=node.right=null;
            size--;
            return successor;
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
