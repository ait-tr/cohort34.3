package practice.linked_list;

public interface NodeList<E> extends Iterable<E>{
    int size(); // размер

    default boolean isEmpty(){
        return size() == 0;
    } // пустой?

    boolean add(E element); // добавление элемента

    void clear(); // очистка

    default boolean contains(Object o){
        return indexOf(o) >= 0;
    } // наличие объекта в списке

    default boolean remove(Object o) {  // удаление объекта
        int index = indexOf(o);
        if(index < 0){
            return false;
        }
        remove(index);
        return true;
    }

    boolean add(int index, E element); // добавление элемента по индексу

    E get(int index); // получение элемента по индексу

    int indexOf(Object o); // получение индекса объекта

    int lastIndexOf(Object o);

    E remove(int index); // удаление по индексу

    E set(int index, E element); // обновление элемента
}
