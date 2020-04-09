package nowcoder.tree;

import topinterview.TreeNode;

import java.util.ArrayList;

/**
 * 面试题34：二叉树中和为某一值的路径
 *
 * @author Heroin X
 * @date 2020/1/11 13:15
 */
public class FindSomePath {

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
//        node3.left=node6;
//        node3.right=node7;

        ArrayList<ArrayList<Integer>> path = new FindSomePath().findPath(node1, 22);
        System.out.println(path);
    }


    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {

        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        if (root == null){
            return list1;
        }

        findPath(root,target,list1,list2);
        return list1;
    }

    void  findPath(TreeNode root, int target, ArrayList<ArrayList<Integer>> list1, ArrayList<Integer> list2) {



        if (root == null){
            return ;
        }

        list2.add(root.val);

        //end condition
        if (root.left == null && root.right == null){
            int sum = 0;
            for (int i=0;i<list2.size();i++){
                sum = sum + list2.get(i);
            }
            if (sum == target){
                list1.add(new ArrayList<>(list2));
//                return ;
            }

            // special
//            list2.remove(list2.size()-1);
//            return ;
        }

        findPath(root.left,target,list1,list2);

        findPath(root.right,target,list1,list2);
        // how to remove the element
        list2.remove(list2.size()-1);
    }
}
