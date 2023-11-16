package practice.performance_test;

import java.util.*;

public class PerformanceTestAppl {

    // определим константы
    private static final int N_NUMBERS = 100_000;
    private static final int MIN = 10;
    private static final int MAX = 100;

    private static Random random = new Random();

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        fillList(list); // заполнить лист методом

        System.out.println("============= for each ================");
        long t1 = System.currentTimeMillis(); // засекли время
        int sum = 0;
        // сложим все элементы листа
        for (Integer n : list) {
            sum += n;
        }
        long t2 = System.currentTimeMillis(); // засекли время
        System.out.println("Sum = " + sum);
        System.out.println("Duration of sum: " + (t2 - t1));

        System.out.println("============= iterator - обход листа ================");
        t1 = System.currentTimeMillis(); // засекли время
        sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            sum += iterator.next();
        }
        t2 = System.currentTimeMillis(); // засекли время
        System.out.println("Duration of iteration: " + (t2 - t1));

        System.out.println("============= for loop ================");
        t1 = System.currentTimeMillis(); // засекли время
        sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        t2 = System.currentTimeMillis(); // засекли время
        System.out.println("Duration of for loop: " + (t2 - t1));

    }

    private static void fillList(List<Integer> list) {
        long t1 = System.currentTimeMillis(); // засекли время
        for (int i = 0; i < N_NUMBERS; i++) {
            list.add(MIN + random.nextInt(MAX - MIN));
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Duration of filling the list: " + (t2 - t1));
    }

}
