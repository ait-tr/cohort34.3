package homework.numbers_more_10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//  Написать программу, которая:
//        - прочитает с клавиатуры количество вводимых чисел,
//        - прочитает с клавиатуры сами числа и соберёт их в множество,
//        - удалить из множества числа, большие 10,
//        выведет полученные результаты на экран
//        Все числа, которые подаются на вход, целые.
public class NumbersMore10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input quantity of numbers: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Set<Integer> numbers = new HashSet<>();
        System.out.println("Size of set = " + numbers.size());
        System.out.println("Set is empty = " + numbers.isEmpty());

        while (numbers.size() < n) {
            System.out.println("Input number: ");
            int nextInt = scanner.nextInt();
            if(numbers.add(nextInt)) {
                System.out.println("Number is added.");
            } else {
                System.out.println("Number already exists it set.");
            }
            System.out.println("Set consist numbers:");
            System.out.println(numbers);
        }

        System.out.println("Remove numbers > 10");
        for (Integer num : numbers) {
            if(num > 10){
                 numbers.remove(num);
            }
        }
        System.out.println("Set consist numbers:");
        System.out.println(numbers);

    }
}
