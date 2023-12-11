package homework.todolist_file;

//import java.util.Scanner;
//import practice.todolist_appl.dao.ToDoListImpl;
//import practice.todolist_appl.model.Menu;
//import practice.todolist_appl.model.Task;

import homework.todolist_file.dao.ToDoListImpl;
import homework.todolist_file.model.Menu;
import homework.todolist_file.model.Task;

import java.util.Scanner;

public class ToDoListAppl {
    public static void main(String[] args) {
        // greeting
        System.out.println("Welcome to ToDo Application!");
        ToDoListImpl toDoList = new ToDoListImpl();

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
                    Task newTask = new Task(toDoList.quantity(), task);
                    toDoList.addTask(newTask);
                    break;
                }
                case 2: {
                    System.out.println("Your tasks: ");
                    toDoList.viewTasks();
                    break;
                }
                case 3: {
                    System.out.println("Input task number: ");
                    int taskNumber = scanner.nextInt();
                    Task removedTask = toDoList.removeTask(taskNumber);
                    if(!(removedTask == null)){
                        System.out.println(removedTask + " is removed.");
                    }
                    break;
                }
                case 4:
                    return;
                default: {
                    System.out.println("Wrong input.");
                }
            }
        }
    }
}
