import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final TaskServices taskService = new TaskServices();

    public static void main(String[] args) {
        while (true) {
            System.out.println("TaskManager");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark the Task as concluded");
            System.out.println("4. Get all Tasks");
            System.out.println("5. Leave...");

            int num = scanner.nextInt();
            scanner.nextLine();

            switch (num) {
                case 1:
                    System.out.println("Enter the task title:");
                    String addTitle = scanner.nextLine();
                    taskService.addTask(addTitle);
                    break;
                case 2:
                    System.out.println("Enter the task title to be removed:");
                    String title = scanner.nextLine();
                    taskService.removeTask(title);
                    break;
                case 3:
                    System.out.println("Enter the task title to be concluded:");
                    String completeTitle = scanner.nextLine();
                    taskService.markTaskAsCompleted(completeTitle);
                    break;
                case 4:
                    System.out.println("List of all tasks:");
                    taskService.listTasks();
                    break;
                case 5:
                    System.out.println("Leaving...");
                    return;
                default:
                    System.out.println("Invalid Option, try again!");
                    break;
            }
        }
    }
}