package consultation.city;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    City[] cities;

    @BeforeEach
    void setUp() {
        cities = new City[6];
        cities[0] = new City("Berlin", 800_000, "USA", 7.0);
        cities[1] = new City("Berlin", 670_000, "USA", 7.5);
        cities[2] = new City("Chicago", 2_700_000, "USA", 6.0);
        cities[3] = new City("Atlanta", 470_000, "USA", 8.0);
        cities[4] = new City("New York", 8_500_000, "USA", 6.5);
        cities[5] = new City("Dallas", 1_300_000, "USA", 3.0);
    }

    private void printArray(Object[] arr, String title){
        System.out.println("============" + title + "===============");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    @Test
    void testComparableNativeSort(){
        printArray(cities, "Original array");
        Arrays.sort(cities);
        printArray(cities, "Sorted by name and population");
    }

    @Test
    void testComparator(){
        Comparator<City> comparator = (c1, c2) -> Double.compare(c2.getIndex(), c1.getIndex());
        printArray(cities, "Before sorting");
        Arrays.sort(cities, comparator);
        printArray(cities, "After sorting");
    }

}