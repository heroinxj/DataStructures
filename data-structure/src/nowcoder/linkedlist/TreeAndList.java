package nowcoder.linkedlist;

/**
 * 面试题35：二叉搜索树与双向链表
 *
 * @author Heroin X
 * @date 2020/1/5 14:42
 */
public class TreeAndList {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(12);
        TreeNode node6 = new TreeNode(11);
        TreeNode node7 = new TreeNode(15);

        TreeNode node8 = new TreeNode(1);
        TreeNode node9 = new TreeNode(4);
        TreeNode node10 = new TreeNode(6);
        TreeNode node11 = new TreeNode(8);

        node3.left=node8;
        node3.right=node9;
        node4.left=node10;
        node4.right=node11;


        node1.left=node2;
        node1.right=node5;
        node2.left=node3;
        node2.right=node4;
        node5.left=node6;
        node5.right=node7;
        TreeNode convert = new TreeAndList().Convert(node1);
        //System.out.println(convert);

    }

    TreeNode head = null;
    TreeNode realHead = null;

    public TreeNode Convert(TreeNode pRootOfTree) {

        ConvertSub(pRootOfTree);
        return realHead;
    }

    private void ConvertSub(TreeNode pRootOfTree) {

        if(pRootOfTree==null) return;

        ConvertSub(pRootOfTree.left);

        if (head == null) {
            head = pRootOfTree;
            realHead = pRootOfTree;
        } else {
            head.right = pRootOfTree;
            pRootOfTree.left = head;
            head = pRootOfTree;
        }

        ConvertSub(pRootOfTree.right);
    }



//    public TreeNode Convert(TreeNode pRootOfTree) {
//        if(pRootOfTree==null){
//            return null;
//        }
//        TreeNode head =new TreeNode(0);
//        TreeNode head2 =head;
//        TreeNode pHead=pRootOfTree;
//        TreeNode node1= buildList(pRootOfTree.left,head,head2);
//        TreeNode node2= buildList(pRootOfTree.right,head,head2);
//
//        return node1;
//
//    }


//    TreeNode buildList(TreeNode node,TreeNode head,TreeNode pHead){
//        //TreeNode firstHead=node;
//        //recursion condition
//        if (node.left==null && node.right==null){
//            return node;
//        }
//
//        //left recursion
//        head.right=buildList(node.left,head,pHead);
//        head=head.right;
//
//        //mid
//        head.right=node;
//        head=head.right;
//
//        //right recursion
//        head.right=buildList(node.right,head,pHead);
//        head=head.right;
//
//        return pHead.right;
//    }
}


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}