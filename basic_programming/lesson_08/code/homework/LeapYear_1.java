package homework;

import java.util.Scanner;

public class LeapYear_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter YEAR");
        int year1 = scanner.nextInt();
        int ost = year1 % 4;
        int ost2 = year1 % 100;
        int ost3 = year1 / 400;
        int ost4 = year1 % 1000;

        if ((((ost == 0) & (ost2 != 0)) |  (ost2 == 0 ) & (ost3 == 0)) | (ost4 == 0)) {
            System.out.println("Год  високосный");
        }
        else {
            System.out.println("Год не високосный");
        }
    }
}
