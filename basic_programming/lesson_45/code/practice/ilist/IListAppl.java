package practice.ilist;

public class IListAppl {
    public static void main(String[] args) {

        // список с целыми числами
        IList<Integer> list = new IListImpl<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println("--------------------");
        System.out.println(list.indexOf(30));

        System.out.println("--------------------");

        // список с данными типа String
        IList<String> listOfCities = new IListImpl<>();
        listOfCities.add("Berlin");
        // ...
        System.out.println(listOfCities.size());
        System.out.println(listOfCities.isEmpty());


    }
}
