package homework.german_lands;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//  Написать программу, которая:
//  - прочитает с клавиатуры количество вводимых названий земель в Германии,
//  - прочитает с клавиатуры названия земель и соберёт их в множество,
//  - выведет полученные результаты на экран.
public class GermanLands {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of lands in Germany: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Set<String> germanLands = new HashSet<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Input the name of land: ");
            String land = scanner.nextLine();
            germanLands.add(land);
        }

        for (String land : germanLands) {
            System.out.print(land + " | ");
        }
    }
}
