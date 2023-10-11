package homework;

import java.util.Scanner;

//      Напишите программу, которая запрашивает строку от пользователя и затем:
//        - сообщает сколько слов в строке
//        - сообщает сколько букв (символов) в строке
//        - печатает строку задом наперед, начиная с последнего слова.
public class StringPractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = scanner.nextLine();
        System.out.println("Your input: " + str);
        String[] words = str.split(" ");
        System.out.println("Words in: " + str + " = " + words.length);
        String[] symbols = str.split("");
        System.out.println("Symbols in: " + str + " = " + symbols.length);
        for (int i = words.length - 1; i >=0 ; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }
}
