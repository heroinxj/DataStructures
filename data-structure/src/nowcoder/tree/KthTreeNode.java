package nowcoder.tree;


import topinterview.TreeNode;

/**
 *
 * 面试题 54：二叉搜索树的第k大结点
 *
 * @author Heroin X
 * @date 2020/1/16 22:47
 */
public class KthTreeNode {

    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(14);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(8);
        TreeNode node6 = new TreeNode(12);
        TreeNode node7 = new TreeNode(16);

        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node6;
        node3.right=node7;

        TreeNode treeNode = new KthTreeNode().KthNode(node1, 1);
        System.out.println(treeNode);

    }

    TreeNode KthNode(TreeNode pRoot, int k)
    {

        if(pRoot == null){
            return null;
        }

        if(k<1){
            return null;
        }
        System.out.println();
//        ArrayList<Object> objects = new ArrayList<>();
//        objects.is
        TreeNode node1 = pRoot.left;
        TreeNode node2 = pRoot.right;

        KthNode(node1,k);
        KthNode(node2,k);

        if(k==1){
            return pRoot;
        }

        k--;

        return null;

    }


}
