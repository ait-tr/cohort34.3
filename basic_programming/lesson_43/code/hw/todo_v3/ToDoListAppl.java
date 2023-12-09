package hw.todo_v3;

//import java.util.Scanner;
//import practice.todolist_appl.dao.ToDoListImpl;
//import practice.todolist_appl.model.Menu;
//import practice.todolist_appl.model.Task;

import hw.todo_v3.dao.ToDoListImpl;
import hw.todo_v3.model.Menu;
import hw.todo_v3.model.Task;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ToDoListAppl {
    public static void main(String[] args) {
        // greeting
        System.out.println("Welcome to ToDo Application!");
        ToDoListImpl toDoList = new ToDoListImpl(10);

        // начало цикла
        while (true) {
            // print menu
            Menu.printMenu(); // статический метод вызывается по имени класса
            // ask choice
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();
            // execute
            switch (choice) {
                case 1: {
                    scanner.nextLine();
                    System.out.println("Input task: ");
                    String task = scanner.nextLine();
                    LocalDateTime time = LocalDateTime.now();
                    int id = toDoList.quantity();
                    Task newTask = new Task(id, task, time);
                    toDoList.addTask(newTask);
                    break;
                }
                case 2: {
                    System.out.println("Your tasks: ");
                    toDoList.viewTasks();
                    break;
                }
                case 3: {
                    System.out.println("Find");
                    System.out.println("Input task number: ");
                    int taskNumber = scanner.nextInt();
                    Task foundedTask = toDoList.findTask(taskNumber);
                    System.out.println("Task found: " + foundedTask);
                    break;

                }
                case 4: {
                    System.out.println("Remove");
                    System.out.println("Input task number: ");
                    int taskNumber = scanner.nextInt();
                    Task removedTask = toDoList.removeTask(taskNumber);
                    System.out.println(removedTask + " is removed.");
                    break;
                }
                case 5:
                    return;
                default: {
                    System.out.println("Wrong input.");
                }
            }
        }
    }
}
