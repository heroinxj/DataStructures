package offer.c2p3;

/**
 * 面试题8：二叉树的下一个结点
 *      给定一颗二叉树和其中的一个结点，如何找出 中序遍历 序列的下一个结点？
 *      （树中的结点有3个指针分别指向左、右子结点、父结点）
 *
 *      给出中序遍历{d,b,h,e,i,s,f,c,g}
 *
 * @author Heroin X
 * @date 2019/12/10 13:42
 */
public class NextNode {
    public static void main(String[] args) {
        char[] inOrder={'d','b','h','e','i','s','f','c','g'};

        TreeNode<String> root = new TreeNode<>("a");
        TreeNode<String> l1 = new TreeNode<>("b");
        TreeNode<String> r1 = new TreeNode<>("c");
        TreeNode<String> l21 = new TreeNode<>("d");
        TreeNode<String> r21 = new TreeNode<>("e");
        TreeNode<String> l22 = new TreeNode<>("f");
        TreeNode<String> r22 = new TreeNode<>("g");
        TreeNode<String> l32 = new TreeNode<>("h");
        TreeNode<String> r32 = new TreeNode<>("i");

        root.leftNext=l1;
        root.rightNext=r1;
        l1.leftNext=l21;
        l1.rightNext=r21;
        l1.superNext=root;
        r1.leftNext=l22;
        r1.rightNext=r22;
        r1.superNext=root;
        r21.leftNext=l32;
        l21.superNext=l1;
        r21.superNext=l1;
        r21.rightNext=r32;

        l22.superNext=r1;
        r22.superNext=r1;

        l32.superNext=l21;
        r32.superNext=l21;

        TreeNode nextNode = new NextNode().getNextNode( l1);
        System.out.println(nextNode.data);
    }

    public TreeNode getNextNode(TreeNode node){
//    public TreeNode getNextNode(char[] inOrder,TreeNode node){
        if (node==null){
            return null;
        }

        //有右子树的情况下，找到右子树中最左结点
        if (node.rightNext!=null){
            node = node.rightNext;
            while (node.leftNext!=null){
                node=node.leftNext;
            }
            return node;
        }

        //没有右子树的情况下，  递归到最初的父结点
        while (node.superNext!=null){
            if (node.superNext.leftNext==node){
                return node.superNext;
            }
            return null;
        }
        return null;
    }

}



