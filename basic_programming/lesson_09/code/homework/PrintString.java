package homework;

// Программа получает на вход строку и число повторений этой строки.
// Программа должна вывести эту строку нужное количество раз.

import java.util.Scanner;

public class PrintString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string : ");
        String str = scanner.nextLine(); // считывает всю введенную строку, включая пробелы
        System.out.println("Input number to repeat the string: ");
        int n = scanner.nextInt();
        int count = 0;
        while (count < n) {
            System.out.println(str);
            count++;
        }
        System.out.println("Bye, bye!");
    }
}
