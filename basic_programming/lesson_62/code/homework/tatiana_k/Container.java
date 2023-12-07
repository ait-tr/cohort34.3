package homework.tatiana_k;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Container implements Iterable<Box>{
    private String label;
    List<Box> boxes;

    public Container(String label) {
        this.label = label;
        boxes = new ArrayList<>();
    }

    public String getLabel() {
        return label;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public boolean addBox(Box box){
        return boxes.add(box);
    }

    public double weight() {
        return boxes.stream()
                .mapToDouble(b -> b.weightBox())
                .sum();
    }
    public int quantity(){
        return boxes.size();
    }
    public int countParsels(){
        return boxes.stream()
                .mapToInt(p -> p.parcelQuantity())
                .sum();
    }

    @Override
    public String toString() {
        return "Container label " + label +
                ", parsels " + countParsels();
    }

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }

}
