package homework.ilist_hw;


import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class IListAppl {
    public static void main(String[] args) {
/*
        // список с целыми числами
        IList<Integer> list = new IListImpl<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.add(10); // add 10
        list.add(20); // add 20
        list.add(30); // add 30
        list.add(40); // add 40
        System.out.println("Size: " + list.size()); //
        System.out.println("Is empty? " + list.isEmpty());
        // print list
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println("--------------------");
        System.out.println("Index of 30: " + list.indexOf(30));
        System.out.println("--------------------");
        System.out.println("Index of 10: " + list.indexOf(10));
        System.out.println("Index of 40: " + list.indexOf(40));
        System.out.println("--------------------");
        System.out.println("Last Index of 10: " + list.lastIndexOf(10));
        System.out.println("Last Index of 40: " + list.lastIndexOf(40));
        System.out.println("--------------------");
        int m = 50;
        list.add(m); // add m
        int k = list.indexOf(m);
        System.out.println("Index of " + m + " = " + k); // индекс 50 в листе

        list.remove(list.indexOf(50)); // remove 50
        System.out.println(list.contains(50));// есть ли элемент 50 в листе?
        System.out.println(list.indexOf(50)); // индекс несуществующего элемента
        System.out.println("--------------------");
        list.add(2, null); // добавляем элемент null
        for (Integer el : list) {
            System.out.println(el);
        }
        System.out.println("--------------------");
        list.add(60); // add 60
        list.add(20); // add 20 once again
        for (Integer el : list) {
            System.out.println(el);
        }
        System.out.println("--------------------");
        list.remove(null);
        for (Integer el : list) {
            System.out.println(el);
        }
        System.out.println("--------------------");
        int q = list.lastIndexOf(20);
        list.remove(q);
        for (Integer el : list) {
            System.out.println(el);
        }
        System.out.println("--------------------");
        Integer r = 60;
        list.remove(r);
        for (Integer el : list) {
            System.out.println(el);
        }
*/
        // список с данными типа String
        IList<String> city = new IListImpl<>();
        System.out.println("=============================");
        city.add("London");
        city.add("Amsterdam");
        city.add("Berlin");
        city.add("Paris");
        city.add("Madrid");
        city.add("Istanbul");
        city.add("Moscow");

        for (String s : city) {
            System.out.print(s + " | ");
        }

        System.out.println();
        for (int i = 0; i < city.size(); i++) {
            System.out.print(city.get(i) + ", ");
        }



/*

  System.out.println("--------------------");
        System.out.println(city.indexOf("London"));
        System.out.println(city.lastIndexOf("London"));
//        System.out.println(city.set(0, "New York")); // todo зачем тогда писать сам Элемент??
        city.set(0, "New York"); // вместо London ставим New York
        System.out.println("--------------------");
        System.out.println(city.get(0));
        System.out.println("--------------------");

        System.out.println();
        System.out.println(city.size());
        printMetods("isEmpty");
        System.out.println(city.isEmpty());
        printMetods("contains");
        System.out.println(city.contains("St. Petersburg"));

        printMetods("indexOf");
        System.out.println(city.indexOf("Istanbul"));
        printMetods("remove");
        city.remove(1);
        printArr(city);
        System.out.println("--------------------");
        printMetods("ADD");
        city.add("Bora-Bora");
        printArr(city);
        printMetods("set");

        printMetods("ensureCapasity");

        printMetods("lastIndexOf"); // Working
        System.out.println(city.lastIndexOf("Madrid"));
        System.out.println(city.lastIndexOf("Berlin")); // todo почему не работает??

        System.out.println("--------------------");

    }
    public static void printMetods(String str){
        System.out.println("=============" + str+ "=============");
        System.out.println();
    }
    public static void printArr(IList<String> arr){
        for (String o : arr){
            System.out.print(o + " | ");
        }
        System.out.println();
    }

 */
    }
}






