package homework.ilist_hw;

import java.util.Arrays;
import java.util.Iterator;

public class IListImpl<E> implements IList<E> {

    // fields
    private Object[] elements; // массив для списка объектов
    private int size; // размер списка

    // constructor
    public IListImpl(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal capacity = " + initialCapacity); // выбросили исключение
        }
        elements = new Object[initialCapacity];
    }

    public IListImpl() {
        this(10);
    } // создаем объект

    @Override
    public int size() {
        return size;
    }

    // O(n)
    @Override
    public void clean() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
    // O(n)
    @Override
    public boolean add(E element) {
        ensureCapacity(); // проверили размер массива
        elements[size++] = element; // добавили элемент в массив и увеличили его размер
        return true;
    }
        // O(n)
    private void ensureCapacity() {
        if (size == elements.length) { // когда размер массива достиг его возможной длины
            if (size == Integer.MAX_VALUE) {
                throw new OutOfMemoryError(); // бОльшего по размеру массива создать не можем
            }
            int newCapacity = elements.length + elements.length / 2; // вырастили длину массива в 1,5 раза
            if (newCapacity < 0) { // после прибавления получили отрицательное число, т.к. память компьютера "закольцована"
                newCapacity = Integer.MAX_VALUE; // назначаем самую большую возможную длину массива
            }
            elements = Arrays.copyOf(elements, newCapacity); // скопировали в новый массив в массив с большей длиной (в 1,5 раза)
        }
    }

    // O(n)
    @Override
    public boolean add(int index, E element) {
        if (index == size) { // добавление в конец списка
            add(element);
            return true;
        }
        // добавление в середину списка
        checkIndex(index); // O(1)
        ensureCapacity(); // O(n)
        System.arraycopy(elements, index, elements, index + 1, size++ - index); // раздвигаем массив O(n)
        elements[index] = element; // ставим элемент на его место (index) O(1)
        return true;
    }

    // O(1)
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E el = (E) elements[index];
        System.arraycopy(elements, index + 1, elements, index, --size - index);
        elements[size] = null; // зачем-то затираем последний элемент?
        return el;
    }

//    После выполнения System.arraycopy, когда элементы сдвигаются на одну позицию назад (влево),
//    последний элемент становится дублированным на предпоследней позиции.
//    Затирание последнего элемента elements[size] = null; выполняется для очистки этой дублированной позиции,
//    иначе в списке может остаться ссылка на ненужный объект, что может вызвать утечку памяти.
//    Этот шаг необходим для правильной работы списка и предотвращения утечек памяти. В Java объекты не удаляются
//    сразу после вызова remove, и сборка мусора может произойти позже. Поэтому затирание последнего элемента является
//    хорошей практикой для избежания утечек памяти.

    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index]; // (E) - кастинг к типу
    }

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        E victim = (E) elements[index]; // нашли элемент по индексу
        elements[index] = element;
        return victim;
    }


    @Override
    public int indexOf(Object o) {
        if (o != null) { // когда объект не null
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        } else { // когда в листе есть объект null
            for (int i = 0; i < size; i++) {
                if (null == (elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO
        if (o != null) { // когда объект не NULL
            for (int i = size - 1; i > -1; i--) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        }
        else { // когда в листе есть объект  null
            for (int i = size - 1; i > -1; i--) {
                if (null == (elements[i])) {
                    return i;
                }
            }
        }

        return -1;

//        if (o != null) { // когда объект не null
//            for (int i = size - 1; i >= 0; i--) {
//                if (o.equals(elements[i])) {
//                    return i;
//                }
//            }
//        } else { // когда в листе есть объект null
//            for (int i = size - 1; i >= 0; i--) {
//                if (null == (elements[i])) {
//                    return i;
//                }
//            }
//        }
//        return -1;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int i = 0; // с какого элемента начинается перебор
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
}
