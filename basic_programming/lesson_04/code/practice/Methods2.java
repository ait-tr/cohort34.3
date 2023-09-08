package practice;

//       1. Создайте метод, который принимает целое число и возвращает остаток от деления его на 2.
//        Пример: число 41, метод возвращает 1.
//        2. Создайте метод, который принимает целое число и возвращает целую часть от деления его на 5.
//        Пример: число 83, метод возвращает 16.
//        3. Создайте метод, который находит сумму цифр двузначного целого числа.
//        Пример: число 23, сумма цифр 5.

public class Methods2 {
    public static void main(String[] args) {
        int a = 42;
        int n = divBy2(a);
        System.out.println(n);

        int b = 83;
        int m = divBy5(b);
        System.out.println(m);

        int number = 99;
        int res = sumDigits(number);
        System.out.println(res);

    }

    public static int sumDigits(int n){
        //получить первую цифру
        int c1 = n / 10;
        // получить вторую цифру
        int c2 = n % 10;
        // сложить цифры
        return c1 + c2;
    }

    public static int divBy5(int num){
        return num / 5;
    }

    public static int divBy2(int a){
        return a % 2;
    }

}
