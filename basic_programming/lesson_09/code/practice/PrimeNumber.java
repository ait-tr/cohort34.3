package practice;
// Пользователь вводит натуральное число n. Определите, является ли оно простым.
// Простое число - это такое число, которое делится **только** на себя и на 1.
// Примеры: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,  ...

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // Алгоритм:
        // любое целое n будем пробовать делить на числа, меньшие его, начиная с 2
        // 10 / 2 = 5 - значит НЕ простое, 11 делим на 2, 3, 4, ..., 10 если не разделилось, то число ПРОСТОЕ

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;
        int div = 2; // div - это делитель
        while ( div < number){
            if ( number % div == 0 ){ // если разделилось число number нацело на div
                isPrime = false;
                // можно выходить из цикла
            }
            div++; // увеличиваем параметр цикла
        }
        System.out.println(number + " is prime: " + isPrime);
    }
}
