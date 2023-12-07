package homework.anton_u;

import java.util.Iterator;
import java.util.List;

public class Box implements Iterable<Parcel>{

    List<Parcel> parcels; // список посылок

    public Box(List<Parcel> parcels){
        this.parcels = parcels;//new ArrayList<>(parcels);
    }

    public List<Parcel> getParcels() {
        return parcels;
    }

    public int quantity(){
        return parcels.size();
    }
    // вес коробки = сумме весов всех посылок
    public double weightBox(){
        return parcels.stream()
                .mapToDouble(Parcel::weight)     // берем вес у каждой посылки
                .sum();
    }

    @Override
    public String toString() {
        return "Box with parcels: " + parcels;
    }

    @Override
    public Iterator<Parcel> iterator() {
        return null;
    }
}
