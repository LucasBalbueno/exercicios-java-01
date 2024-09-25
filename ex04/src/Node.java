public class Node {
    String action;
    Node previous;
    Node next;

    public Node(String action) {
        this.action = action;
        this.previous = null;
        this.next = null;
    }
}