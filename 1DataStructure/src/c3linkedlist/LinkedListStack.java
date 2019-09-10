package c3linkedlist;

import c2stackqueues.stack.Stack;

/**
 * 基于链表实现的栈
 *
 * @author Heroin X
 * @date 2019/9/3 10:28
 */
public class LinkedListStack<E> implements Stack<E> {

    private LinkedList2<E> list;

    /**
     * 构造函数，初始化list，初始化的作用 ???
     *
     * 没有容积的概念,不用写 size
     */
    public LinkedListStack(){
        list=new LinkedList2<>();
    }


    @Override
    public void push(E e) {
        list.addFist(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
//        return "LinkedListStack{" +
//                "list=" + list +
//                '}';
        StringBuilder res = new StringBuilder();
        res.append("stack:top ");
        res.append(list);
        return res.toString();

    }

    /**
     * 链表栈的 测试类
     * @param args
     */
//    public static void main(String[] args) {
//        LinkedListStack<Integer> stack = new LinkedListStack<>();
//
//        for (int i=0;i<5;i++){
//            stack.push(i);
//            System.out.println(stack);
//        }
//
//        stack.pop();
//        System.out.println(stack);
//    }



}
