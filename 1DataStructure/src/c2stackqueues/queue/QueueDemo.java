package c2stackqueues.queue;

/**
 * @author Heroin X
 * @date 2019/8/14 10:52
 */
public class QueueDemo {
    public static void main(String[] args) {
        ArrayQueue<Integer>  arr=new ArrayQueue<>();
        for (int i=0;i<10;i++){
            arr.enqueue(i);
            System.out.println(arr);
        }
    }
}
