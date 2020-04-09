package offer.c2p3;


/**
 * 面试题7：重建二叉树
 *      输入某个二叉树的前序遍历、后序遍历的结果，请重建该二叉树（假设遍历结果中不包含重复元素）
 *
 *      递归只有当前状况和下一个状况
 *
 *      前序：{1,2,4,7,3,5,6,8}---根结点 1
 *
 *      中序：{4,7,2 ,1, 5,3,8,6}--左子树 4 7 2  ---右子树 5 3 8 6
 *
 * @author Heroin X
 * @date 2019/12/3 14:01
 */
public class RebuildBinaryTree {
    public static void main(String[] args) {

        int[] preOrder={1,2,4,7,3,5,6,8};
        int[] inOrder={4,7,2,1,5,3,8,6};
        TreeNode root= new RebuildBinaryTree().rebuild(preOrder,inOrder);
        new RebuildBinaryTree().print(root);

    }

    private void print(TreeNode root) {
        //判断条件!!!
        if (root!=null){
            print(root.leftNext);
            System.out.print(root.data+" ");
            print(root.rightNext);
        }
    }

    TreeNode rebuild(int[] preOrder, int[] inOrder) {
        if (preOrder==null||inOrder==null){
            return null;
        }
        return rebuild(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length-1);
    }

    /**
     *
     * @param preOrder 前序
     * @param preStart 前序开始元素位置
     * @param preEnd 前序结束位置
     * @param inOrder 中序
     * @param inStart 中序开始位置
     * @param inEnd 中序结束位置
     * @return 结点
     *
     *  *      前序：{1,2,4,7,3,5,6,8}---根结点 1
     *  *
     *  *      中序：{4,7,2 ,1, 5,3,8,6}--左子树 4 7 2  ---右子树 5 3 8 6
     */
    private TreeNode rebuild(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd) {

        //终止条件!!!   递归要注意出口，假设最后只有一个元素了，那么就要返回。
        if (preStart>preEnd || inStart>inEnd){
            return null;
        }

        //根结点
        TreeNode root = new TreeNode(preOrder[preStart]);
        int rootData = (int) root.data;
        //在中序遍历中找到根结点的位置，进而在前序遍历中找到左右子树元素
        int rootIndexInMin=inStart;
        while (rootIndexInMin<inEnd && inOrder[rootIndexInMin]!=rootData){
            rootIndexInMin++;
        }

        // 前序：{1,2,4,7,   3,5,6,8}---根结点 1
        // 中序：{4,7,2 ,1, 5,3,8,6}--左子树 4 7 2  ---右子树 5 3 8 6  4 7 2 1 5 3 8 6
        // preStart=0  inStart=0
        // rootIndexInMin=3
//        root.leftNext=rebuild(preOrder,preStart+1,preStart+rootIndexInMin-inStart,inOrder,inStart,rootIndexInMin-1);
//        root.rightNext=rebuild(preOrder,preStart+rootIndexInMin-inStart+1,preEnd,inOrder,rootIndexInMin+1,inEnd);
        root.leftNext=rebuild(preOrder,preStart+1,preStart+rootIndexInMin-inStart,inOrder,inStart,rootIndexInMin-1);
        root.rightNext=rebuild(preOrder,preStart+(rootIndexInMin-inStart)+1,preEnd,inOrder,rootIndexInMin+1,inEnd);

        return root;
    }
}

class TreeNode<E>{
    E data;
    TreeNode leftNext;
    TreeNode rightNext;
    TreeNode superNext;

    public TreeNode(E data) {
        this.data = data;
    }

    public TreeNode() {
    }
}