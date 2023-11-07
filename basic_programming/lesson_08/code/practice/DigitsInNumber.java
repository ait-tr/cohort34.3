package practice;

import java.util.Scanner;

// Пользователь вводит натуральное число (целое, положительное).
// Выясните, сколько цифр в числе.
public class DigitsInNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int number = scanner.nextInt();
        System.out.println("Your number is : " + number);

        // Алгоритм:
        // смысл цифры в числе определяется ее положением, единицы, десятки, сотни, ...
        // Будем делить в цикле наше число на 10 пока > 0
        int count = 0;
        while (number > 0) {
            number = number/10; // делим число на 10
            count++; // считаем кол-во цифр
        }
        System.out.println("Digits in number is: " + count);
    }
}
