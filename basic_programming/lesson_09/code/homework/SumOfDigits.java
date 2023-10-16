package homework;

// Вводится положительное целое число, найдите сумму его цифр.

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int n = scanner.nextInt();
        int n1 = n; // сохранил начальное значение числа n
        int sumOfDigits = 0;
        while (n > 0) {
            sumOfDigits = sumOfDigits + n % 10;
            n = n/10;
        }
        System.out.println("Sum of digits " + n1 + " is: " + sumOfDigits);
    }
}
