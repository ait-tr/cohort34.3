package practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsMethods {
    public static void main(String[] args) {
        // Создайте список известных вам фруктов.
        // Выполните поиск имеющегося и отсутствующего элемента списка.
        // Отсортируйте этот список по алфавиту в прямом и обратном порядке.
        // Проверьте работу методов
        // max(Collection<?> coll)
        // min(Collection<?> coll), что они возвращают?

        List<String> fruits = new ArrayList<>();

        fruits.add("banana");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("watermelon");
        fruits.add("apple");

        System.out.println("-----------------------");
        for (String s : fruits) {
            System.out.println(s);
        }
        System.out.println("-----------------------");
        // Элемент, который мы ищем в списке
        String searchElement = "bananaA";

        //  Проверяем, содержится ли элемент в списке
        if (Collections.binarySearch(fruits, searchElement) >= 0) {
            System.out.println("Элемент '" + searchElement + "' найден в списке.");
        } else {
            System.out.println("Элемент '" + searchElement + "' не найден в списке.");
        }

        Comparator<String> fruitsComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return - o1.compareTo(o2);
            }
        };

        Collections.sort(fruits, fruitsComparator);
        System.out.println("-----------------------");
        for (String s : fruits) {
            System.out.println(s);
        }
        System.out.println("-----------------------");
        int index = Collections.binarySearch(fruits, "apple", fruitsComparator);
        System.out.println("Index apple = " + index);

        // Элемент, который мы ищем в списке
        searchElement = "orange";

        //  Проверяем, содержится ли элемент в списке
        if (Collections.binarySearch(fruits, searchElement, fruitsComparator) >= 0) {
            System.out.println("Элемент '" + searchElement + "' найден в списке.");
        } else {
            System.out.println("Элемент '" + searchElement + "' не найден в списке.");
        }

        String max = Collections.max(fruits);
        System.out.println("Max: " + max);

        String min = Collections.min(fruits);
        System.out.println("Min: " + min);

    }
}
