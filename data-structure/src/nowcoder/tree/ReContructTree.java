package nowcoder.tree;

import topinterview.TreeNode;

/**
 * 面试题7：重建二叉树
 *
 * @author Heroin X
 * @date 2020/1/6 16:10
 */
public class ReContructTree {

    public static void main(String[] args) {
        int pre[]={1,2,3,4,5,6,7};
        int in[]={3,2,4,1,6,5,7};
        TreeNode treeNode = new ReContructTree().reConstructBinaryTree(pre, in);
        System.out.println(treeNode);
    }


    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {

        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        int len = pre.length - 1;
//        TreeNode node = new TreeNode(pre[0]);
        return reContructTree(pre, 0, len, in, 0, len);

    }

    public TreeNode reContructTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {

        //recrusion end condtion
//        if (node == null||preStart<0||preEnd>=pre.length||inStart<0||inEnd>=in.length) {
//            return node;
//        }

        if (preStart>preEnd || inStart>inEnd){
            return null;
        }

        TreeNode head = new TreeNode(pre[preStart]);

//        int index = 0;
        int index=inStart;
        while (index<inEnd&&in[index] != head.val) {
            index++;
        }

        //find the head in inOrder
        int lLen = index - inStart;
        int rLen = inEnd - index;
        TreeNode node = head;

        node.left = reContructTree(pre, preStart + 1, preStart + lLen, in, inStart, index - 1);
        //node = node;
        node.right = reContructTree(pre, preStart + lLen + 1, preEnd, in, index + 1, inEnd);
        return node;
    }

}


//  public class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode(int x) { val = x; }
//  }
