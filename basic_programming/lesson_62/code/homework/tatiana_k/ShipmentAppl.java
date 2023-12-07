package homework.tatiana_k;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShipmentAppl {
    public static void main(String[] args) {
        List<Container> containers = new ArrayList<>();
        getContainers(containers);
        containers.forEach(System.out::println);

        // Подсчитайте общее количество посылок во всех ящиках и их общий вес.

        int totalParcels = containers.stream().mapToInt(Container::countParsels).sum();
        double totalWeight = containers.stream().mapToDouble(Container::weight).sum();
        System.out.println("------------------------------------------------");
        System.out.println("Total number of parcels: " + totalParcels);
        System.out.println("Total weight: " + totalWeight + " kg");

        // Найдите label того из контейнеров, в котором оказалось максимальное количество посылок.
        Container maxParcelContainer = containers.stream()
                .max((c1, c2) -> Integer.compare(c1.countParsels(), c2.countParsels()))
                .orElse(null);
        System.out.println("---------------------------------------------------");
        System.out.println("Max number of parcels: " + maxParcelContainer.getLabel());

        // Найдите все контейнеры с максимальным количеством посылок.
        List<Container> containersWithMaxParcelCount = containers.stream()
                .filter(c -> c.countParsels() == maxParcelContainer.countParsels())
                .toList();

        System.out.println("-------------------------------------------------");
        System.out.println("Containers with max number of parcels: ");
        containersWithMaxParcelCount.forEach(c -> System.out.println(c.getLabel()));

    }

    public static List<Container> getContainers(List<Container> containers){  //Создание случайного количества контейнеров, коробок и посылок
        Random random = new Random();

        int containerCount = random.nextInt(11) + 10; // от 10 до 20 контейнеров
        for (int i = 1; i <= containerCount; i++) {
            Container container = new Container("Container - " + i);
            int boxCount = random.nextInt(11) + 10; // от 10 до 20 коробок
            for (int j = 1; j <= boxCount; j++) {
                Box box = new Box();
                int parcelCount = random.nextInt(6) + 5; // от 5 до 10 посылок
                for (int k = 1; k <= parcelCount; k++) {
                    box.addParcel(new Parcel(2.0)); // Предполагаем, что каждая посылка в среднем весит 2 кг
                }
                container.addBox(box);
            }
            containers.add(container);
        }
        return containers;
    }
}
