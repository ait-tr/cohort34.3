package pomegranate;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

public class PomegranateAppl {
    private static final int MIN = 100;
    private static final int MAX = 200;
    private static final int MIN_GRANATE = 10;
    private static final int MAX_GRANATE = 20;
    private static final int MIN_SEED = 400;
    private static final int MAX_SEED = 700;
    private static Random random = new Random();

    public static void main(String[] args) {

        List<Box> boxes = getRandomBoxes();

        // посчитаем сколько семян во всех коробках
        // в потоке коробок у каждой коробки посчитали сколько внутри семян (метод есть в классе Box)
        int totalSeeds = boxes.stream()
                .mapToInt(Box::countSeeds)
                .sum();

        // а можно еще и вот так
//		totalSeeds = boxes.stream()
//							.map(pomegranate.Box::countSeeds)
//							.reduce(0, (a,b) -> a + b);
//        System.out.println("Total seeds = " + totalSeeds);

        // а можно еще и вот так
//		totalSeeds = boxes.stream()
//							.flatMap(b -> StreamSupport.stream(b.spliterator(), false))
//							.flatMap(g -> StreamSupport.stream(g.spliterator(), false))
//							.count();

        System.out.println("Total seeds = " + totalSeeds);

        // находим те коробки, в которых максимальное число семян
        // .max ищет максимум
        int maxSeeds = boxes.stream()
                .mapToInt(b -> b.countSeeds())
                .max()
                .orElse(0);
        System.out.println("Max seeds = " + maxSeeds);

        // отфильтруем те коробки, в которых максимум семян
        boxes.stream()
                .filter(b -> b.countSeeds() == maxSeeds)
                .forEach(b -> System.out.println(b.getName() + " => " + b.countSeeds()));

    } // end of main

    private static List<Box> getRandomBoxes() {
        int quantity = MIN + random.nextInt(MAX - MIN + 1); // задумал случ. число в диапазоне
        // создаем стрим случайных целых чисел oт 0 до quantity, это аналог i++
        return IntStream.range(0, quantity)
                .mapToObj(i -> getBox(i))
                .collect(Collectors.toList());
    }

    private static Box getBox(int i){
        List<Pomegranate> granates = getGranates();
        Box res = new Box("Name #" + i, granates);
        return res;
    }

    private static List<Pomegranate> getGranates(){
        int quantity = MIN + random.nextInt(MAX_GRANATE - MIN_GRANATE + 1); // задумал случ. число в диапазоне
        // создаем стрим случайных целых чисел oт 0 до quantity, это аналог i++
        return IntStream.range(0, quantity)
                .mapToObj(i -> getPomegranate())
                .collect(Collectors.toList());
    }

    private static Pomegranate getPomegranate(){
        List<Seed> seeds = getSeeds();
        return new Pomegranate(seeds);
    }

    private static List<Seed> getSeeds(){
        int quantity = MIN + random.nextInt(MAX_SEED - MIN_SEED + 1); // задумал случ. число в диапазоне
        // создаем стрим случ. чисел в кол-ве quantity весом от 2 до 5
        return random.ints(quantity, 2, 5)
                .mapToObj(Seed::new)
                .collect(Collectors.toList());
    }

}
