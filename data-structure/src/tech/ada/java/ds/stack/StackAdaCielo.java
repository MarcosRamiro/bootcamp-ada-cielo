package tech.ada.java.ds.stack;

import java.util.EmptyStackException;

public class StackAdaCielo<T> implements Stack<T> {

    private Object[] elements;
    private int count;

    public StackAdaCielo() {
        this.elements = new Object[10];
    }

    public T push(T element) {
        if (this.elements.length == count) {
            this.grow();
        }
        this.elements[count++] = element;
        return element;
    }

    private void grow() {
        Object[] newArray = new Object[this.elements.length * 2];
        System.arraycopy(this.elements, 0, newArray, 0, this.elements.length);
        this.elements = newArray;
    }

    public T pop() {
        this.assertNotEmpty();
        T element = getElementAt(--count);
        this.elements[count] = null;
        return element;
    }

    private void assertNotEmpty() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
    }

    @SuppressWarnings("unchecked")
    private T getElementAt(int index) {
        return (T) this.elements[index];
    }

    @Override
    public T top() {
        this.assertNotEmpty();
        return getElementAt(this.count - 1);
    }

    @Override
    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public int size() {
        return this.count;
    }

}
