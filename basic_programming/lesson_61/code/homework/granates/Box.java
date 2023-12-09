package homework.granates;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box implements Iterable<Pomegranate>{
	private String name;
	private List<Pomegranate> granates;

	public Box(String name) {
		this.name = name;
		granates = new ArrayList<>();
	}
	
	public Box(String name, List<Pomegranate> granates) {
		this.name = name;
		this.granates = granates;
	}

	public String getName() {
		return name;
	}

	public void setGranates(List<Pomegranate> granates) {
		this.granates = granates;
	}
	
	public boolean addGranate(Pomegranate granate) {
		return granates.add(granate);
	}
	
	public double weight() {
		return granates.stream()
				.mapToDouble(g -> g.weight())
				.sum();
	}
	
	public int quantity() {
		return granates.size();
	}
	
	public int countSeeds() {
		return granates.stream()
				.mapToInt(g -> g.quantity())
				.sum();
	}

	@Override
	public Iterator<Pomegranate> iterator() {
		return granates.iterator();
	}

	@Override
	public String toString() {
		return "pomegranate.Box {name=" + name + ", seeds= " + countSeeds() + "}";
	}

}
