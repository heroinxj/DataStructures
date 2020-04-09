package c5binarysearchtree;

/**
 * @author Heroin X
 * @date 2020/12/29 15:32
 */
public class BSTTest {
    public static void main(String[] args) {
        BST<Integer> ebst = new BST<>();
        int[] nums={5,3,6,8,4,2};
        for (int num :nums) {
            ebst.add(num);
        }

        ebst.preOrder();
        System.out.println();
        ebst.inOrder();
        System.out.println();
        ebst.postOrder();



    }
}
