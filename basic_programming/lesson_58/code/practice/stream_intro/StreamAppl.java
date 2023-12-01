package practice.stream_intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAppl {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 9, 2, 8, 3, 7, 4, 6, 5)); // определили список целых чисел
        numbers.stream() // подключили к нему метод stream
                .filter(a -> a > 3) // отбираем элементы по условию
                .peek(a -> System.out.println("peek before sort: " + a)) // This method exists mainly to support debugging
                .sorted((n1, n2) -> -Integer.compare(n1, n2)) // сортируем
                .forEach(System.out::println); // печатаем
        System.out.println("==============================");
        numbers.forEach(System.out::println); // еще один вариант печати
        System.out.println("==============================");
        Integer[] arr = {1, 9, 2, 8, 3, 7, 4, 6, 5};
        Stream<Integer> streamInt = Arrays.stream(arr)
                .filter(n -> n > 2) // отобрали большие 2
                .filter(n -> n % 2 == 0) // отобрали только четные
                .peek(n -> System.out.println("peek: " + n)) // debugger
                .sorted((n1, n2) -> -Integer.compare(n1, n2)); // отсортировали

        streamInt.forEach(System.out::println);
        System.out.println("==============================");
//        streamInt.forEach(System.out::println);
        Integer res = Arrays.stream(arr)
                .map(n -> n * 10)
                .reduce(0, (accum, n) ->  accum + n);
        System.out.println("sum = " + res);
        res = Arrays.stream(arr)
                .reduce(1, (accum, n) ->  accum * n);
        System.out.println("product = " + res);
        String str = Arrays.stream(arr)
                .sorted()
                .map(Object::toString)
                .reduce("Result = ", (accum, n) ->  accum + n);
        System.out.println(str);
        System.out.println("==============================");
        Integer[] sortedNum = Arrays.stream(arr)
                .sorted((n1,n2) -> -Integer.compare(n1,n2))
//                                    .toArray(size -> new Integer[size]);
                .toArray(Integer[]::new);
        Arrays.stream(sortedNum).forEach(System.out::print);
        System.out.println();
        System.out.println("==============================");
        res = Arrays.stream(arr)
                .peek(n -> System.out.println("n = " + n))
                .filter(n -> n % 4 == 0)
                .findFirst()
                .orElse(Integer.MAX_VALUE);
        System.out.println(res);

    }
}
