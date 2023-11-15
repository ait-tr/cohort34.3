package practice.linked_list;

import java.util.Iterator;

public class NodeListImpl<E> implements NodeList<E> {

    // fields
    private Node<E> first;
    private Node<E> last;

    private int size;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(E element) { // добавляем элемент в список
        Node<E> newNode = new Node<>(last, element, null); // создаем новый, следующий узел, он последний
        if (last != null) {
            last.next = newNode;
        } else {
            first = newNode; // если список был пустой, то новый создаваемый становится первым
        }
        last = newNode;
        size++;
        return true;
        // узел новый, следующий, в конец списка
    }

    @Override
    public void clear() {
        // TODO
    }

    @Override
    public boolean add(int index, E element) {
        if (index == size) { // добавление элемента в конец
            return add(element);
        }
        Node<E> node = getNodeByIndex(index); // берем узел по его индексу
        Node<E> newNode = new Node<>(node.prev, element, node); // создаем новый узел для вставки в список
        node.prev = newNode;
        if (index != 0) {
            newNode.prev.next = newNode;
        } else {
            first = newNode; // вставка в начало списка
        }
        size++;
        return true;
    }

    // разобраться, как работает метод
    private Node<E> getNodeByIndex(int index) {
        checkIndex(index);
        Node<E> node;
        if (index < size / 2) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
