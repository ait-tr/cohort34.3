package practice;

import java.util.*;

public class RiverAppl {
    public static void main(String[] args) {

        // реки в массиве
        River[] river = new River[7];

        river[0] = new River("Lech", 3000, "Europe");
        river[1] = new River("Thames", 3460, "Europe");
        river[2] = new River("Isar", 2900, "Europe");
        river[3] = new River("Main", 2600, "Europe");
        river[4] = new River("Nile", 6650, "Africa");
        river[5] = new River("Mississippi", 3770, "North America");
        river[6] = new River("Amazon", 7062, "South America");

        // найти общую длину, максимальную длину и т.д.
        // отсортировать
        int sum = Arrays.stream(river)
                .filter(Objects::nonNull)
                .mapToInt(River::getLength)
                .sum();
        System.out.println("Sum of lengths : " + sum);

        OptionalInt max = Arrays.stream(river)
                .filter(Objects::nonNull)
                .mapToInt(River::getLength)
                .max();
        System.out.println("Max length river: " + max.getAsInt());

        // sorting native
        Arrays.sort(river);
        for (int i = 0; i < river.length; i++) {
            System.out.println(river[i]);
        }

        System.out.println("----------------------------------------------");
        // sort by length
        Comparator<River> lengthComparator = Comparator.comparing(River::getLength);
        Arrays.sort(river, lengthComparator);
        for (River r : river) {
            System.out.println(r);
        }

        System.out.println("----------------------------------------------");
        // River in List
        List<River> riverList = new ArrayList<>(List.of(
                new River("Ob", 6500, "Asia"),
                new River("Amazon", 6575, "South America"),
                new River("Dnieper", 2201, "Europe")
        )
        );

        // объединяем массив и лист
        Collections.addAll(riverList, river);
        System.out.println(riverList.size());
        // sort по алфавиту
        Collections.sort(riverList);
        riverList.stream()
                .forEach(System.out::println);

        Collections.addAll(riverList, river);
        riverList.forEach(System.out::println);
        // данные задвоены

        // River in Set
        System.out.println("=======================================");
        Set<River> riverSet = new HashSet<>();
        // переложим данные из списка во множество
        for (River r : riverList) {
            riverSet.add(r);
        }
        riverSet.forEach(System.out::println);
        System.out.println(riverSet.size());

        // Перекладываем в TreeSet
        System.out.println("=======================================");
        Set<River> riverTreeSet = new TreeSet<>(riverSet);
//        for (River r : riverSet) {
//            riverTreeSet.add(r);
//        }
        riverTreeSet.forEach(System.out::println);
        // добавили еще реки
        River[] rivers = new River[11];
        rivers[0] = new River("Thames", 2500, "Europe");
        rivers[1] = new River("Nile", 6650, "Africa");
        rivers[2] = new River("Mississippi", 3770, "North America");
        rivers[3] = new River("Amazon", 6575, "South America");
        rivers[4] = new River("Murray", 2520, "Australia");
        rivers[5] = new River("Ice River", 1800, "Antarctica");
        rivers[6] = new River("Yangtze", 6380, "Asia");
        rivers[7] = new River("Seine", 776, "Europe");
        rivers[8] = new River("Congo", 4700, "Africa");
        rivers[9] = new River("Yenisei", 5542, "North America");
        rivers[10] = new River("Orinoco", 2140, "South America");

        System.out.println("=======================================");
        Collections.addAll(riverTreeSet, rivers);
        riverTreeSet.forEach(System.out::println);
        System.out.println(riverTreeSet.size());

        // сделаем мапу: ключ - континент, значение - сколько на нем рек
        Map<String, Integer> riverMap = new TreeMap<>();
        for (River r : riverTreeSet) {
            String continent = r.getContinent(); // определили ключ
            riverMap.put(continent, riverMap.getOrDefault(continent, 0) + 1);
        }

        // печатаем содержимое мапы
        System.out.println("=======================================");
        for (Map.Entry<String, Integer> entry : riverMap.entrySet()) {
            System.out.println("Comtinent: " + entry.getKey() + " Number of rivers: " + entry.getValue());
        }
    }
}
