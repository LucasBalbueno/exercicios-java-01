import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the max history size:");
        int maxSize = sc.nextInt();
        sc.nextLine();

        History historyItems = new History(maxSize);

        while (true) {
            System.out.println("Management History");
            System.out.println("1. Add URL");
            System.out.println("2. Get all URLs");
            System.out.println("3. Leave");

            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1:
                    System.out.println("Enter the URL:");
                    String url = sc.nextLine();
                    historyItems.addUrl(url);
                    break;
                case 2:
                    System.out.println("History Navigation:");
                    historyItems.GetUrls();
                    break;
                case 3:
                    System.out.println("Leaving...");
                    return;
                default:
                    System.out.println("Invalid option. Try again!");
                    break;
            }
        }
    }
}