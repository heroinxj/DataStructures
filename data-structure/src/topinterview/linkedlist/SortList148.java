package topinterview.linkedlist;

import topinterview.ListNode;

import java.util.ArrayList;

/**
 * @author Heroin X
 * @date 2020/1/18 12:29
 */
public class SortList148 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode listNode = new SortList148().sortList(node1);
        System.out.println(listNode);
    }

    public ListNode sortList(ListNode head) {

        if(head == null){
            return null;
        }

        ArrayList<ListNode> list = new ArrayList<>();

        while(head != null){
            list.add(head);
            head = head.next;
        }

        mergeSort(list, 0, list.size()-1);
        for(int i=0; i<list.size()-1; i++){
            list.get(i).next = list.get(i+1);

        }
        return list.get(0);

    }

    void mergeSort(ArrayList<ListNode> list, int start, int end ){
        int mid = (start + end)/2;
        //cursive
        if(start < end){
            mergeSort(list, start, mid);
            mergeSort(list, mid+1, end);
            merge(list, start, mid, end);
        }
    }

    void merge(ArrayList<ListNode> list, int start, int mid, int end ){

        int i = start;
        int j = mid+1;
        int index = 0;

        ArrayList<ListNode> temp = new ArrayList<>();


        while(i<=mid && j<= end){
            if(list.get(i).val <= list.get(j).val){
                temp.add(index,list.get(i));
                i++;
            }else{
                temp.add(index,list.get(j));
                j++;
            }
            index++;
        }

        while(i <= mid){
            temp.add(index,list.get(i));
            i++;
            index++;
        }

        while(j<=end){
            temp.add(index, list.get(j));
            j++;
            index++;
        }

        //
        for(int k =0; k < temp.size(); k++){
            list.add(k+start, temp.get(k));
        }

    }
}
