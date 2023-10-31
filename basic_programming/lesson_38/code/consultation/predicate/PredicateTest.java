package consultation.predicate;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {

        Predicate<Integer> isPositive = x -> x > 0; // объявили предикат и сразу вписали условие, которое будет проверяться

        System.out.println(isPositive.test(56)); // true
        System.out.println(isPositive.test(-56)); // false

        System.out.println("-----------------------");

        Predicate<Integer> isOdd = n -> n % 2 == 1;

        System.out.println(isOdd.test(5)); // true
        System.out.println(isOdd.test(8)); // false

        System.out.println("-----------------------");

        Predicate<String> isStartsWithW = s -> s.charAt(0) == 'W';
        System.out.println(isStartsWithW.test("Wolf")); // true
        System.out.println(isStartsWithW.test("Fox")); // false

        System.out.println("--------- Java --------------");

        Predicate<String> containsJava = s -> s.contains("Java");
        System.out.println(containsJava.test("mhgaskas Java lkjfgvlkdfj")); // true
        System.out.println(containsJava.test("mhgaskas J lkjfgvlkdfj")); // false

    }
}
