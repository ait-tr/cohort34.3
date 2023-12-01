package homework.digits_freq;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DigitsFreqApp {
    public static void main(String[] args) {
        // Генерация миллиона положительных целых чисел
        int[] numbers = generateRandomNumbers(1000000);

        // Подсчет частоты встречаемости цифр
        // создаем мапу и вызываем свой метод, который ее заполнит
        Map<Integer, Integer> digitFrequency = calculateDigitFrequency(numbers);

        // Вывод результатов
        printDigitFrequency(digitFrequency);

    } // end of main

    // Генерация миллиона положительных целых чисел
    private static int[] generateRandomNumbers(int count) {
        int[] numbers = new int[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            numbers[i] = random.nextInt(Integer.MAX_VALUE); // Генерация положительного числа
        }
        return numbers;
    }

    // Подсчет частоты встречаемости цифр
    private static Map<Integer, Integer> calculateDigitFrequency(int[] numbers) {

        Map<Integer, Integer> digitFrequency = new HashMap<>();

        for (int number : numbers) {
            while (number > 0) {
                int digit = number % 10; // остаток от деления на 10 дает последнюю цифру числа
                digitFrequency.put(digit, digitFrequency.getOrDefault(digit, 0) + 1);
                number /= 10;
            }
        }

        return digitFrequency;
    }

    // Вывод результатов
    private static void printDigitFrequency(Map<Integer, Integer> digitFrequency) {
        System.out.println("Частота встречаемости цифр:");

        for (Map.Entry<Integer, Integer> entry : digitFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
