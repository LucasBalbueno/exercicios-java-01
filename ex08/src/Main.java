import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static ProcessService processService = new ProcessService();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Process Manager");
            System.out.println("1. Add process");
            System.out.println("2. Remove last process");
            System.out.println("3. Get all process");
            System.out.println("4. Leave");

            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1:
                    System.out.println("Enter the process name:");
                    String processName = sc.nextLine();
                    Process process = new Process(processName);
                    processService.addProcess(process);
                    break;
                case 2:
                    processService.removeLastProcess();
                    break;
                case 3:
                    processService.getAllProcess();
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