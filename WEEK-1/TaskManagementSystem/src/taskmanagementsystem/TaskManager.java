package taskmanagementsystem;

public class TaskManager {
    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node cur = head;
            while (cur.next != null) cur = cur.next;
            cur.next = newNode;
        }
    }

    public Task searchTask(int id) {
        Node cur = head;
        while (cur != null) {
            if (cur.task.getTaskId() == id) return cur.task;
            cur = cur.next;
        }
        return null;
    }

    public void displayTasks() {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.task);
            cur = cur.next;
        }
    }

    public void deleteTask(int id) {
        if (head == null) return;
        if (head.task.getTaskId() == id) {
            head = head.next;
            return;
        }
        Node cur = head;
        while (cur.next != null && cur.next.task.getTaskId() != id) {
            cur = cur.next;
        }
        if (cur.next != null) {
            cur.next = cur.next.next;
        }
    }

    public static void main(String[] args) {
        TaskManager tm = new TaskManager();

        tm.addTask(new Task(1, "Design UI", "Pending"));
        tm.addTask(new Task(2, "Build Backend", "In Progress"));
        tm.addTask(new Task(3, "Test App", "Pending"));

        System.out.println("All Tasks:");
        tm.displayTasks();

        System.out.println("Search Task 2:");
        System.out.println(tm.searchTask(2));

        tm.deleteTask(2);
        System.out.println("After Deletion:");
        tm.displayTasks();
    }
}
