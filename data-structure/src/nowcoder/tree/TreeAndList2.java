package nowcoder.tree;

import topinterview.TreeNode;

/**
 * 面试题35：二叉搜索树与双向链表
 *
 *  输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 *  要求不能创建任何新的结点，只能调整树中结点指针的指向。
 *
 * @author Heroin X
 * @date 2020/1/11 15:53
 */
public class TreeAndList2 {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(12);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(11);
        TreeNode node7 = new TreeNode(16);

        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node6;
        node3.right=node7;

        TreeNode convert = new TreeAndList2().Convert(node1);
        System.out.println(convert);
    }




    TreeNode root = null;
    TreeNode pRoot = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        Convert2(pRootOfTree);
        return pRoot;
    }

    private void Convert2(TreeNode node){

        if(node == null){
            return ;
        }

        Convert2(node.left);
        if(root == null){
            root = node;
            pRoot = node;
        }else {
            root.right = node;
            node.left = root;
            root = root.right;
        }

        Convert2(node.right);
    }

}
