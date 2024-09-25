public class CardService {
    private Node head;
    private Node tail;

    public CardService() {
        this.head = null;
        this.tail = null;
    }

    public void addCard(String card) {
        Node newNode = new Node(card);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    public boolean removeCard(String card) {
        Node current = head;

        while (current != null) {
            if (current.card.equals(card)) {
                if (current.previous != null) {
                    current.previous.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.previous = current.previous;
                } else {
                    tail = current.previous;
                }

                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean organizeCards(String card) {
        Node current = head;
        while (current != null) {
            if (current.card.equals(card)) {
                if (current == tail) {
                    return true;
                }

                if (current.previous != null) {
                    current.previous.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.previous = current.previous;
                }
                current.next = null;

                current.previous = tail;

                if (tail != null) {
                    tail.next = current;
                }
                tail = current;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void getCards() {
        Node current = head;

        while (current != null) {
            System.out.println(current.card);
            current = current.next;
        }
    }
}