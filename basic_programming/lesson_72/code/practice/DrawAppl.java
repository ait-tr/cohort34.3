package practice;

import java.util.Random;
import java.util.stream.Stream;

public class DrawAppl {

    private static final int N_NUMBER = 5;
    private static final int MIN = 1;
    private static final int MAX = 6;
    public static void main(String[] args) {

        Stream<Integer> numbers = getRandomNumbers(N_NUMBER, MIN, MAX);
        numbers.forEach(s -> System.out.print(s + " | "));
        System.out.println();

    }
    private static Stream<Integer> getRandomNumbers(int nNumber, int min, int max) {
        return new Random()
                .ints(min, max)
                .distinct()
                .limit(nNumber)
                .boxed(); // упаковка в числа
    }
}
