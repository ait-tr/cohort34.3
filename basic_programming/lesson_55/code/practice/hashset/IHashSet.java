package practice.hashset;

import java.util.Iterator;

public class IHashSet<E> implements ISet<E> {

    @Override
    public boolean add(E element) {
        return false;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public boolean remove(E element) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
