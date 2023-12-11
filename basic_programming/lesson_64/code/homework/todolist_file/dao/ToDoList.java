package homework.todolist_file.dao;

import homework.todolist_file.model.Task;

public interface ToDoList {
    // add Task
    boolean addTask(Task task);

    // remove Task
    Task removeTask(int taskNumber);

    // print list of Tasks
    void viewTasks();

    // quantity of tasks
    int quantity();

}
