package c2stackqueues.stack;

import c1array.Array2;

/**
 * 基于数组实现的 栈
 * @author Heroin X
 * @date 2019/8/13 21:11
 *
 * 与接口无关的类，只在此处写就ok了——一种设计思想
 */
public class ArrayStack<E> implements Stack<E> {

    private Array2<E> array;

    public ArrayStack(){
        array=new Array2<>();
    }

    public ArrayStack(int capacity){
        array=new Array2<>(capacity);
    }

    //入栈
    @Override
    public void push(E e) {
        array.addLast(e);
    }

    //出栈
    @Override
    public E pop() {
        return array.removeLast();
    }

    //查栈顶元素
    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    //获取容量
    public int getCapacity(){
        return array.getCapacity();
    }

    @Override
    public String toString() {
        StringBuilder res=new StringBuilder();
        res.append("Stack: ");
        res.append('[');
        for (int i=0;i<array.getSize();i++){
//            res.append("array[i]");
            res.append(array.get(i));
            if (i!=array.getSize()-1){
                res.append(", ");
            }
        }
        res.append("] top");
        return res.toString();
    }
}
