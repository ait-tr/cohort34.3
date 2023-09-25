package homework;

// Ввести с клавиатуры 10 пар целых чисел.
// Сравните числа в каждой паре и напечатайте большие из них.
// Использовать цикл for.

import java.util.Scanner;

public class CoupleNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Attempt = " + (i + 1)); // печатаем номер попытки ввода
            System.out.println("Input 1st number: ");
            int num1 = scanner.nextInt();
            System.out.println("Input 2nd number: ");
            int num2 = scanner.nextInt();

            if (num1 > num2) {
                System.out.println(num1 + " >  " + num2 + ", the bigger number is " + num1);
            } else if (num1 < num2) {
                System.out.println(num2 + " >  " + num1 + ", the bigger number is " + num2);
            } else {
                System.out.println(num2 + " = " + num1);
            }
        }

        System.out.println("Done!");

    }
}
