package practice.hashset;

public class MyHashSetAppl {
    public static void main(String[] args) {
        ISet<String> mySet = new IHashSet<>();
        System.out.println(mySet.size());
        mySet.add("Boston");
        mySet.add("Atlanta");
        System.out.println(mySet.add("Chicago"));
        mySet.add("New York");
        mySet.add("Detroit");
        System.out.println(mySet.size());
        System.out.println(mySet.add("Chicago"));
        System.out.println(mySet.size());
        System.out.println(mySet.contains("Boston"));
        System.out.println(mySet.contains("Dallas"));
        System.out.println(mySet.remove("Boston"));
        System.out.println(mySet.size());
        System.out.println(mySet.remove("Salem"));
        System.out.println(mySet.size());
        System.out.println(mySet.contains("Boston"));
        System.out.println("===== Iterator =====");
        for (String string: mySet) {
            System.out.println(string);
        }

    }
}
