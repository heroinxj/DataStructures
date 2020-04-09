package topinterview.tree;

import topinterview.TreeNode;

import java.util.Stack;

/**
 * @author Heroin X
 * @date 2020/1/22 11:31
 */
public class KthSmallest230 {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(2);
//        TreeNode node5 = new TreeNode(7);
//        TreeNode node6 = new TreeNode(11);
//        TreeNode node7 = new TreeNode(16);

        node1.left=node2;
        node1.right=node3;
        node2.right=node4;

        int i = new KthSmallest230().kthSmallest(node1, 1);
        System.out.println(i);
    }

    int value = 0, k1=0;
    public int kthSmallest(TreeNode root, int k) {

        //inOrder + count
        k1=k;
        TreeNode treeNode = kthSmallest2(root, k);
        return treeNode.val;

    }

    TreeNode kthSmallest2(TreeNode root,int k) {

        if(root == null){
            return null;
        }

        kthSmallest2(root.left,k);
        k1--;
        if(k1 == 0){
            return root;
        }
        kthSmallest2(root.right,k);

        return root;
    }

    void test(){
//        Character
        String s ="sssa";
//        Arrays.sort();
        char[] chars = s.toCharArray();
//        char c = s.charAt();
        Stack<Object> objects = new Stack<>();
//        objects.add();

    }
}
