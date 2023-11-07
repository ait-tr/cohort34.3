package practice.todoappl.dao;

import practice.todoappl.model.Task;

import java.time.LocalDateTime;
import java.util.Arrays;

public class ToDoListImpl implements ToDoList {

    //fields
    private Task[] tasks;
    private int capacity;
    private int quantity;

    private LocalDateTime time; // TODO - добавить дату и время создания задачи

    // constructor
    public ToDoListImpl(int capacity){
        tasks = new Task[capacity];
        this.quantity = 0;
    }

    @Override
    public boolean addTask(Task task) {
        if (task == null || quantity == tasks.length) {
            return false;
        }
        tasks[quantity] = task;
        quantity++;
        return true;
    }

    @Override
    public Task removeTask(int id) {
        // find by id then remove, quantity--
        for (int i = 0; i < quantity; i++) {
            if (tasks[i].getId() == id) {
                Task removedTask = tasks[i];
                tasks[quantity - 1] = null;
                quantity--;
                return removedTask;
            }
            // устанавливаем новые индексы c 0 и подряд
            for (int j = 0; j < quantity; j++) {
                tasks[j].setId(j);
            }
            // sort tasks
            Arrays.sort(tasks);
        }
        return null;
    }

    @Override
    public void viewTasks() {
        // for loop, print tasks
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
