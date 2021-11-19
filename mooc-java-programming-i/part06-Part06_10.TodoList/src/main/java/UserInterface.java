import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                addTask();
            } else if (command.equals("list")) {
                listTasks();
            } else if (command.equals("remove")) {
                removeTask();
            }
        }
    }

    private void addTask() {
        System.out.println("To add: ");
        String taskToBeAdded = scanner.nextLine();

        todoList.add(taskToBeAdded);
    }

    private void listTasks() {
        todoList.print();
    }

    private void removeTask() {
        System.out.println("Which one is removed?");
        int taskToBeRemoved = Integer.valueOf(scanner.nextLine());

        todoList.remove(taskToBeRemoved);
    }
}
