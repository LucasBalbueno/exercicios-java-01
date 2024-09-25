public class HistoryService {
    private Item head;
    private int size;
    private final int maxSize;

    public HistoryService(int maxSize) {
        this.head = null;
        this.size = 0;
        this.maxSize = maxSize;
    }

    public void addUrl(String url) {
        Item newItem = new Item(url);
        if (head == null) {
            head = newItem;
        } else {
            Item current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newItem;
        }
        size++;

        if (size > maxSize) {
            removeOldUrl();
        }
    }

    private void removeOldUrl() {
        if (head != null) {
            head = head.next;
            size--;
        }
    }

    public void GetUrls() {
        Item current = head;
        while (current != null) {
            System.out.println(current.url);
            current = current.next;
        }
    }
}