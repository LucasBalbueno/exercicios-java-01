import java.util.LinkedList;
import java.util.Queue;

public class ProcessService {
    private Queue<Process> queue;

    public ProcessService() {
        this.queue = new LinkedList<>();
    }

    public void addProcess(Process process) {
        queue.add(process);
        System.out.println("The process " + process.getDocumentName() + " added in queue");
    }

    public void removeLastProcess() {
        Process process = queue.poll();

        if (process != null) {
            System.out.println("The process: " + process.getDocumentName() + " is removed");
        } else {
            System.out.println("No process in queue");
        }
    }

    public void getAllProcess() {
        if (queue.isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            System.out.println("Process in queue:");
            for (Process process : queue) {
                System.out.println(process.getDocumentName());
            }
        }
    }
}