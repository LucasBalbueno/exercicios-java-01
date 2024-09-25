import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static QueueService queueService = new QueueService();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Bank Queue");
            System.out.println("1. Add client in queue");
            System.out.println("2. Serve the next client");
            System.out.println("3. Get all clients in queue");
            System.out.println("4. Leave");

            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1:
                    System.out.println("Enter the client name:");
                    String name = sc.nextLine();
                    Client client = new Client(name);
                    queueService.addClient(client);
                    break;
                case 2:
                    queueService.nextClient();
                    break;
                case 3:
                    queueService.getAllQueue();
                    break;
                case 4:
                    System.out.println("Leaving...");
                    return;
                default:
                    System.out.println("Invalid option. Try again!");
                    break;
            }
        }
    }
}