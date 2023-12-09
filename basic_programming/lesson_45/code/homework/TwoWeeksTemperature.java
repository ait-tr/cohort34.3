package homework;

//      Имеются результаты измерений температуры в городе за последнюю неделю октября и первую неделю ноября.
//      Данные представлены в виде двух массивов.
//      Рассчитайте среднюю температуру в городе за прошедшие две недели.

public class TwoWeeksTemperature {
    public static void main(String[] args) {

        double[] weekTemperature1 = {12.1, 13.5, 15.2, 17.6, 14.2, 13.0, 10.4};
        double[] weekTemperature2 = {10.2, 8.4, 5.7, 3.5, 2.2, 1.5, -2.1};

        double sum1 = 0;
        for (int i = 0; i < weekTemperature1.length; i++) {
            sum1 += weekTemperature1[i];
        }
        double avg1 = sum1 / weekTemperature1.length;
        System.out.println(avg1);

        double sum2 = 0;
        for (int i = 0; i < weekTemperature2.length; i++) {
            sum2 += weekTemperature2[i];
        }
        double avg2 = sum2 / weekTemperature2.length;
        System.out.println(avg2);

        double avg = (avg1 + avg2) / 2;
        System.out.println(avg);
        System.out.println("-----------------");

        for (int i = 0; i < weekTemperature2.length; i++) {
            sum1 += weekTemperature2[i];
        }
        double avgCheck = sum1 / (weekTemperature1.length + weekTemperature2.length);
        System.out.println(avgCheck);

    }
}
