package hw.todo_v3.dao;

import hw.todo_v3.model.Task;

public interface ToDoList {
    // add Task
    boolean addTask(Task task);
    Task findTask(int taskNumber);
    // remove Task
    Task removeTask(int taskNumber);
    // print list of Tasks
    void viewTasks();
    // TODO - список задач
    // quantity of tasks
    int quantity();

}
