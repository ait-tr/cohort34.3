package homework;

// Определение времени суток. Напишите программу, которая принимает текущий час (от 0 до 23) и
// выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).

import java.util.Scanner;

public class DayTime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What time is now? \nInput time in 24H format, please.");
        int time = scanner.nextInt();

        switch (time) {
            case 4, 5, 6, 7, 8, 9, 10 -> System.out.println("Good morning!");
            case 11, 12, 13, 14, 15, 16, 17, 18 -> System.out.println("Good day!");
            case 19, 20, 21, 22 -> System.out.println("Good evening!");
            case 23, 24, 0, 1, 2, 3 -> System.out.println("Good night, it's time to sleep.");
        }
    }
}
