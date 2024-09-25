import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static QueueService queueService = new QueueService();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Print Manager");
            System.out.println("1. Add print job");
            System.out.println("2. Processing next print job");
            System.out.println("3. Get all prints job");
            System.out.println("4. Leave");

            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1:
                    System.out.println("Enter the document name:");
                    String document = sc.nextLine();
                    Print print = new Print(document);
                    queueService.addPrint(print);
                    break;
                case 2:
                    queueService.nextPrint();
                    break;
                case 3:
                    queueService.getAllPrints();
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