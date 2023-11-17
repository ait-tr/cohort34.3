package homework.method;

import java.util.LinkedList;
import java.util.List;

public class MethodConv<E> {

    public LinkedList<E> listConvertor(List<E> list){
        LinkedList<E> invList = new LinkedList<E>();
        int count = 0;
        int l = list.size();
        for (E el: list) {
            invList.add(count, list.get(l - 1 - count));
            count++;
        }
        return invList;
    }

}
