package homework.pomegranate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box implements Iterable<Pomegranate>{

    String name;
    List<Pomegranate> granates;

    public Box(String name) {
        this.name = name;
        granates = new ArrayList<>();
    }

    public Box(String name, List<Pomegranate> granates) {
        this.name = name;
        this.granates = granates;
    }

    // можно узнать имя коробки
    public String getName() {
        return name;
    }

    // заполняем ящик гранатами (их списком)
    public void setGranates (List<Pomegranate> granates){
        this.granates = granates;
    }

    // метод добавляет гранаты в ящик по одному
    public boolean addGrarnate(Pomegranate granate){
        return granates.add(granate);
    }

    // вес ящика = сумме весов всех гранатов в нем
    public double weight(){
        return granates.stream()
                .mapToDouble(g -> g.weight())
                .sum();
    }

    // сколько гранатов в ящике
    public int quantity(){
        return granates.size(); // длина списка = кол-во гранатов в ящике
    }

    // а сколько зернышек в ящике во всех гранатах?
    // у каждого граната взять кол-во в нем зернышек и просуммировать
    public int countSeeds(){
        return granates.stream()
                .mapToInt(g -> g.quantitySeedsInGranat())
                .sum();
    }

    @Override
    public String toString() {
        return "Box: name=" + name + ", granates = " + quantity() + ", seeds " + countSeeds();
    }

    @Override
    public Iterator<Pomegranate> iterator() {
        return granates.iterator();
    }
}
