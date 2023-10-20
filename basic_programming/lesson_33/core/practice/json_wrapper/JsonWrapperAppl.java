package practice.json_wrapper;

public class JsonWrapperAppl {
    public static void main(String[] args) {

        JsonWrapper1 wrapper1 = new JsonWrapper1("10");
        System.out.println(wrapper1);
        System.out.println();

        Integer a = (int) wrapper1.getValue();
        System.out.println(a);

    }
}
