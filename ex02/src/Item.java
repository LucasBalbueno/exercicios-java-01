public class Item {
    public String url;
    public Item next;

    public Item(String url) {
        this.url = url;
        this.next = null;
    }

    @Override
    public String toString() {
        return url;
    }
}