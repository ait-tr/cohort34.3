package practice.json_wrapper;

public class JsonWrapperAppl2 {
    public static void main(String[] args) {

        JsonWrapper2<String> wrapper2 = new JsonWrapper2<>("10");
        System.out.println(wrapper2.getValue() + " Привет!");
        System.out.println();

        JsonWrapper2<Integer> wrapper21 = new JsonWrapper2<>(10);
        System.out.println(wrapper21.getValue() * 10);

    }
}
