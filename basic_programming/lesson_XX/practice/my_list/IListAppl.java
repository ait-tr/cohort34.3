package practice.my_list;

public class IListAppl {
    public static void main(String[] args) {

        IList<Integer> list = new IListImpl<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println("------------------------");

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
//        list.add(null);
//        list.add(70);
        System.out.println(list.size());
        System.out.println(list.get(3));
        System.out.println(list.indexOf(30));
        System.out.println(list.indexOf(40));
        System.out.println(list.contains(50));
        System.out.println(list.contains(55));
        System.out.println("------------------------");
        int sum = 0;
        for (Integer i : list) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
        System.out.println("------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("------------------------");

        System.out.println("======== List of String ==========");
        IList<String> myList = new IListImpl<>();
        myList.add("Boston");
        myList.add("Atlanta");
        myList.add("Chicago");
        myList.add("Boston");
        myList.add("New York");
        System.out.println(myList.size());
        System.out.println(myList.get(3));
        System.out.println(myList.indexOf("Boston"));
        System.out.println(myList.remove(0));
        System.out.println(myList.size());
        System.out.println(myList.remove("Boston"));
        System.out.println(myList.contains("Boston"));
        System.out.println(myList.add(2, "Boston"));
        System.out.println(myList.size());
        System.out.println(myList.get(2));
        for (String str : myList) {
            System.out.println(str);
        }
        myList.clear();
        System.out.println(myList.size());
    }
}
