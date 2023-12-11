package homework.todolist_file.model;

import java.util.Objects;

public class Task implements Comparable<Task> {
    // fields
    private int id; // идентификатор
    private String task; // содержание задачи
    // constructor
    public Task(int id, String task) {
        this.id = id;
        this.task = task;
    }
    // геттеры и сеттеры
    public int getId() {
        return id + 1;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    // метод toString
    @Override
    public String toString() {
        // должно быть сначала номер задачи, затем ее текст
        return  "task: " + task;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Task o) {
        // return this.taskNumber - o.getTaskNumber(); // естественная сортировка по taskNumber, от меньшего к большему
        return Integer.compare(this.id, o.id); // возможный вариант
    }
}
