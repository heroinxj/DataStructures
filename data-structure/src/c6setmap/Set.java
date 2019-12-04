package c6setmap;

/**
 * 集合的接口
 *
 * @author Heroin X
 * @date 2019/10/8 10:25
 *
 * 可以去重，因为二分搜索树底层也是没有重复元素的，故选择BST
 *
 * 应用：客户量统计，词汇量统计
 */
public interface Set<E> {

    void add(E e);
    void remove(E e);
    boolean contains(E e);
    int getSize();
    boolean isEmpty();

}
