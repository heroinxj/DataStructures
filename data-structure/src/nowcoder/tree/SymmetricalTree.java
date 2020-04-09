package nowcoder.tree;
import topinterview.TreeNode;
/**
 *
 * 面试题28 ：对称的二叉树
 *      请实现一个函数，用来判断一颗二叉树是不是对称的。
 *      注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 *
 * @author Heroin X
 * @date 2020/1/8 10:47
 */
public class SymmetricalTree {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(8);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(6);
//        TreeNode node3 = new TreeNode(9);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(7);
//        TreeNode node7 = new TreeNode(5);
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node6;
//        node3.right=node7;

        boolean symmetrical = new SymmetricalTree().isSymmetrical(node1);
        System.out.println(symmetrical);
    }


    boolean isSymmetrical(TreeNode pRoot){
        TreeNode root = pRoot;
        //1.copy the tree to tree1
        TreeNode copyNode = copyTree(root);
        TreeNode copyHead = copyNode;

        //2.get the mirror of the tree1
        getMirror(copyNode);

        //traversal two tree,judge
        return traversal(pRoot,copyHead);

    }

    //copy tree
    TreeNode copyTree(TreeNode root){
        if (root==null){
            return null;
        }
        TreeNode head = new TreeNode(root.val);
        TreeNode pHead = head;
        copyTree(root,head);
        return pHead;
    }

    void copyTree(TreeNode root,TreeNode root1){
        if (root==null){
            return ;
        }
        root1.left=copyTree(root.left);
        root1.right=copyTree(root.right);
    }


    void getMirror(TreeNode node){
        if(node==null){
            return ;
        }

        TreeNode tempNode = node.left;
        node.left = node.right;
        node.right = tempNode;
        getMirror(node.left);
        getMirror(node.right);
        //return node;
    }

    boolean traversal(TreeNode node1,TreeNode node2){

        if(node1==null && node2 ==null){
            return true;
        }

        if(node1==null || node2==null){
            return false;
        }

        if(node1.val != node2.val){
            return false;
        }

        return traversal(node1.left,node2.left) && traversal(node1.right,node2.right);
    }
}
