package homework.parcels;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Container implements Iterable<Box>{
    //
    private String label; // маркировка
    private List<Box> listBoxes;

    //
    public Container(String label){
        this.label = label;
        listBoxes = new ArrayList<>();
    }

    public String getLabel() {
        return label;
    }

    public List<Box> getListBoxes() {
        return listBoxes;
    }

    // в контейнер надо будет добавить задуманное число коробок с посылками
    // этот метод добавляет коробку в список коробок, который есть в контейнере
    public boolean addBox(Box box){
        return listBoxes.add(box);
    }

//    public double weightContainer() {
//        return listBoxes.stream()
//                .mapToDouble(b -> b.weightBox())
//                .sum();
//    }

    public int quantity(){
        return listBoxes.size();
    }

    public int countParcels(){
        return listBoxes.stream()
                .mapToInt(p -> p.quantity())
                .sum();
    }

    @Override
    public String toString() {
        return "Container label" + label  + ", parcels = " + countParcels() ;
    }

    @Override
    public Iterator<Box> iterator() {
        return listBoxes.iterator();
    }
}
