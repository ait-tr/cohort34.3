package practice.numbers_stream;

//- создать с помощью stream поток случайных целых чисел;
//- выведите на печать элементы потока;
//- сколько в потоке получилось положительных чисел? сколько отрицательных?
//- просуммируйте все нечетные элементы потока;
//- найдите максимальное число, минимальное число;
//- выведите значения метода summaryStatistic.

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RandomIntStream {

    private static final int N_NUMBER = 6;
    private static final int MIN = -10;
    private static final int MAX = 10;


    public static void main(String[] args) {

        // свойства (параметры, аргументы для метода), нужные для потока:
        // сколько таких чисел надо, от какого минимального и до какого максимального
        // N_NUMBER, MIN, MAX

        Stream<Integer> numbers = getRandomNumbers(N_NUMBER, MIN, MAX);
        numbers.forEach(System.out::print); // поток отработал и закрыт
        System.out.println();
        //печатаем красиво
        Stream<Integer> numbers1 = getRandomNumbers(N_NUMBER, MIN, MAX);
        numbers1.forEach(s -> System.out.print(s + " | "));
        System.out.println();
        //печатаем с индексами ?? - на подумать TODO
        //- сколько в потоке получилось положительных чисел? сколько отрицательных?
        // нужно использовать тип long
        long positiveCount = getRandomNumbers(N_NUMBER, MIN, MAX)
                .peek(n-> System.out.print(n + " | "))
                .filter(n -> n>0 )
                .count();
        System.out.println("\nPositive numbers: " + positiveCount);

        long negativeCount = getRandomNumbers(N_NUMBER, MIN, MAX)
                .peek(n-> System.out.print(n + " | "))
                .filter(n -> n<0 )
                .count();
        System.out.println("\nNegative numbers: " + positiveCount);

        //- просуммируйте все нечетные элементы потока;
        int sumOddNumbers = getRandomNumbers(N_NUMBER, MIN, MAX)
                .peek(n-> System.out.print(n + " | "))
                .filter(n -> n % 2 != 0 )
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("\nSum of odd numbers from stream: " + sumOddNumbers);

        //- найдите максимальное число, минимальное число;
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        int max = getRandomNumbers(N_NUMBER, MIN, MAX)
                .peek(n-> System.out.print(n + " | "))
                .max(Comparator.naturalOrder())// Comparator.comparingInt(Integer::intValue) , Integer::compareTo
                .orElseThrow();
        System.out.println("\nMax value = " + max);

        IntSummaryStatistics intStat = getRandomNumbers(N_NUMBER, MIN, MAX)
                .mapToInt(Integer::intValue)
                .peek(n-> System.out.print(n + " | "))
                .summaryStatistics();
        System.out.println("\nmin = " + intStat.getMin());
        System.out.println("max = " + intStat.getMax());
        System.out.println("sum = " + intStat.getSum());
        System.out.println("avg = " + intStat.getAverage());
        System.out.println(intStat);

    } // end of main

    private static Stream<Integer> getRandomNumbers(int nNumber, int min, int max) {
        return new Random()
                .ints(min, max)
                .limit(nNumber)
                .boxed(); // упаковка в числа
    }

} // end of class
