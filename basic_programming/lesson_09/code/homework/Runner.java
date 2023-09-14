package homework;

// В первый день спортсмен пробежал s километров, а затем он каждый день увеличивал пробег на 10 % от
// предыдущего значения. Определите номер того дня, на который пробег спортсмена составит не менее target
// километров. Программа получает на вход действительные числа s и target и должна вывести одно
// натуральное число.

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many kilometers did you run today? ");
        double s = scanner.nextInt();
        System.out.println("How many kilometers do you want to run? ");
        int target = scanner.nextInt();
        int day = 0;
        while(s < target) {
            s = s + s * 0.1;
            System.out.printf("Distance %.2f", s);
            System.out.println();
            day++;
        }
        System.out.println("After " + day + " days you'll reach the target " + target + " km.");
    }
}
