package nowcoder.tree;

/**
 * 面试题33：二叉搜索树的后序遍历序列
 *
 * @author Heroin X
 * @date 2020/1/10 15:15
 */
public class VerifySquenceOfBST {

    public boolean VerifySquenceOfBST(int [] sequence) {

        if(sequence.length<1){
            return false;
        }

        return VerifySquenceOfBST(sequence,0,sequence.length-1);
    }

    boolean VerifySquenceOfBST(int [] sequence,int start,int end){

        if(end<=start){
            return true;
        }

        // normal situation
        int root = sequence[end];

        int index = start;

        while(sequence[index] < root && index < end ){
            index++;
//            if(index >end-1 ){
//                return false;
//            }
        }

        for(int i = index; i<end; i++){
            if(sequence[i] < root){
                return false;
            }
        }

        return VerifySquenceOfBST(sequence,start,index-1) && VerifySquenceOfBST(sequence,index,end-1);
    }
}
