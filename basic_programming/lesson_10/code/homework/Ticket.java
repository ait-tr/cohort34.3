package homework;

// В кинотеатре есть разные типы билетов: стандартный, студенческий (-10%) и для пенсионеров(-25%).
// Каждый тип билета имеет свою стоимость. Клиент может также выбрать место в VIP-зоне,
// что увеличит стоимость билета на 25%.
// Создайте метод calculateTicketPrice, который принимает возраст клиента, статус студента
// и флаг VIP-места.

import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        int age = 0;
        boolean isStudent = false;
        boolean isVIP = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to cinema!");
        System.out.println("Input your answer: ");
        System.out.println("1 - senior, 2 - student, 3 - VIP, 4 - none of previous");
        int status = scanner.nextInt();
        double price = 0;
        switch (status){
            case 1 -> price = calculateTicketPrice(66, false, false);
            case 2 -> price = calculateTicketPrice(1, true, false);
            case 3 -> price = calculateTicketPrice(1, false, true);
            case 4 -> price = calculateTicketPrice(1, false, false);
            default -> System.out.println("Wrong input.");
        }
        System.out.printf("Price of ticket is: %.2f", price);
        System.out.println();
    }

    public static double calculateTicketPrice(int age, boolean isStudent, boolean isVIP) {
        double standardPrice = 30;
        if (age > 65) {
            return standardPrice - standardPrice * 0.25;
        }
        if (isStudent){
            return standardPrice - standardPrice * 0.1;
        }
        if (isVIP) {
            return standardPrice + standardPrice * 0.25;
        }
        return standardPrice;
    }

}
