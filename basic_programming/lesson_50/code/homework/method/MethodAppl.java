package homework.method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MethodAppl {
    public static void main(String[] args) {

        List<String> namesList = Arrays.asList("Peter","Vladimir","Stepan");
        System.out.println(namesList);

        MethodConv<String> methodConv = new MethodConv<String>(); // создается объект конструктором по умолчанию

        LinkedList<String> namesListReverse = methodConv.listConvertor(namesList);
        System.out.println(namesListReverse);

    }
// public static ....
}
