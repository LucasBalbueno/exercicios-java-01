public class UndoService {
    private Node head;

    public UndoService() {
        this.head = null;
    }

    public void addAction(String action) {
        Node nodeAction = new Node(action);
        nodeAction.next = head;
        head = nodeAction;
    }

    public String undoAction() {
        if (head == null) {
            return "No action to undo";
        }
        String undoAction = head.action;
        head = head.next;
        return undoAction;
    }

    public void getActions() {
        Node current = head;
        while (current != null) {
            System.out.println(current.action);
            current = current.next;
        }
    }
}