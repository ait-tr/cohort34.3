package homework.planets;

import java.util.Objects;

//      Занести планеты солнечной системы в список, содержащий:
//       - наименование;
//       - расстояние до Солнца;
//       - массу;
//       - количество спутников.
//
//       Вывести список планет отсортированный по:
//       - порядку расположения в солнечной системе;
//       - алфавиту;
//       - массе;
//       - количеству спутников.
public class Planet implements Comparable<Planet>{
   private String name;
   private double distance;
   private double mass;
   private int numOfSatellite;

    public Planet(String name, double distance, double mass, int numOfSatellite) {
        this.name = name;
        this.distance = distance;
        this.mass = mass;
        this.numOfSatellite = numOfSatellite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getNumOfSatellite() {
        return numOfSatellite;
    }

    public void setNumOfSatellite(int numOfSatellite) {
        this.numOfSatellite = numOfSatellite;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                ", mass=" + mass +
                ", numOfSatellite=" + numOfSatellite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Planet o) {
        return Double.compare(this.getDistance(), o.getDistance());
    }
}
