package offer.c2p3;

/**
 *
 *  * 面试题7：重建二叉树
 *  *      输入某个二叉树的前序遍历、后序遍历的结果，请重建该二叉树（假设遍历结果中不包含重复元素）
 *  *
 *  *      递归只有当前状况和下一个状况
 *  *
 *  *      前序：{1,2,4,7,3,5,6,8}---根结点 1
 *  *
 *  *      中序：{4,7,2 ,1, 5,3,8,6}--左子树 4 7 2  ---右子树 5 3 8 6
 * @author Heroin X
 * @date 2019/12/10 9:52
 */
public class RebuildBinaryTree2 {
    public static void main(String[] args) {
        int[] preOrder={1,2,4,7,3,5,6,8};
        int[] inOrder={4,7,2,1,5,3,8,6};
        TreeNode2 root = new RebuildBinaryTree2().rebuild(preOrder, inOrder);
        new RebuildBinaryTree2().printNode(root);
    }

    private void printNode(TreeNode2 root) {
        // 打印结点的终止条件
        if (root==null){
            return;
        }
        printNode(root.left);
        System.out.print(root.data+" ");
        printNode(root.right);
    }

    public TreeNode2 rebuild(int[] preOrder,int[] inOrder){
        return rebuild(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length-1);
    }

    private TreeNode2 rebuild(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd) {
        // 终止条件
        if (preStart>preEnd||inStart>inEnd){
            return null;
        }

        //找到头结点在中序遍历的位置
        TreeNode2 root = new TreeNode2(preOrder[preStart]);
        int i=0;
        //前提是：前中序遍历的输入一定是正确的，否则需要加上 i<inEnd
        while (inOrder[i]!=root.data){
            i++;
        }

        //传给到下一次呢 i=3
        // 前序：{1,2,4,7,3,5,6,8}---   根结点 1
        // 中序：{4,7,2 ,1, 5,3,8,6}--- 左子树 4 7 2  ---右子树 5 3 8 6


        root.left=rebuild(preOrder,preStart+1,preStart+(i-inStart),inOrder,inStart,i-1);
        root.right=rebuild(preOrder,preStart+(i-inStart)+1,preEnd,inOrder,i+1,inEnd);

        //传给到下一次呢 i=3
        // 前序：{1,2,4,7,3,5,6,8}---   根结点 1
        // 中序：{4,7,2 ,1, 5,3,8,6}--- 左子树 4 7 2  ---右子树 5 3 8 6

        //1.正确的
//        root.left=rebuild(preOrder,preStart+1,preStart+i-inStart,inOrder,inStart,i-1);
//        root.right=rebuild(preOrder,preStart+i+1-inStart,preEnd,inOrder,i+1,inEnd);

        //2.80%正确
//        root.left=rebuild(preOrder,preStart+1,preStart+i-inStart,inOrder,inStart,inStart+i-1);
//        root.right=rebuild(preOrder,preStart+i+1-inStart,preEnd,inOrder,inStart+i+1,inEnd);

        //3.错误
//        root.left=rebuild(preOrder,preStart+1,preStart+i,inOrder,inStart,inStart+i-1);
//        root.right=rebuild(preOrder,preStart+i+1,preEnd,inOrder,inStart+i+1,inEnd);

        return root;
    }
}

class TreeNode2{
     int data;
     TreeNode2 left;
     TreeNode2 right;

    TreeNode2(){}

    TreeNode2(int data){
        this.data=data;
    }
}