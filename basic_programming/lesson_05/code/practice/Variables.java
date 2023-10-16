package practice;
//  Объявите две переменные целого типа a и b и присвойте им произвольные значения натуральных чисел.
// Создайте третью переменную res и выведите ее значение на экран таким образом:
// Если a = b, то res будет равно (a+b) * 5 a если нет, то (a - b) * 5.

public class Variables {
    public static void main(String[] args) {

        int a = 50; // натуральные - это целые и положительные
        int b = 50;
        int res = 0;

        if ( a == b ) {
            res = (a + b) * 5;
        }
        if (a != b) {
            res = (a - b) * 5;
        }

        System.out.println(res);

    }
}
