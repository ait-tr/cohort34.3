package practice.hashset;

public interface ISet<E> extends Iterable<E>{
    boolean add(E element);
    boolean contains(E element);
    boolean remove(E element);
    int size();
}
