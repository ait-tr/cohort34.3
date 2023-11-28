package practice.hashset;

import java.util.Iterator;
import java.util.LinkedList;

public class IHashSet<E> implements ISet<E>{

    private LinkedList<E>[] hashset; // это массив из связных листов, то есть каждый элемент массива - это отдельный LinkedList
    // в котором лежат данные типа E
    private int size;
    private int capacity;
    private double loadFactor;

    // стандартный конструктор на все поля
    public IHashSet(int capacity, double loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        hashset = new LinkedList[capacity];
    }

    // в этом конструкторе можно определить свой load factor
    public IHashSet(int capacity) {
        this(capacity, 0.75);
    }

    // дефолтный конструктор
    public IHashSet() {
        this(16, 0.75);
    }
    // итого, имеем три способа создать объект типа IHashSet

    //O(1)
    @Override
    public boolean add(E element) {
        if (size >= capacity * loadFactor) {
            rebuildArray();
        }
        int index = getIndex(element); // нашли номер корзины
        if (hashset[index] == null) { // если еще нет, то
            hashset[index] = new LinkedList<>(); // создаем новый LinkedList
        }
        if (hashset[index].contains(element)) {
            return false;
        }
        hashset[index].add(element);
        size++;
        return true;
    }

    private void rebuildArray() {
        capacity = capacity * 2; // удвоили размер
        LinkedList<E>[] newHashSet = new LinkedList[capacity];
        // надо оббежать массив hashset, залезть в каждый его LinkedList и элементы из них
        // переложить в листы в новом массиве
        for (int i = 0; i < hashset.length; i++) {
            if (hashset[i] != null) {
                for (E e : hashset[i]) {
                    int index = getIndex(e);
                    if (newHashSet[index] == null) { // если еще нет, то
                        newHashSet[index] = new LinkedList<>(); // создаем новый LinkedList
                    }
                    newHashSet[index].add(e);
                }
            }
        }
        hashset = newHashSet; // переопределяем ссылку на массив, а мусор уберет специальный garbage collector
    }

    private int getIndex(E element) {
        int hashcode = element.hashCode(); // вычисляем hashCode элемента множества
        hashcode = hashcode >= 0 ? hashcode : -hashcode; // меняем знак индексу, если он отрицательный
        return hashcode % capacity; // получаем индекс LinkedList в массиве (номер бакета)
    }

    //O(1)
    @Override
    public boolean contains(E element) {
        int index = getIndex(element);
        if (hashset[index] == null) {
            return false;
        }
        return hashset[index].contains(element); // проверяем наличие элемента в LinkedList
    }

    //O(1)
    @Override
    public boolean remove(E element) {
        int index = getIndex(element);
        if (hashset[index] == null) {
            return false;
        }
        boolean res = hashset[index].remove(element); // удаляем элемент в LinkedList
        if (res) {
            size--;
        }
        return res;
    }

    //O(1)
    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int i;
            int j;
            int totalCounter;

            @Override
            public boolean hasNext() {
                return totalCounter < size; // пока есть элементы
            }

            @Override
            public E next() {
                while (hashset[i] == null || hashset[i].isEmpty()) {
                    i++;
                }
                E res = hashset[i].get(j);
                totalCounter++;
                if (j < hashset[i].size() - 1) { // если находимся внутри бакета
                    j++; // переходим на сл. элемент
                } else { // иначе, переходим в новый бакет
                    j = 0;
                    i++;
                }
                return res;
            }
        };
    }
}
