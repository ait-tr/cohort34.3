package homework.yachts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class YachtAppl {
    public static void main(String[] args) {
        List<Yacht> yachts = new ArrayList<>();
        yachts.add(new Yacht("Beneteau", 2004, 20.5, "plastic", 100_000));
        yachts.add(new Yacht("Jeannue", 2009, 18.2, "wood", 230_000));
        yachts.add(new Yacht("Dufour", 2016, 25.0, "metal", 310_000));
        yachts.add(new Yacht("Bavaria", 2021, 22.8, "wood", 490_000));

        System.out.println("Все яхты: ");
        yachts.forEach(System.out::println);
        System.out.println();

        //яхты из материала корпуса "wood"
        String material = "wood";
        List<Yacht> woodYachts = yachts.stream()
                .filter(yacht -> yacht.getMaterial().equalsIgnoreCase(material))
                .collect(Collectors.toList());
        System.out.println("Яхты из материала " + material + ":");
        woodYachts.forEach(System.out::println);
        System.out.println();

        //яхты дороже 250000
        double priceThreshold = 250_000;
        List<Yacht> expensiveYachts = yachts.stream()
                .filter(yacht -> yacht.getPrice() > priceThreshold)
                .collect(Collectors.toList());
        System.out.println("Яхты дороже " + priceThreshold + ":");
        expensiveYachts.forEach(System.out::println);
        System.out.println();

        //яхты c годом выпуска 2005-2017
        int startYear = 2005;
        int endYear = 2017;
        List<Yacht> yachtsInRange = yachts.stream()
                .filter(yacht -> yacht.getYear() >= startYear && yacht.getYear() <= endYear)
                .collect(Collectors.toList());
        System.out.println("Яхты c годом выпуска от " + startYear + " до " + endYear + ": ");
        yachtsInRange.forEach(System.out::println);
        System.out.println();

        //сортировка яхт в порядке убывания стоимости
        yachts.sort(Comparator.comparingDouble(Yacht::getPrice).reversed());
        System.out.println("Яхты отсортированные по убыванию стоимости: ");
        yachts.forEach(System.out::println);
        System.out.println();

        //средняя стоимость яхты
        double averageCost = yachts.stream()
                .mapToDouble(Yacht::getPrice)
                .average()
                .orElse(0.0);
        System.out.println("Средняя стоимость яхты: " + averageCost);

    }
}
