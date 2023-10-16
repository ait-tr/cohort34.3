package homework;

// Пользователь с клавиатуры вводит число от 1 до 12, программа сообщает, какому времени года принадлежит
// введенный месяц.

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of month: ");
        int month = scanner.nextInt();

        switch (month) {
            case 3,4,5 :
                System.out.println("Spring \uD83C\uDF38");
                break;
            case 6,7,8 :
                System.out.println("Summer  ☀\uFE0F");
                break;
            case 9,10,11 :
                System.out.println("Autumn \uD83C\uDF41");
                break;
            case 12,1,2:
                System.out.println("Winter ❄\uFE0F");
                break;
            default:
                System.out.println("Incorrect \uD83D\uDE45\u200D♂\uFE0F");
        }

//        switch (month) {
//            case 1:
//            case 2:
//            case 12: {
//                System.out.println("This is Winter.");
//                break;
//            }
//            case 3:
//            case 4:
//            case 5: {
//                System.out.println("This is Spring.");
//                break;
//            }
//            case 6:
//            case 7:
//            case 8: {
//                System.out.println("This is Summer.");
//                break;
//            }
//            case 9:
//            case 10:
//            case 11: {
//                System.out.println("This is Fall.");
//                break;
//            }
//            default: {
//                System.out.println("Wrong input!");
//            }


    }
}
