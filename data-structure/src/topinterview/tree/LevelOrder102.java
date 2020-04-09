package topinterview.tree;

import topinterview.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Heroin X
 * @date 2020/2/7 19:42
 */
public class LevelOrder102 {

    public static void main(String[] args) {
        TreeNode node1 =new TreeNode(3);
        TreeNode node2 =new TreeNode(2);
        node1.left =node2;
        List<List<Integer>> lists = new LevelOrder102().levelOrder(node1);
        System.out.println(lists);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            res.add(list);
            for(int i=0; i<size; i++){
                TreeNode cur = queue.poll();
                list.add(cur.val);

                if(cur.left !=  null){
                    queue.offer(cur.left);
                }
                if(cur.right != null){
                    queue.offer(cur.right);
                }

            }
        }

        return res;
    }
}
