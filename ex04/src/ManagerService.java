public class ManagerService {
    private Node current;
    private Node head;
    private Node tail;

    public ManagerService() {
        this.current = null;
        this.head = null;
        this.tail = null;
    }

    public void addAction(String action) {
        Node newNode = new Node(action);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }
        current = newNode;
    }

    public String undoAction() {
        if (current == null) {
            return "No action to undo";
        }
        String undoAction = current.action;
        current = current.previous;
        return undoAction;
    }

    public String redoAction() {
        if (current == null || current.next == null) {
            return "No action to redo";
        }
        current = current.next;
        return current.action;
    }

    public void getActions() {
        Node node = head;
        while (node != null) {
            System.out.println(node.action);
            node = node.next;
        }
    }
}