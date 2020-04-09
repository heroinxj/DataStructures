package nowcoder.tree;

import topinterview.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 面试题32-2：从上到下打印二叉树（层序遍历、广度优先遍历）
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。每行打印成单独的一层。
 * @author Heroin X
 * @date 2020/1/8 14:52
 */
public class PrintFromTopToBottom2 {

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

        ArrayList<ArrayList<Integer> > list = new PrintFromTopToBottom2().Print(node1);
        System.out.println(list);
    }
//    链接：https://www.nowcoder.com/questionTerminal/445c44d982d04483b04a54f298796288?f=discussion
//    来源：牛客网

//    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        depth(pRoot, 1, list);
//        return list;
//    }
//
//    private void depth(TreeNode root, int depth, ArrayList<ArrayList<Integer>> list) {
//        if(root == null) {
//            return;
//        }
//
//        if(depth > list.size()){
//            list.add(new ArrayList<Integer>());
//        }
//
//        list.get(depth -1).add(root.val);
//
//        depth(root.left, depth + 1, list);
//        depth(root.right, depth + 1, list);
//    }

    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        // {{},  {},  {}}
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer>  list2= new ArrayList<>();
//        list2.
//        list1.add(list2);
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
//        queue1.p

        if(pRoot == null){
            return list1;
        }

        queue1.offer(pRoot);

        TreeNode node=null;
        while( !queue1.isEmpty() || !queue2.isEmpty()){

            if (queue1.size()==0){
                queue1 = new LinkedList<>(queue2);
                queue2.clear();
                list2 = new ArrayList<>();
                list1.add(list2);
            }



            node = queue1.poll();
            list2.add(node.val);

            if (node.left != null){
                queue2.offer(node.left);
            }

            if (node.right != null){
                queue2.offer(node.right);
            }
        }
        return list1;
    }
}
