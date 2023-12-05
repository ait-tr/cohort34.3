package homework.granates;

import homework.granates.Box;
import homework.granates.Pomegranate;
import homework.granates.Seed;

import java.util.ArrayList;
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
		
		int totalSeeds = boxes.stream()
							.mapToInt(Box::countSeeds)
							.sum();
		
//		int totalSeeds = boxes.stream()
//							.map(Box::countSeeds)
//							.reduce(0, (a,b) -> a + b);
		
//		long totalSeeds = boxes.stream()
//							.flatMap(b -> StreamSupport.stream(b.spliterator(), false))
//							.flatMap(g -> StreamSupport.stream(g.spliterator(), false))
//							.count();
					
		System.out.println("Total seeds = " + totalSeeds);
		int maxSeeds = boxes.stream()
							.mapToInt(b -> b.countSeeds())
							.max()
							.orElse(0);
		System.out.println("max seeds = " + maxSeeds);
		boxes.stream()
				.filter(b -> b.countSeeds() == maxSeeds)
				.forEach(b -> System.out.println(b.getName() + " -> " + b.countSeeds()));

	}

// ----Box -- Container---
	private static List<Box> getRandomBoxes() {
		int size = MIN + random.nextInt(MAX - MIN + 1);
//		List<Box> res = new ArrayList<>();
//		for (int i = 0; i < size; i++) {
//			res.add(getBox(i + 1));
//		}
//		return res;
		return IntStream.range(0, size)
				.mapToObj(i -> getBox(i))
				.collect(Collectors.toList());
	}

	private static Box getBox(int i) {
		List<Pomegranate> granates = getGranates();
		Box res = new Box("Name #" + i, granates);
		return res;
	}

	private static List<Pomegranate> getGranates() {
		int size = MIN_GRANATE + random.nextInt(MAX_GRANATE - MIN_GRANATE + 1);
//		List<Pomegranate> res = new ArrayList<>();
//		for (int i = 0; i < size; i++) {
//			res.add(getPomegranate());
//		}
//		return res;
		return IntStream.range(0, size)
				.mapToObj(i -> getPomegranate())
				.collect(Collectors.toList());
	}

	private static Pomegranate getPomegranate() {
		List<Seed> seeds = getSeeds();
		return new Pomegranate(seeds);
	}

	private static List<Seed> getSeeds() {
		int size = MIN_SEED + random.nextInt(MAX_SEED - MIN_SEED + 1);
//		List<Seed> res = new ArrayList<>();	
//		for (int i = 0; i < size; i++) {
//			res.add(new Seed(2));
//		}
//		return res;
		return random.ints(size, 2, 5)
//						.mapToObj(n -> new Seed(n))
						.mapToObj(Seed::new)
						.collect(Collectors.toList());
	}

}
