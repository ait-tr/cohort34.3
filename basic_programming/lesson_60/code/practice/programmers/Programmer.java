package practice.programmers;

import java.util.Arrays;

public class Programmer {
    // В этом классе нужно учесть состав и количество языков программирования, которые знает программист (technology).
    // Чем больше языков (количество), тем "круче".

    String name;
    String[] technologies; // стек технологий

    public Programmer(String name, String... technologies) { // "varargs" (variable arguments) - позволяет использовать
        // массивы разной длины
        this.name = name;
        this.technologies = technologies;
    }

    public String getName() {
        return name;
    }

    public String[] getTechnologies() {
        return technologies;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", technologies=" + Arrays.toString(technologies) +
                '}';
    }
}
