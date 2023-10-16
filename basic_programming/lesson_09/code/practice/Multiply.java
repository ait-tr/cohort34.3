package practice;

// Распечатать в консоли таблицу умножения от 1 до 10.

public class Multiply {
    public static void main(String[] args) {

        int n = 1;
        int m = 1;

        while ( n < 10) {
            while (m <= 10) {
                System.out.print( n + " * " + m + " = " + (n * m) + " | ");
                m++;
            }
            System.out.println(); // переход на сл. строку
            m = 1; // сброс m на начальное значение
            n++; // увеличиваем n на 1
        }
    }
}
