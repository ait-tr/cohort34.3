package homework.fibonacci_hw;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer>{

    private int quantity; // количество чисел в последовательности

    public Fibonacci(int quantity) {
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(quantity);
    }
}
