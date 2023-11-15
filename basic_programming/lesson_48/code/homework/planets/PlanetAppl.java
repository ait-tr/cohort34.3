package homework.planets;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlanetAppl {

    public static void main(String[] args) {

        List<Planet> planets = new ArrayList<>();

        planets.add(new Planet("Mercury", 58, 0.33, 0));
        planets.add(new Planet("Venice", 108, 4.81, 0));
        planets.add(new Planet("Earth", 150, 5.98, 1));
        planets.add(new Planet("Mars", 228, 0.63, 2));
        planets.add(new Planet("Jupiter", 775.5, 1876.64, 95));
        planets.add(new Planet("Saturn", 1427, 561.80, 82));
        planets.add(new Planet("Uran", 2860, 86.05, 27));
        planets.add(new Planet("Neptun", 4500, 101.59, 14));

        Comparator<Planet> comparatorAlphabet = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        System.out.println("------------- Sort by alphabet ------------");
        planets.sort(comparatorAlphabet);
        for (Planet p : planets) {
            System.out.println(p);
        }

        Comparator<Planet> comparatorDistance = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return Double.compare(o1.getDistance(), o2.getDistance());
            }
        };
        System.out.println("------------- Sort by distance ------------");
        planets.sort(comparatorDistance);
        for (Planet p : planets) {
            System.out.println(p);
        }

        // далее по аналогии

    }
}
