package homework;

//Проверить работу IHashSet на различных наборах данных:
//        - целые числа в возрастающем порядке
//        - целые числа в убывающем порядке
//        - случайные целые числа
//        - строки (столицы государств)
//        - объекты: персоны, фильмы, книги и т.д.

import hashset.IHashSet;
import hashset.ISet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IHashSetAppl {

    public static void main(String[] args) {

        hashset.ISet<String> mySet = new hashset.IHashSet<>();
        System.out.println(mySet.size());
        mySet.add("Amsterdam");
        mySet.add("Ottawa");
        mySet.add("Berlin");
        mySet.add("Seoul");
        mySet.add("Paris");
        mySet.add("Moscow");
        mySet.add("Washington DC");
        System.out.println(mySet.size());
        mySet.add("Leipzig");
        System.out.println(mySet.size());

        System.out.println("=======Iterator=====");
        for (String s : mySet) {
            System.out.println(s);
        }

        System.out.println("======= Numbers from 1 to 100 =====");
        ISet<Integer> numberSet = new IHashSet<>();
        for (int i = 0; i < 100; i++) {
            numberSet.add(i);
        }
        printSetInteger(numberSet);

        System.out.println("======= Numbers from 100 to 1=====");
        ISet<Integer> numberSet1 = new IHashSet<>();
        for (int i = 0; i < 100; i++) {
            numberSet1.add(100 - i);
        }
        printSetInteger(numberSet1);

        System.out.println("======= Random numbers =====");
        ISet<Integer> numberSet2 = new IHashSet<>();
        for (int i = 0; i < 100; i++) {
            int random = (int)(Math.random() * (100 - 1 + 1) + 1);
            numberSet2.add(random);
        }
        printSetInteger(numberSet2);

        System.out.println("======= Objects - cars =====");
        ISet<Car> carSet = new IHashSet<>();
        Car[] car = new Car[4];
        car[0] = new Car("VW", "123", "silver");
        car[1] = new Car("Mercedes", "456", "black");
        car[2] = new Car("Volvo", "789", "brown");
        car[3] = new Car("Volvo", "789", "brown");
        for (int i = 0; i < car.length; i++) {
            carSet.add(car[i]);
        }
        printSetCar(carSet);
    }

    public static void printSetInteger(ISet<Integer> set){
        for (Integer n : set) {
            System.out.print(n + " | ");
        }
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
    }

    public static void printSetCar(ISet<Car> set){
        for (Car car : set) {
            System.out.print(car + " | ");
        }
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
    }
}
