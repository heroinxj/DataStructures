package offer.c2;

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
        TreeNode preFirst = new TreeNode(1);


    }

    public void test1(){

    }
}

class TreeNode{
    int data;
    TreeNode leftNext;
    TreeNode rightNext;

    public TreeNode(int data) {
        this.data = data;
    }

    public TreeNode() {
    }
}