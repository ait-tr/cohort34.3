package homework.parcels;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Box implements Iterable<Parcel>{ // перебираем посылки в ящике
    // поле
    List<Parcel> parcels; // список посылок (опись)

    // конструктор
    public Box(int numParcels){
        Random random = new Random();
        this.parcels = Stream.generate(() -> new Parcel(random.nextDouble(0,2)))
                .limit(numParcels)
                .collect(Collectors.toList());
    }

    public List<Parcel> getParcels() {
        return parcels;
    }


    // в коробку надо будет добавить задуманное число посылок
    // этот метод добавляет посылку в список посылок
    public boolean addParcel(Parcel parcel){
        return parcels.add(new Parcel(2)); // добавляем посылку в pomegranate.Box
    }

    public int quantity(){
        return parcels.size();
    }

    // вес коробки = сумме весов всех посылок
    public double weightBox(){
        return parcels.stream()
                .mapToDouble(p -> p.getWeight())
                .sum();
    }

    @Override
    public Iterator<Parcel> iterator() {
        return parcels.iterator();
    }
}
