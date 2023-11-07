package homework;

// Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
// Выведите на печать температуру, которая была во вторник и затем в четверг.
// Найти среднюю температуру за прошлую неделю.

public class Temperature {
    public static void main(String[] args) {
        // инициализация массива
        double[] tempInCity = {16.0, 18.0, 17.5, 22.6, 25.0, 28.0, 26.8};
        double sumTemp = 0;
        double averageTemp = 0;
        System.out.println("Temperature in Tuesday was: " + tempInCity[1]);
        System.out.println("Temperature in Thursday was: " + tempInCity[3]);
        // находим сумму всех температур за неделю
        for (int i = 0; i < tempInCity.length; i++) {
            sumTemp = sumTemp + tempInCity[i];
        }
        // находим среднюю температуру
        averageTemp = sumTemp / tempInCity.length;
        // печатаем
        System.out.println("Average temperature in City = " + averageTemp);
        System.out.printf("Average temperature in City = %.2f", averageTemp);
        System.out.print(" Celsius");
        System.out.println("\nDone!");
    }
}
