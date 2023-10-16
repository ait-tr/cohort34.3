package practice;

// 1. Создайте метод, который вычисляет квадрат гипотенузы по двум катетам (теорема Пифагора).
// 2. Создайте метод, который возвращает целое число, противоположное по знаку.
//    Пример: число -46, метод возвращает 46.
//  3. Создайте метод, который возвращает куб числа.
//  Пример: число 20, метод возвращает 8 000.

public class Methods1 {
    public static void main(String[] args) {

        int a, b; // определили нужные нам переменные
        a = 3;
        b = 4;
        int с = hipotenusa(a, b); // квадрат гипотенузы
        System.out.println(с);

        int d = 37;
        int mod = modul(d); // смена знака числа
        System.out.println(mod);

        int f = 20;
        int kub = cub(f); // куб числа
        System.out.println(kub);

    }

    public static int cub(int x) {
        return x * x * x;
    }

    public static int modul(int d){
        return -d;
    }

    public static int hipotenusa(int a, int b){
        return a * a + b * b;
    }

}
