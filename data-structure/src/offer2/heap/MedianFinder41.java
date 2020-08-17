package offer2.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/** 面试题41. 数据流中的中位数-困难
 * @author Heroin X
 * @date 2020/5/21 20:23
 */
public class MedianFinder41 {

    public static void main(String[] args) {

    }


    /** initialize your data structure here. */
    List<Integer> list;
    public MedianFinder41() {
        list = new ArrayList<>();
    }

    public void addNum(int num) {
        list.add(num);
    }

    public double findMedian() {

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        int size = list.size();
        double tmp = 0;
        if (size % 2 == 0){
            double a1 = list.get(size/2-1);
            double a2 = list.get(size/2);
            tmp = (a1+a2)/2;
        }else{
            double a = list.get(size/2);
            tmp = a/2;
        }

        return tmp;
    }



//    Queue<Integer> A, B;
//    public MedianFinder41() {
//        // 小顶堆，保存较大的一半
//        A = new PriorityQueue<>();
//        // 大顶堆，保存较小的一半
//        B = new PriorityQueue<>((x, y) -> (y - x));
//    }
//
//    public void addNum(int num) {
//        if(A.size() != B.size()) {
//            A.add(num);
//            B.add(A.poll());
//        } else {
//            B.add(num);
//            A.add(B.poll());
//        }
//    }
//    public double findMedian() {
//       return A.size() != B.size() ? A.peek() : (A.peek() + B.peek()) / 2.0;
//    }

}
