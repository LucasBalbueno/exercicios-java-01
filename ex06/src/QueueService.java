import java.util.LinkedList;
import java.util.Queue;

public class QueueService {
    private Queue<Client> queue;

    public QueueService() {
        this.queue = new LinkedList<>();
    }

    public void addClient(Client client) {
        queue.add(client);
        System.out.println("Client " + client.getName() + " joined the queue");
    }

    public Client nextClient() {
        Client nextClient = queue.poll();
        if (nextClient != null) {
            System.out.println("Client " + nextClient.getName() + " is being serving");
        } else {
            System.out.println("No clientes in queue");
        }
        return nextClient;
    }

    public void getAllQueue() {
        if (queue.isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            System.out.println("Clients in the queue:");
            for (Client client : queue) {
                System.out.println(client.getName());
            }
        }
    }
}