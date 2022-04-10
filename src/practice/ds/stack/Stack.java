package practice.ds.stack;

public interface Stack<E> {
    int getSize();
    boolean isEmpty();
    void push();
    E pop();
    E peek();
}
