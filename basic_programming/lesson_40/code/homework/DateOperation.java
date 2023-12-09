package homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateOperation {

    public static int getAge(String birthDate) {
        //TODO
        DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]");
        LocalDate date = LocalDate.parse(birthDate, df);
        System.out.println(date);
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        long age = ChronoUnit.YEARS.between(date, currentDate);
        System.out.println(age);
        int res = (int) age;
        return res;
    }

    public static String[] sortStringDates(String[] dates) {
        //TODO


        return null;
    }
}
