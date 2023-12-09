package consultation;

// Занести в массив дни недели
// Вывести на печать вторник, среда, пятница
// Напечатать неделю с понедельника по воскресенье, наоборот, начиная с воскресенья.

public class WeekDays {
    public static void main(String[] args) {
        int day1 = 1;
        int day2 = 2;
        int day3 = 3;

        int[] dayWeek = {1, 2, 3, 4, 5, 6, 7};// все индексы начинаются с 0
        System.out.println(dayWeek[0]);
        System.out.println(dayWeek[6]);

        String[] dayWeekString = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(dayWeekString[0]);
        System.out.println(dayWeekString[6]);

        // вторник среда пятница
        System.out.println(dayWeek[1]);
        System.out.println(dayWeek[2]);
        System.out.println(dayWeek[4]);

        System.out.println(dayWeekString[1]);
        System.out.println(dayWeekString[2]);
        System.out.println(dayWeekString[4]);

        // распечатаем dayWeek
        for (int i = 0; i < dayWeek.length; i++) {
            System.out.print(dayWeek[i] + " ");
        }

        System.out.println();
        // распечатаем dayWeekString
        for (int i = 0; i < dayWeekString.length; i++) {
            System.out.print(dayWeekString[i] + " ");
        }
        System.out.println();
        // распечатаем массивы задом наперед
        for (int i = dayWeek.length - 1; i >= 0 ; i--) {
            System.out.print(dayWeek[i] + " ");
        }
        System.out.println();
        for (int i = dayWeekString.length - 1; i >= 0 ; i--) {
            System.out.print(dayWeekString[i] + " ");
        }

        System.out.println();
        System.out.println("Week in Arabic style:");
        printWeekArabic(dayWeekString); // вызываем метод и передаем в него массив, с которым он будет работать

    }
    public static void printWeekArabic(String[] str){
        //print Sunday
        System.out.print(str[6] + " ");
        // print rest of the week in cycle
        for (int i = 0; i < str.length - 1; i++) {
            System.out.print(str[i] + " ");
        }
    }
}
