package homework.parcels;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box implements Iterable<Parcel>{
    List<Parcel> parcelList;

    public Box() {
        parcelList = new ArrayList<>();
    }

    public Box(List<Parcel> parcelList){
        this.parcelList = parcelList;
    }

    public void setParcelList(List<Parcel> parcelList) {
        this.parcelList = parcelList;
    }
    // в коробку надо будет добавить задуманное число посылок
    // этот метод добавляет посылку в список посылок
    public boolean addParcel(Parcel parcel){
        return parcelList.add(parcel);
    }

    public int quantity(){
        return parcelList.size();
    }
    // вес коробки = сумме весов всех посылок
    public double weightBox(){
        return parcelList.stream()
                .mapToDouble(p -> p.getWeight())
                .sum();
    }

    @Override
    public Iterator<Parcel> iterator() {
        return parcelList.iterator();
    }
}
