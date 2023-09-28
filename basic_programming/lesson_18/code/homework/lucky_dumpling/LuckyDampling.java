package homework.lucky_dumpling;
// Задача про поиск "счастливого пельменя".
// Часть 1.
// Хозяйка налепила для гостей 30 пельменей, каждый весом от 25 до 35 грамм.
// Напишите программу, которая занесет в массив данные о весе каждого слепленного пельменя.
// Часть 2.
// Хозяйка налепила для гостей 30 пельменей. В один из пельменей она положила монету,
// которая увеличивает вес пельменя на 15 грамм.
// Напишите программу, которая ищет счастливый пельмень.

public class LuckyDampling {
    public static void main(String[] args) {
        // заполняем массив на 30 пельменей с весом от 25 до 35 грамм
        int[] dumpling = new int[30];
        dumpling = Methods.fillArray(30, 25, 35);
        Methods.printArray(dumpling); // напечатал массив
        Methods.split();

        // задумываем номер счастливого пельменя
        int a = 0;
        int b = 29;
        int luckyDumplingIndex = (int)(Math.random() * (b - a + 1) + a);

        // увеличиваем массу этого пельменя на 15 грамм
        dumpling[luckyDumplingIndex] += 15; // положил монетку в пельмень
        Methods.printArray(dumpling); // напечатал
        Methods.split();

        // ищем в массиве "тяжелый" пельмень
        for (int i = 0; i < dumpling.length; i++) {
            if(dumpling[i] >= 40){
                System.out.println("Index of lucky dumpling is: " + i);
            }
        }
        System.out.println("Done!");
    }
}
