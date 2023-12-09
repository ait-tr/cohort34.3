package practice;

public class Division {
    public static void main(String[] args) { // начало main
//        - деление целых чисел:
//          - / - целая часть от деления числа m на n ;
//          - % - остаток от деления m на n ;

        int m = 100;
        int n = 7;

        int c = m / n; // = - это присвоение

        System.out.println(c);

        int ost = m % n;

        System.out.println(ost);

        int a = 27;
        int b = 9;

        ost = a % b;
        System.out.println(ost);
        // когда одно целое число делится на другое нацело, то остаток от деления = 0

    } // конец main

}
