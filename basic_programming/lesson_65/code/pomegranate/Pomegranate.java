package pomegranate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pomegranate implements Iterable<Seed>{

    List<Seed> seeds;

    public Pomegranate() {
        seeds = new ArrayList<>();
    }

    public Pomegranate(List<Seed> seeds) {
        this.seeds = seeds;
    }

    public void setSeeds(List<Seed> seeds) {
        this.seeds = seeds;
    }

    // метод добавляет по одному зернышку в гранат
    public boolean addSeed(Seed seed){
        return seeds.add(seed);
    }

    // кол-во зернышек в гранате
    public int quantitySeedsInGranat(){
        return seeds.size();
    }

    public double weight() {
        return seeds.stream()
                .mapToDouble(s -> s.getWeight())
                .sum();
        // у всех зерен взять их вес, перевести их в Double, все просуммировать
    }


    @Override
    public Iterator<Seed> iterator() {
        return seeds.iterator();
    }
}
