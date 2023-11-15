package country;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CountryListAppl {
    public static void main(String[] args) {

        List<Country> countries = new LinkedList<Country>();

        Country[] country = new Country[11];
        country[0] = new Country("United Kindom", 50, "Europe");
        country[1] = new Country("Germany", 80, "Europe");
        country[2] = new Country("Spain", 40, "Europe");
        country[3] = new Country("France", 45, "Europe");
        country[4] = new Country("China", 1600, "Asia");
        country[5] = new Country("Japan", 150, "Asia");
        country[6] = new Country("India", 1200, "Asia");
        country[7] = new Country("USA", 250, "North America");
        country[8] = new Country("Canada", 120, "North America");
        country[9] = new Country("Brasilia", 100, "South America");
        country[10] = new Country("Argentina", 80, "South America");

        for (int i = 0; i < country.length; i++) {
            countries.add(country[i]);
        }

        System.out.println("----------- Unsorted ---------");
        for (Country c : countries) {
            System.out.println(c);
        }

        Comparator<Country> comparatorByPopulation = new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o1.getPopulation() - o2.getPopulation();
            }
        };

        System.out.println("----------- Sorted by Population ---------");
        countries.sort(comparatorByPopulation);
        for (Country c : countries) {
            System.out.println(c);
        }
    Comparator<Country> comparatorByContinentAndPopulation = new Comparator<Country>() {
        @Override
        public int compare(Country o1, Country o2) {
            int res = o1.getContinent().compareTo(o2.getContinent());
            return res !=0 ? res : -(o1.getPopulation() - o2.getPopulation());
        }
    };
        System.out.println("----------- Sorted by Contintnt and Population ---------");
        countries.sort(comparatorByContinentAndPopulation);
        for (Country c : countries) {
            System.out.println(c);
        }

    }
}
