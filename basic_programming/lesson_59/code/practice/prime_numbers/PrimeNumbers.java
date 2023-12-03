package practice.prime_numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(
                10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

        System.out.println("Numbers: ");
        numbers.stream()
                        .forEach(n -> System.out.print(n + " | "));
        System.out.println();

        System.out.println("Prime numbers: ");
        numbers.stream() // открыли поток
                .filter(n -> isPrime(n)) // отобрали простые числа
                .forEach(n -> System.out.print(n + " | "));
        System.out.println();

        // Other method
        System.out.println("Prime numbers 2: ");
        Stream<Integer> numbers1 = Stream.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        numbers1.map(n -> isPrime(n))
                .forEach(n-> System.out.print(n + " | "));

    }

    private static boolean isPrime(Integer n) {
        int i = 2;
        while(i < n){
            if(n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
