package practice.my_list;

import java.util.Arrays;
import java.util.Iterator;

public class IListImpl<E> implements IList<E>{

    // поля
    private  Object[] elements; // массив для элементов сп
    private int size; // размер массива

    // конструктор
    public IListImpl(int initialCapacity){
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal capacity = " + initialCapacity);
        }
        elements = new Object[initialCapacity];
    }

    public IListImpl(){
        this(10);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean add(E element) {
        ensureCapacity();
        elements[size++] = element;
        // size++;
        return true;
    }

    @Override
    public boolean add(int index, E element) {
        if (index == size) { // добавление в конец списка
            add(element);
            return true;
        }
        checkIndex(index);
        ensureCapacity();
        System.arraycopy(elements, index, elements, index + 1, size++ - index);
        elements[index] = element;
        return true;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index]; // (E) - приведение элемента к типу
    }

    @Override
    public int indexOf(Object o) {
        if(o != null) { // когда объект не null
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        } else { // когда элемент листа (объект) null
            for (int i = 0; i < size; i++) {
                if (o == elements[i]){
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO
        return 0;
    }

    @Override
    public E remove(int index) {
        // реализовать самостоятельно по аналогии с boolean add(int index, E element)
        checkIndex(index);
        E el = (E) elements[index];
        System.arraycopy(elements, index + 1, elements, index, --size - index);
        elements[size] = null;
        return el;
    }

    @Override
    public E set(int index, E element) {
        checkIndex(index); // проверить индекс
        E victim = (E) elements[index]; // элемент на месте индекс забираем для возврата из метода, он должен быть типа E
        elements[index] = element; // ставим на это место новый элемент, который пришел нам на вход метода
        return victim; // возвращаем затертый элемент
    }

    @Override
    public Iterator<E> iterator() {
        //TODO
        return new Iterator<E>() {
            int i = 0;
            @Override
            public boolean hasNext() {
                return i < size;
            }
            @Override
            public E next() {
                return (E) elements[i++];
            }
        };
    }

    private void ensureCapacity(){
        if (size == elements.length) {
            if (size == Integer.MAX_VALUE) {
                throw new OutOfMemoryError();
            }
            // проверка на выход за Integer.MAX_VALUE
            int newCapacity = elements.length + elements.length / 2; // вычисляем новую длину массива
            if (newCapacity < 0) {
                newCapacity = Integer.MAX_VALUE;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    private void checkIndex (int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
    }
}
