package homework.parcels;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ShipmentAppl {

    private static final int MIN_CONTAINERS = 10;
    private static final int MAX_CONTAINERS = 20;
    private static final int MIN_BOXES = 10;
    private static final int MAX_BOXES = 20;
    private static final int MIN_PARCELS = 5;
    private static final int MAX_PARCELS = 10;


    public static void main(String[] args) {
        Random random = new Random();
        int numContainers = random.nextInt(10,21); // От 10 до 20 контейнеров


        List<Container> containers = Stream.generate(() ->
                        new Container("Wakanda" , random.nextInt(10,21)))
                .limit(numContainers)
                .collect(Collectors.toList());

        List<Integer> contNumbers = IntStream.rangeClosed(1, numContainers)
                .boxed()
                .collect(Collectors.toList());

        IntStream.range(0, numContainers).forEach(index -> {
            Container container = containers.get(index);
            System.out.println("Container " + contNumbers.get(index) + " : " + container.getLabel());
            container.getBoxes().forEach(box -> {
                System.out.println("  Box with " + box.parcels.size() + " parcels");
                box.parcels.forEach(parcel ->
                        System.out.println("    Parcel with weight: " + parcel.getWeight() + " kg"));
            });
            System.out.println();
        });

        int totalParcels = containers.stream()
                .mapToInt(Container::getTotalParcels)
                .sum();

        double totalWeight = containers.stream()
                .flatMap(container -> container.getBoxes().stream())
                .flatMap(box -> box.parcels.stream())
                .mapToDouble(parcel -> parcel.getWeight())
                .sum();

        System.out.println("Total parcels: " + totalParcels);
        System.out.println("Total weight: " + totalWeight + " kg");

        int maxParcels = containers.stream()
                .mapToInt(Container::getTotalParcels)
                .max()
                .orElse(0);
        System.out.println("Max parcel in Container = " + maxParcels);
        System.out.println();
        System.out.println("Containers with the maximum number of parcels:");
        containers.stream()
                .filter(container -> container.getTotalParcels()==maxParcels)
                .forEach(System.out::println);

    }
}