package homework.home;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Имеется список всех зарегистрированных жильцов многоквартирного дома в формате:
    // Фамилия, Имя, пол, дата рождения, этаж, номер квартиры. Необходимо получить ответы на вопросы:
    // - в какой (каких) квартирах зарегистрировано наибольшее количество жильцов?+
    // - в какой (каких) квартирах зарегистрировано наименьшее количество жильцов?
    // - на каком (каких) этажах имеется наибольшее кол-во жильцов?
    // - какое кол-во несовершеннолетних жильцов зарегистрировано в доме?+
    // Список жильцов сформируйте в табличном редакторе, экспортируйте его в формате csv,
    // импортируйте его в объекты, сформируйте коллекцию на базе этих объектов,
    // используйте методы Stream API для получения ответов на поставленные вопросы.
public class HomeAppl {

    private static final String PATH = "basic_programming/lesson_69/code/homework/home/";

    public static void main(String[] args) {
        List<Resident> list=new ArrayList<>();

        try (BufferedReader bf= new BufferedReader(new FileReader(PATH + "residents-1.csv"))) {
            String str= bf.readLine();
            String[] cells = str.split(",");
            printCells(cells);

            str= bf.readLine();
            while (str!=null) {
                cells = str.split(",");
                list.add(new Resident(cells[0], cells[1], cells[2], LocalDate.parse(cells[3]), Integer.parseInt(cells[4]), Integer.parseInt(cells[5])));
                str= bf.readLine();
            }
            list.forEach(s-> System.out.println(s));
            System.out.println("----------------------------------------------------");

            System.out.println("List of residents under 18: ");
            list.stream()
                    .filter(p->p.getBirthDay().isAfter(LocalDate.now().minusYears(18)))
                    .forEach(s-> System.out.println(s));
            System.out.println("----------------------------------------------------");

            Map<Integer,Long>map= list.stream()
                    .collect(Collectors.groupingBy(Resident::getApartNum,Collectors.counting()));

            long max=map.values().stream()
                    .max(Long::compare)
                    .orElse(0L);

            List<Integer> listMax = map.entrySet().stream()
                    .filter(p->p.getValue()==max)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());
            System.out.println("Max number of residents living in apartments: " + listMax);
            System.out.println("----------------------------------------------------");

            long min=map.values().stream()
                    .min(Long::compare)
                    .orElse(0L);

            List<Integer>listMin= map.entrySet().stream()
                    .filter(p->p.getValue()==min)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());
            System.out.println("Min number of residents living in apartments: " + listMin);
            System.out.println("----------------------------------------------------");

            Map<Integer,Long>map1= list.stream()
                    .collect(Collectors.groupingBy(Resident::getFloor,Collectors.counting()));

            long max1=map1.values().stream()
                    .max(Long::compare)
                    .orElse(0L);

            List<Integer>listMax1= map1.entrySet().stream()
                    .filter(p->p.getValue()==max1)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());
            System.out.println("Max number of residents living on the floors: " + listMax1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        private static void printCells(String[] cells) {
            for (int i = 0; i < cells.length; i++) {
                System.out.print(cells[i]+"\t");
            }
            System.out.println();

    }
}
