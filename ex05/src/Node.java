public class Node {
    String card;
    Node previous;
    Node next;

    public Node(String card) {
        this.card = card;
        this.previous = null;
        this.next = null;
    }
}