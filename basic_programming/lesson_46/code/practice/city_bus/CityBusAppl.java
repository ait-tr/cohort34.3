package practice.city_bus;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CityBusAppl {
    public static void main(String[] args) {

//        - создать список городских маршрутов на основе автобусов из городского автопарка;
//        - подсчитать общую вместимость автобусов из автопарка.

        // создаем список
        List<Bus> cityBus = new ArrayList<>();

        cityBus.add(new Bus("Mercedes", "num1", "100", 30));
        cityBus.add(new Bus("Scania", "num2", "10A", 40));
        cityBus.add(new Bus("MAN", "num3", "10C", 25));
        cityBus.add(new Bus("Mercedes", "num4", "3", 35));
        cityBus.add(new Bus("Volvo", "num5", "100", 45));

        // создали
        Bus bus = new Bus("MANN", "num6", "200", 90);
        // добавили в список
        cityBus.add(bus);

        System.out.println(cityBus.size());
        System.out.println("Is empty? - " + cityBus.isEmpty());
        System.out.println(cityBus); // простая черновая печать
        System.out.println("--------Unsorted List------------");

        // печать списка в столбик
        for (Bus b : cityBus) { // для всех объектов b типа Bus из списка cityBus делать
            System.out.println(b);
        }

        // сортировка
        cityBus.sort(Bus::compareTo); // произошла сортировка в памяти компьютера

        // печатаем
        System.out.println("--------Sorted List------------");
        for (Bus b : cityBus) { // для всех объектов b типа Bus из списка cityBus делать
            System.out.println(b);
        }

        int totalCapacity = 0;
        //считаем общую вместимость
        for (Bus b : cityBus ) {
            totalCapacity += b.getBusCapacity(); // берем методы от элемента списка b
        }
        System.out.println("Total capacity: " + totalCapacity);

        Comparator<Bus> comparator = new Comparator<Bus>() {
            @Override
            public int compare(Bus o1, Bus o2) {
                return o1.getBusCapacity() - o2.getBusCapacity();
            }
        };

        System.out.println("--------Sorted List by capacity------------");
        cityBus.sort(comparator);
        // печатаем
        for (Bus b : cityBus) { // для всех объектов b типа Bus из списка cityBus делать
            System.out.println(b);
        }

    }
}
