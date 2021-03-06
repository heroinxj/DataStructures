package c3linkedlist;

/**
 * @author Heroin X
 * @date 2019/9/2 9:21
 *
 * 链表是真正的动态数据结构，之前学的数组、栈、队列本质还是静态的，需要人为的扩size
 * 也是最简单的动态数据结构，可以更深入的理解引用（指针），递归，不需要处理固定容量的问题
 * 缺点在于丧失了随机访问的能力，不能根据索引直接取值？
 *    因为数组在内存中开辟的空间是连续的，直接偏移就可以取到值，故为O(1)的复杂度
 *
 * 因此数组最好用于索引有语义的情况，其最大的优势在于支持快速查询
 * 链表则不适合用于有索引语义的情况，其最大的优点在于动态！！！
 *
 * 数据data存储在node节点中
 *
 */
public class Node {

    Enum e;

    Node next;
}
