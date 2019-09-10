package c5binarysearchtree;

/**
 * @author Heroin X
 * @date 2019/9/9 15:32
 */
public class BSTTest {
    public static void main(String[] args) {
        BST<Integer> ebst = new BST<>();
        int[] nums={5,2,4,1,8};
        for (int num :nums
             ) {
            ebst.add(num);
        }


        ebst.preOrder();
        System.out.println("ebst2:"+ebst);

    }
}
