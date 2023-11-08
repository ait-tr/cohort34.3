package practice;

// Составьте программу, которая вычисляет сумму чисел от 1 до 1/n, n вводится с клавиатуры.
// Пример:
// n = 10
// sum = 1 + 1/2 + 1/3 + ... + 1/10
// Использовать цикл for.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = scanner.nextInt(); // вводим кол-во повторений

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (double) 1 /i;
        }
        System.out.println("Sum = " + sum);
    }

}
