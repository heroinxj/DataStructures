package c6setmap;

import c5binarysearchtree.BST;

/**
 * @author Heroin X
 * @date 2019/10/8 10:28
 *
 * 以二分搜索树为底层的集合实现
 */
public class BSTSet<E extends Comparable<E>> implements Set<E> {

    private BST<E> bst;

//    public BSTSet(BST<E> bst) {
//        this.bst = bst;
//    }

    public BSTSet(){
        bst=new BST<>();
    }

    @Override
    public void add(E e) {
        bst.add(e);
    }

    @Override
    public void remove(E e) {
        bst.remove(e);
    }

    @Override
    public boolean contains(E e) {
        return bst.contains(e);
    }

    @Override
    public int getSize() {
        return bst.size();
    }

    @Override
    public boolean isEmpty() {
        return bst.isEmpty();
    }
}
