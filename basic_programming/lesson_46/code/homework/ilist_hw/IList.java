package homework.ilist_hw;

// зададим абстрактные методы для работы со структурой данных "лист/list" (список чего-то),
// для любых типов данных Integer, String, StringBuilder, Employee, Car, Pet, Photo, Book ...

public interface IList<E> extends Iterable<E> {
    int size(); // узнать размер списка

    default boolean isEmpty() // есть он пустой, то true
    {
        return size() == 0;
    }

    void clean(); // удалить все из списка

    boolean add(E element); // добавить элемент списка

    default boolean contains(Object o) // есть ли элемент в списке
    {
        return indexOf(o) >= 0;
    }

    default boolean remove(Object o) // удалить элемент по его индексу, если он есть
    {
        int index = indexOf(o);
        if (index < 0) { // когда объекта нет в нашем списке
            return false;
        }
        remove(index); // удалили индекс, и объект "пропал" из списка
        return true;
    }

    boolean add(int index, E element); // добавить (вставить) элемент по индексу

    E remove(int index); // удалить элемент из списка по индексу

    E get(int index); // получить элемент по его индексу

    E set(int index, E element); // обновить элемент в списке по его индексу

    int indexOf(Object o); // зная элемент, найти его индекс

    int lastIndexOf(Object o);// ищем индекс элемента с конца списка
}
