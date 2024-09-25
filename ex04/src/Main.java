import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static ManagerService manager = new ManagerService();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Text Editor");
            System.out.println("1. Add action");
            System.out.println("2. Undo last action");
            System.out.println("3. Redo last action");
            System.out.println("4. Get all actions");
            System.out.println("5. Leave");

            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1:
                    System.out.println("Enter the action description");
                    String action = sc.nextLine();
                    manager.addAction(action);
                    break;
                case 2:
                    String undoneAction = manager.undoAction();
                    System.out.println("Action undo: " + undoneAction);
                    break;
                case 3:
                    String redoneAction = manager.redoAction();
                    System.out.println("Action redo: " + redoneAction);
                    break;
                case 4:
                    System.out.println("Actions history:");
                    manager.getActions();
                    break;
                case 5:
                    System.out.println("Leaving...");
                    return;
                default:
                    System.out.println("Invalid option. Try again!");
                    break;
            }
        }
    }
}