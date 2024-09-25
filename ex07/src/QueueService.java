import java.util.LinkedList;
import java.util.Queue;

public class QueueService {
    private Queue<Print> queue;

    public QueueService() {
        this.queue = new LinkedList<>();
    }

    public void addPrint(Print print) {
        queue.add(print);
        System.out.println("Print job " + print.getDocumentName() + " added in queue");
    }

    public void nextPrint() {
        Print print = queue.poll();

        if (print != null) {
            System.out.println("Processing prints job: " + print.getDocumentName());
        } else {
            System.out.println("No prints job in queue");
        }
    }

    public void getAllPrints() {
        if (queue.isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            System.out.println("Prints in queue:");
            for (Print printJob : queue) {
                System.out.println(printJob.getDocumentName());
            }
        }
    }
}