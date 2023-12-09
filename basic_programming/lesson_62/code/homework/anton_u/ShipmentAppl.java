package homework.anton_u;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShipmentAppl {

    private static final int MIN_CONTAINERS = 10;
    private static final int MAX_CONTAINERS = 20;
    private static final int MIN_BOXES = 10;
    private static final int MAX_BOXES = 20;
    private static final int MIN_PARCELS = 5;
    private static final int MAX_PARCELS = 10;
    private static final double MIN_WEIGHT = 1.0;  // Заменено на числовые значения
    private static final double MAX_WEIGHT = 2.0;
    private static Random random = new Random();

    public static void main(String[] args) {

        // Создаем список контейнеров
        List<Container> containers = new ArrayList<>();

        // Генерируем случайное количество контейнеров и добавляем их в список
        int numContainers = random.nextInt(MAX_CONTAINERS - MIN_CONTAINERS + 1) + MIN_CONTAINERS;
        for (int i = 0; i < numContainers; i++) {
            containers.add(generateRandomContainer());
        }

        // Вывод информации о контейнерах
        containers.forEach(container -> {
            System.out.println(container);
            container.forEach(box -> {
                System.out.println("\t" + box);
                box.forEach(parcel -> System.out.println("\t\t" + parcel));
            });
        });

        calculateTotalParcelsAndWeight(containers);

        // Находим и выводим все контейнеры с максимальным количеством посылок

        List<Container> containersWithMaxParcels = findContainersWithMaxParcels(containers);
        System.out.println("Контейнеры с максимальным количеством посылок:");
        containersWithMaxParcels.forEach(container -> {
            int parcelCount = container.countParcels(); // Фактическое количество посылок
            System.out.println(container.getLabel() + ": " + parcelCount);
        });
    }

    // создание случайного контейнера
    private static Container generateRandomContainer() {
        // Генерируем уникальную метку для контейнера
        String containerLabel = "Label # " + (random.nextInt(100) + 1);
        // Генерируем случайные коробки для контейнера
        int numBoxes = random.nextInt(MAX_BOXES - MIN_BOXES + 1) + MIN_BOXES;
        List<Box> boxList = generateRandomBoxes(numBoxes);

        // Создаем и возвращаем новый контейнер с новыми коробками
        Container container = new Container(containerLabel, boxList);

        // Добавляем коробки к контейнеру
        boxList.forEach(container::addBox);
        return container;
    }

    // создание случайных коробок
    private static List<Box> generateRandomBoxes(int numBoxes) {
        // Используем IntStream для создания списка коробок со случайными посылками
        return IntStream.range(0, numBoxes)
                .mapToObj(i -> {
                    List<Parcel> parcelList = generateRandomParcels();
                    return new Box(parcelList);
                })
                .collect(Collectors.toList());
    }

    // создание случайных посылок
    private static List<Parcel> generateRandomParcels() {
        int numParcels = random.nextInt(MAX_PARCELS - MIN_PARCELS + 1) + MIN_PARCELS;
        return IntStream.range(0, numParcels)
                .mapToObj(i -> new Parcel(random.nextDouble() * (MAX_WEIGHT - MIN_WEIGHT) + MIN_WEIGHT))
                .peek(parcel -> parcel.setWeight(random.nextDouble() * (MAX_WEIGHT - MIN_WEIGHT) + MIN_WEIGHT))
                .collect(Collectors.toList());
    }

    private static void calculateTotalParcelsAndWeight(List<Container> containers) {
        int totalParcels = 0;
        double totalWeight = 0.0;

        for (Container container : containers) {
            totalParcels += container.countParcels();
            totalWeight += container.weightContainer();
        }

        System.out.println("Общее количество посылок: " + totalParcels);
        System.out.println("Общий вес посылок: " + totalWeight);
    }

    private static List<Container> findContainersWithMaxParcels(List<Container> containers) {
        int maxParcels = containers.stream()
                .mapToInt(Container::countParcels)
                .max()
                .orElse(0);

        return containers.stream()
                .filter(container -> container.countParcels() == maxParcels)
                .collect(Collectors.toList());
    }
}
