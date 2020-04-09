package topinterview;

/**
 * @author Heroin X
 * @date 2020/1/18 16:54
 */
public class Node {

    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
}
