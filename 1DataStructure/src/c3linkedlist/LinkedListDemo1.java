package c3linkedlist;

/**
 * @author Heroin X
 * @date 2019/9/2 9:56
 */
public class LinkedListDemo1<E>{
    public static void main(String[] args) {
        LinkedList2<Integer> linkedList2 = new LinkedList2<>();

        //addFirst是O(1),对数组addLast是O(1)
        for (int i=0;i<5;i++){
            linkedList2.addFist(i);
            System.out.println(linkedList2);
        }
        linkedList2.add(2,100);
        System.out.println(linkedList2);

        linkedList2.remove(2);
        System.out.println(linkedList2);


    }





}
