package practice.tourists;

import practice.programmers.Programmer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TouristAppl {
    public static void main(String[] args) {

        // Кто больше всех стран посетил?
        List<Tourist> tourists = getTourists(); // заполняем список туристов

        System.out.println("========== Most skilled tourists ===========");
        printMostSkilledTourists(tourists);

//        System.out.println("========== Most popular countries ==========");
//        printMostPopularCountries(tourists);

        // Какие страны наиболее популярны?

    } // end of main

    private static void printMostSkilledTourists(List<Tourist> tourists) {
        // сколько раз встретилась страна, список стран
        Map<Integer, List<Tourist>> skilledTourists= tourists.stream()
                .collect(Collectors.groupingBy(p -> p.getCountries().length));

        Integer max = skilledTourists.keySet().stream()
                .max(Integer::compareTo).orElse(0);
    }

    private static List<Tourist> getTourists() {
        return List.of(
                new Tourist("Name", "C1", "C2", "C3"),
                new Tourist("Olesia", "Iran", "Kyrgystan", "United Arab Emirates", "France", "Italy", "Portugal", "Spain"),
                new Tourist("Bilbo Baggins","Italy","Spain", "Turkey"),
                new Tourist("Tatyana", "Italy", "Spain", "Italy", "Greece", "Turkey"),
                new Tourist("Anton", "Germany", "Nederland", "Turkey", "Georgia"),
                new Tourist("Sergei_B","Tunis", "Turkey", "China", "Vietnam"),
                new Tourist("Galina","Italy","France","Italy"),
                new Tourist("Anatoly","Montenegro","Albania","Greece","Italy"),
                new Tourist("Andrii", "UK","Ireland","Spain"),
                new Tourist("Liubov", "Croatien", "Slovenien", "Spain", "France", "Egypt"),
                new Tourist("Liam", "Spain", "Portugal", "Morocco", "Cyprus"),
                new Tourist("Emma", "Greece", "Turkey", "Croatia", "Montenegro"),
                new Tourist("Mia", "Italy", "Malta", "Spain", "Turkey"),
                new Tourist("Noah", "Turkey", "Greece", "Italy", "Croatia"),
                new Tourist("Olivia", "Croatia", "Montenegro", "Albania", "Greece"),
                new Tourist("Lucas", "Portugal", "Spain", "France", "Italy"),
                new Tourist("Amelia", "Greece", "Cyprus", "Spain", "Italy"),
                new Tourist("Oliver", "Spain", "Italy", "Turkey", "Greece"),
                new Tourist("Isabella", "France", "Spain", "Italy", "Greece"),
                new Tourist("Ethan", "Italy", "Greece", "Spain", "Croatia"),
                new Tourist("Ava", "Greece", "Turkey", "Spain", "Italy"),
                new Tourist("Liam", "Spain", "Italy", "Morocco", "Greece"),
                new Tourist("Sophia", "Italy", "Spain", "Turkey", "Greece"),
                new Tourist("Jackson", "Greece", "Spain", "Italy", "Croatia"),
                new Tourist("Olivia", "Croatia", "Greece", "Italy", "Montenegro"),
                new Tourist("Logan", "Spain", "Greece", "Italy", "Turkey"),
                new Tourist("Emma", "Greece", "Italy", "Spain", "Cyprus"),
                new Tourist("Aiden", "Italy", "Greece", "Spain", "Turkey")
        );
    }


} // end of class
