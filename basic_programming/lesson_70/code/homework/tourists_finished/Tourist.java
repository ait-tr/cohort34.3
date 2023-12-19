package homework.tourists_finished;

import java.util.Arrays;

public class Tourist {
    // нужен турист и страны, которые он посетил
    private String name;
    String[] countries;

    public Tourist(String name, String... countries) { // позволяет заводить массивы разной длины
        this.name = name;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public String[] getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "name='" + name + '\'' +
                ", countries=" + Arrays.toString(countries) +
                '}';
    }
}
