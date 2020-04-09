package nowcoder.tree;

import topinterview.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 面试题32-3：按之字形顺序打印二叉树
 *
 * @author Heroin X
 * @date 2020/1/9 10:24
 */
public class PrintFromTopToBottom3 {
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

        ArrayList<ArrayList<Integer>> list = new PrintFromTopToBottom3().Print(node1);
        System.out.println(list);
    }

    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer> > list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        if(pRoot == null){
            return list1;
        }

        list1.add(list2);

        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();

        queue1.offer(pRoot);
        TreeNode node;
        Stack<TreeNode> stack = new Stack<>();
        int c=1;
        Queue<TreeNode> q = null;

        while(!queue1.isEmpty() || !queue2.isEmpty() ){

            if(queue1.isEmpty()){
                c++;
                stack = new Stack<>();
                queue1 = new LinkedList<>(queue2);
                q=new LinkedList<>(queue1);
                queue2.clear();
                list2 = new ArrayList<>();
                list1.add(list2);
            }

            if(c%2==0){
                while (!q.isEmpty()){
                    stack.push(q.poll());
                }
                list2.add(stack.pop().val);
                node=queue1.poll();
            }else{
                node = queue1.poll();
                list2.add(node.val);
            }


            if(node.left != null){
                queue2.offer(node.left);
            }

            if(node.right != null){
                queue2.offer(node.right);
            }

        }
        return list1;
    }

}
