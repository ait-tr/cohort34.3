package hashset;

public class IHashSetAppl {

    public static void main(String[] args) {

        ISet<String> mySet = new IHashSet<>();
        System.out.println(mySet.size());
        mySet.add("Berlin");
        mySet.add("Leipzig");
        mySet.add("Hamburg");
        mySet.add("Munich");
        System.out.println(mySet.size());
        mySet.add("Leipzig");
        System.out.println(mySet.size());
        System.out.println("=======Iterator=====");
        for (String s : mySet) {
            System.out.println(s);
        }

        ISet<Integer> numberSet = new IHashSet<>();

        for (int i = 0; i < 100; i++) {
            numberSet.add(i);
        }
        System.out.println("======= Numbers =====");
        for (Integer n : numberSet) {
            System.out.print(n + " | ");
        }


    }
}
