package practice.numbers_duplicates;

// - Имеется список из 100 случайных чисел в интервале от 1 до 10, необходимо удалить из него
//        все дубликаты.

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NumbersNoDuplicates {
    public static void main(String[] args) {

        int[] numbers = new int[100];
        int a = 1;
        int b = 11;

        Random random = new Random();

        // заполнили массив
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt( a, b); //
        }
        // распечатали
        for (Integer n : numbers) {
            System.out.print(n + " | ");
        }

        Set<Integer> uniqueNumbers = new HashSet<>();
        System.out.println("---------------------------------------");
        System.out.println("Size of set: " + uniqueNumbers.size());
        System.out.println("Is empty = " + uniqueNumbers.isEmpty());

        // занесли массив в set способ 1 (for i)
        for (int i = 0; i < numbers.length; i++) {
            uniqueNumbers.add(numbers[i]);
        }

        // занесли массив в set способ 2 (for each)
        for (Integer n : numbers) {
            uniqueNumbers.add(n);
        }
        System.out.println(uniqueNumbers);
        System.out.println("===================================");

        // распечатали set, способ 1
        for (Integer n : uniqueNumbers) {
            System.out.print(n + " | ");
        }
        System.out.println();
        // распечатали set, способ 2
        System.out.println(uniqueNumbers);

    }
}
