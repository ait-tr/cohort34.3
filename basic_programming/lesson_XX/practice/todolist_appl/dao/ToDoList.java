package practice.todolist_appl.dao;

import practice.todolist_appl.model.Task;

public interface ToDoList {
    // add Task
    boolean addTask(Task task);

    // remove Task
    Task removeTask(int taskNumber);

    // print list of Tasks
    void viewTasks();
    // подумать над Task[] viewTasks();

    // quantity of tasks
    int quantity();

    // TODO - нужен ли в интерфейсе метод для выхода из меню?

}
