package hw.todo_v3.dao;

import hw.archive.model.Document;
import hw.todo_v3.model.Task;

import java.time.LocalDateTime;
import java.util.Arrays;

public class ToDoListImpl implements ToDoList {

//    private Document[] documents; // хранение документов в массиве
//    private int size; // количество документов
//
//    // constructor
//    public ArchiveImpl(int capacity) {
//        documents = new Document[capacity];
//        // this.size = 0;
//    }

    //fields
    private Task[] tasks;
    private int quantity;

    // constructor
    public ToDoListImpl(int capacity){
        tasks = new Task[capacity];
    }

    @Override
    public boolean addTask(Task task) {
        if (task == null || quantity == tasks.length) {
            return false;
        }
        tasks[quantity] = task; //ставим в конец массива
        quantity++;
        return true;
    }

    @Override
    public Task findTask(int taskNumber) {
        for (int i = 0; i < quantity; i++) {
            if (tasks[i].getId() == taskNumber - 1) {
                return tasks[i];
            }
        }
        return null;
    }

    @Override
    public Task removeTask(int taskNumber) {
        for (int i = 0; i < quantity; i++) {
            if (taskNumber == tasks[i].getId() + 1) {
                Task victim = tasks[i];
                System.arraycopy(tasks, i + 1, tasks, i, quantity - 1- i);
                tasks[--quantity] = null;
                return victim;
            }

        }
        return null;
    }

    @Override
    public void viewTasks() {
        for (int i = 0; i < quantity; i++) {
            System.out.println(tasks[i]);
        }
        System.out.println("You have " + quantity + " tasks.");
    }

    @Override
    public int quantity() {
        return quantity;
    }
}
