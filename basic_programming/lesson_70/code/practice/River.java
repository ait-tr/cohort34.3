package practice;

import java.util.Objects;

public class River implements Comparable<River> {

    private String name;
    private int length;
    private String continent;

    public River(String name, int length, String continent) {
        this.name = name;
        this.length = length;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public String getContinent() {
        return continent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        River river = (River) o;
        return Objects.equals(name, river.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "River{" + "name='" + name + '\'' + ", length=" + length + ", continent='" + continent + '\'' + '}';
    }
    // сортировка по алфавиту
    @Override
    public int compareTo(River o) {
        // можно сортировки по другим полям
        return this.name.compareTo(o.getName());
    }
}
