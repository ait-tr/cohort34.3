package practice;

//  Проверка положительное или отрицательное число.
//  Проверка четное или нечетное целое число.
//  Проверка возраста. Если пользователю 18 лет и менее, то сообщить "Вам надо
//  прийти вместе с вашим опекуном", иначе сообщить "Вам разрешено действовать самостоятельно.

public class Conditions {
    public static void main(String[] args) {

        int x = 0;

        if (x > 0) {
            System.out.println("x - положительное");
        } else if (x == 0) {
            System.out.println("x = 0");
        } else {
            System.out.println("x - отрицательное");
        }

        // четное или нечетное целое число

        int y = 16;

        if ( y % 2 == 0 ){
            System.out.println("Число : " + y + " - четное");
        } else {
            System.out.println("Число : " + y + " - НЕ четное");
        }

        int age = 18;
        if ( age >= 18 ) {
            System.out.println("Вам разрешено действовать самостоятельно");
        } else {
            System.out.println("Вам надо прийти вместе с вашим опекуном");
        }

    }
}
