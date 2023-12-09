package homework.parcels;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Container implements Iterable<Box>{
    //
    private String label; // маркировка
    private List<Box> boxes;

    //
    public Container(String label, int numBoxes){
        this.label = label;
        Random random = new Random();
        this.boxes = IntStream.range(0, numBoxes)
                .mapToObj(i -> new Box(random.nextInt(5, 11)))
                .collect(Collectors.toList());
    }

    // кол-во посылок в контейнере
    public int getTotalParcels(){
        return boxes.stream()
                .mapToInt(box -> box.parcels.size())
                .sum();
    }

    public String getLabel() {
        return label;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    // в контейнер надо будет добавить задуманное число коробок с посылками
    // этот метод добавляет коробку в список коробок, который есть в контейнере
    public boolean addBox(Box box){
        return boxes.add(box);
    }

//    public double weightContainer() {
//        return boxes.stream()
//                .mapToDouble(b -> b.weightBox())
//                .sum();
//    }

    public int quantity(){
        return boxes.size();
    }

    public int countParcels(){
        return boxes.stream()
                .mapToInt(p -> p.quantity())
                .sum();
    }

    @Override
    public String toString() {
        return "Container label" + label  + ", parcels = " + countParcels() ;
    }

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }
}
