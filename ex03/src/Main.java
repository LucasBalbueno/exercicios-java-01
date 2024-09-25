import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static UndoService undo = new UndoService();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Text Editor");
            System.out.println("1. Add action");
            System.out.println("2. Undo the last action");
            System.out.println("3. Get all action");
            System.out.println("4. Leave");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the action description");
                    String action = sc.nextLine();
                    undo.addAction(action);
                    break;
                case 2:
                    String undoAction = undo.undoAction();
                    System.out.println("Action undo: " + undoAction);
                    break;
                case 3:
                    System.out.println("Actions history:");
                    undo.getActions();
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