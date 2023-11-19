package homework.currency_convertor;

//  Соберите в HashSet не менее 10 наименований национальных валют (EUR, USD и т.д).
//        Создайте enum с кодами валют и их текущими курсами к евро.
//        Выведите список валют и их курсов на экран.
//        Реализуйте возможность для пользователя выбрать желаемую валюту, ввести ее количество и узнать,
//        сколько он получит при обмене на евро.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import homework.currency_convertor.Currency;

public class CurrencyConvertor {

    public static void main(String[] args) {

        Currency[] currency = Currency.values();
        for (Currency c: currency) {
            System.out.println(c);
        }

        // надо избежать дубликатов в списке валют
        Set<String> currNames = new HashSet<>();

        for (int i = 0; i < currency.length; i++) {
            if(currNames.add(currency[i].getName())) {
                System.out.println(currency[i].getName() + " added.");
            } else {
                System.out.println(currency[i].getName() + " already exists.");
            }
        }

        System.out.println("Menu : ");
        int count = 0;
        for (String s: currNames) {
            count++;
            System.out.println(count + " : " +s);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of currency: ");
        int currNumber = scanner.nextInt();
        System.out.println("Input amount of money: ");
        int sum = scanner.nextInt();

        double course = currency[currNumber - 1].getCourse();

//        switch (currNumber) {
//            case 1 -> course = Currency.USD.getCourse();
//            case 2 -> course = Currency.CHF.getCourse();
//            case 3 -> course = Currency.GBP.getCourse();
//        }

        double res = sum * course;

        System.out.printf("You got: %.2f", res);
        System.out.println(" euro.");

    }
}
