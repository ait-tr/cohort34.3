package practice.my_list;

public interface IList<E> extends Iterable<E> {

    // опишем методы, которые нам нужны для работы со "списком", куда могут попасть любые типы данных
    // int, double, boolean, Integer, Double, String, типы на основе классов e.g. Employee, Car, Pet, Photo, ...

    int size(); // отвечает за размер IList

    default boolean isEmpty() {
        return size() == 0;
    }; // позволяет проверить лист пустой или нет

    void clear(); // удаляет все элементы

    boolean add(E element); // добавляет элемент

    default boolean contains(Object o) {
        return indexOf(o) >= 0;
    }; // есть такой элемент в листе или его нет

    default boolean remove(Object o) {
        int index = indexOf(o);
        if (index < 0) { // когда элемент не нашелся в списке
            return false;
        }
        remove(index);
        return true;
    } ; // удаление элемента из списка

    boolean add(int index, E element); // вставка на место по индексу

    E get(int index); // получение элемента по индексу

    int indexOf(Object o); // узнать индекс элемента списка

    int lastIndexOf(Object o); // ищем индекс с конца списка в направлении его начала

    E remove(int index); // удаление элемента по индексу

    E set(int index, E element); // обновление значения элемента по индексу

}
