package homework.night_temp;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NightTemp {
    public static void main(String[] args) {

        int[] nightTemperatures = {2, -3, -6, -3, 0, 1, -4, 2, 3, -3, -1, 0, -2, -5};

        //кол-во ночей с минусовой температурой
        long nightsBelowZero = Arrays.stream(nightTemperatures)  //создаем поток из массива
                .filter(t -> t < 0)  //температуры меньше нуля
                .count();
        System.out.println("Кол-во ночей с минусовой температурой: " + nightsBelowZero);

        //индекса первого заморозка
        OptionalInt firstFreezeDay = IntStream.range(0, nightTemperatures.length)  //создаем поток индексов
                .filter(i -> nightTemperatures[i] < 0)  //отрицательные температуры
                .findFirst();  //находим первый элемент

        //день первого заморозка
        firstFreezeDay.ifPresent(day -> System.out.println("Первый заморозок был на " + (day + 1) + " день"));

        //находим индекс последнего заморозка
        OptionalInt lastFreezeDay = IntStream.range(0, nightTemperatures.length)
                .filter(i -> nightTemperatures[i] < 0)
                .reduce((first, second) -> second);  //находим последний элемент

        //день последнего заморозка
        lastFreezeDay.ifPresent(day -> System.out.println("Последний заморозок произошел на " + (day + 1) + " день"));

        //максимальная температура
        OptionalInt maxTemperature = Arrays.stream(nightTemperatures)
                .max();  //находим максимальное значение
        maxTemperature.ifPresent(t -> {
            int day = IntStream.range(0, nightTemperatures.length)
                    .filter(i -> nightTemperatures[i] == t)
                    .findFirst().orElse(-1);
            System.out.println("Максимальная температура = " + t + " была на " + (day + 1) + " день");
        });

        //минимальная температура
        OptionalInt minTemperature = Arrays.stream(nightTemperatures)
                .min();
        minTemperature.ifPresent(t -> {
            int day = IntStream.range(0, nightTemperatures.length)
                    .filter(i -> nightTemperatures[i] == t)
                    .findFirst().orElse(-1);
            System.out.println("Минимальная температура= " + t + " была на " + (day + 1) + " день");
        });

        //средняя температура
        double averageTemperature = Arrays.stream(nightTemperatures)
                .average()
                .orElse(0);  //массив пуст - значение 0
        System.out.println("Средняя ночная температура: " + averageTemperature);

        //периоды с минусовой температурой подряд
        boolean consecutiveFreezingDays = IntStream.range(0, nightTemperatures.length - 1)  //поток индексов до предпоследнего дня
                .anyMatch(i -> nightTemperatures[i] < 0 && nightTemperatures[i + 1] < 0);  //проверяем наличие 2 отрицательных значений подряд
        if (consecutiveFreezingDays) {
            System.out.println("Были периоды, когда минус ночью держался несколько дней подряд");
        } else {
            System.out.println("Не было периодов с ночными морозами несколько дней подряд");
        }

    }
}
