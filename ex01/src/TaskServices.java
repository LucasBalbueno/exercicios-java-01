public class TaskServices {
    private Task head;

    public TaskServices() {
        this.head = null;
    }

    public void addTask(String title) {
        Task newTask = new Task(title);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
    }

    public void removeTask(String title) {
        if (head == null) return;

        if (head.title.equals(title)) {
            head = head.next;
            return;
        }

        Task current = head;
        while (current.next != null && !current.next.title.equals(title)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void markTaskAsCompleted(String title) {
        Task current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                current.setAsCompleted();
                return;
            }
            current = current.next;
        }
    }

    public void listTasks() {
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}
