package nowcoder.tree;

import topinterview.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 面试题32-1：从上到下打印二叉树（层序遍历、广度优先遍历）
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @author Heroin X
 * @date 2020/1/8 9:39
 */
public class PrintFromTopToBottom {

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

        ArrayList<Integer> integers = new PrintFromTopToBottom().printFromTopToBottom(null);
        System.out.println(integers);
    }

    public ArrayList<Integer> printFromTopToBottom(TreeNode root) {


        ArrayList<Integer>  list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return list;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            list.add(node.val);
            if(node.left != null){
                queue.offer(node.left);
            }
            if(node.right != null){
                queue.offer(node.right);
            }
        }

        return list;
    }
}
