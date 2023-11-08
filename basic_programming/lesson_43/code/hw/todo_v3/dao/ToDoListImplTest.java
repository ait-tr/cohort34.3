package hw.todo_v3.dao;

import hw.todo_v3.model.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNull;

class ToDoListImplTest {

    ToDoList toDoList;
    Task[] t;
    LocalDateTime timeNow = LocalDateTime.now();

    @BeforeEach
    void setUp() {
        toDoList = new ToDoListImpl(10);
        t = new Task[5];
        t[0] = new Task(0, "task1", timeNow);
        t[1] = new Task(1, "task2", timeNow);
        t[2] = new Task(2, "task3", timeNow);
        t[3] = new Task(3, "task4", timeNow);

        for (int i = 0; i < t.length; i++) {
            toDoList.addTask(t[i]);
        }
    }

    @Test
    void addTask() {
        toDoList.viewTasks();

    }

    @Test
    void removeTask() {
        toDoList.viewTasks(); // до удаления
        // удаление имеющегося элемента
        assertEquals(t[0], toDoList.removeTask(1)); // это проверка на удаление
        System.out.println("---------------------");
        toDoList.viewTasks(); // после удаления
        // проверка количества
        assertEquals(3, toDoList.quantity());
        // удаление отсутствующего элемента
        assertNull(toDoList.removeTask(6));
    }

    @Test
    void viewTasks() {

    }

    @Test
    void quantity() {

    }
}