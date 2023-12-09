package homework.tatiana_k;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box implements Iterable<Parcel>{
    private List<Parcel> parcels;

    public Box(List<Parcel> parcels){
        this.parcels = new ArrayList<>();
    }

    public Box() {
        parcels = new ArrayList<>();
    }

    public List<Parcel> getParcels() {
        return parcels;
    }

    public boolean addParcel(Parcel parcel) {
        return parcels.add(new Parcel(2)); //добавляем посылку в бокс с весом 2 кг
    }

    public int parcelQuantity() {
        return parcels.size();
    }

    public double weightBox() {
        return parcels.stream().mapToDouble(Parcel::getWeight).sum();
    }

    @Override
    public Iterator<Parcel> iterator() {
        return parcels.iterator();
    }
}