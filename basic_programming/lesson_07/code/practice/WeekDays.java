package practice;

// Написать программу, которая по введенной цифре от 1 до 7 определяет день недели.
// Замените ввод цифры на первую букву дня недели.

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day of week (two first letter of day): ");
        String dayOfWeek = scanner.next();

        // dayOfWeek = dayOfWeek.toLowerCase();

        switch (dayOfWeek) {
            case "Mo" -> System.out.println("This is Monday.");
            case "Tu" -> System.out.println("This is Tuesday.");
            case "We" -> System.out.println("This is Wednesday.");
            case "Th" -> System.out.println("This is Thursday.");
            case "Fr" -> System.out.println("This is Friday.");
            case "Sa" -> System.out.println("This is Saturday.");
            case "Su" -> System.out.println("This is Sunday.");
            default -> System.out.println("Wrong input!");
        }
    }
}
