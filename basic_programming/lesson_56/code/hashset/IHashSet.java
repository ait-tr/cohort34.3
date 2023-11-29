package hashset;

import java.util.Iterator;
import java.util.LinkedList;

public class IHashSet<E> implements ISet<E> {

    // поля
    private LinkedList<E>[] hashset; // это массив из связных листов, то есть
    // каждый элемент массива - это отдельный LinkedList <E>

    private int size;
    private int capacity; // кол-во "ячеек", "гвоздиков" для цепочек
    private double loadFactor;  // объем загрузки этих ячеек

    public IHashSet(int capacity, double loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        hashset = new LinkedList[capacity]; // это массив из LinkedList
        // каждый элемент массива - это отдельный LinkedList <E>
    }

    // в этом конструкторе можно определить свой loadFactor
    public IHashSet (int capacity){
        this(capacity, 0.75); // 0.75 - это loadFactor
    }

    // конструктор по умолчанию
    public IHashSet(){
        this(16, 0.75);
    }

    @Override
    public boolean add(E element) {
        if(size >= capacity * loadFactor){
            rebuildArray();
        }
        int index = getIndex(element);
        if(hashset[index] == null){
            hashset[index] = new LinkedList<>();
        }
        if(hashset[index].contains(element)){
            return false; // следим за уникальностью элементов
        }
        hashset[index].add(element);
        size++;
        return true;
    }

    private void rebuildArray(){
        capacity = capacity * 2; // удвоили размер
        LinkedList<E>[] newHashSet = new LinkedList[capacity];
        // надо обежать весь hashSet, залезть в каждый его LinkedList, переложить элементы в новый
        for (int i = 0; i < hashset.length; i++) {
            if (hashset[i] != null){
                for (E e : hashset[i]) {
                    int index = getIndex(e);
                    if(newHashSet[index] == null){
                        newHashSet[index] = new LinkedList<>(); // создаем новый лист
                    }
                    newHashSet[index].add(e); // добавляем элемент в LinkedList
                }
            }
        }
        hashset = newHashSet; // переопределили ссылку, garbage collector очистит память
    }

    private int getIndex(E element) {
        int hashcode = element.hashCode(); // вычисляем hashcode элемента
        hashcode = hashcode >=0 ? hashcode : - hashcode;
        return hashcode % capacity; // деление с остатком
    }

    @Override
    public boolean contains(E element) {
        int index = getIndex(element);
        if(hashset[index] == null) {
            return false;
        }
        return hashset[index].contains(element);// проверяем наличие элемента
    }

    @Override
    public boolean remove(E element) {
        int index = getIndex(element);
        if(hashset[index] == null) {
            return false;
        }
        boolean res = hashset[index].remove(element);
        if(res) {
            size--;
        }
        return res;
    }


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
                return totalCounter < size; // пока есть куда двигаться
            }

            @Override
            public E next() {
                while(hashset[i] == null || hashset[i].isEmpty()){ // если пусто
                    i++; // переходим к следующему
                }
                E res = hashset[i].get(j);
                totalCounter++;
                if(j < hashset[i].size() - 1) { // находимся внутри LinkedList
                    j++;
                } else {
                    j = 0;
                    i++;
                }
                return res;
            }
        };
    }
}
