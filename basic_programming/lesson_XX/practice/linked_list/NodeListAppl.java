package practice.linked_list;

public class NodeListAppl {

    public static void main(String[] args) {
        NodeList<Integer> list = new NodeListImpl<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(5);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(null);
        list.add(7);
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.get(4));
        System.out.println(list.indexOf(3));
        System.out.println(list.indexOf(7));
        System.out.println(list.contains(5));
        System.out.println(list.contains(-5));
        System.out.println(list.indexOf(5));
        System.out.println(list.indexOf(null));
        int num = list.set(5, 11);
        System.out.println(num);
        System.out.println(list.get(5));
        System.out.println(list.size());
        num = list.remove(2);
        System.out.println(list.size());
        System.out.println(num);
        System.out.println("==================");
        System.out.println(list.remove((Integer) 11));
        System.out.println(list.size());
        for (Integer n : list) {
            System.out.print(n + " | ");
        }
        System.out.println();

        System.out.println("======== List of String ==========");
        NodeList<String> myList = new NodeListImpl<>();
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
        System.out.println("===== Insert =====");
        System.out.println(myList.size());
        System.out.println(myList.add(2, "Boston"));
        System.out.println(myList.size());
        System.out.println(myList.get(2));
        System.out.println("===== Iterator =====");
        for (String str : myList) {
            System.out.println(str);
        }
        myList.clear();
        System.out.println(myList.size());
    }
}
