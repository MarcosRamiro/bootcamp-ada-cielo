package tech.ada.java.ds.queue;

import java.util.NoSuchElementException;

public class QueueAdaCielo<T> implements Queue<T> {

    private Object[] elements;
    private final int head;
    private int count;

    public QueueAdaCielo() {
        this.elements = new Object[10];
        this.head = 0;
    }

    @Override
    public T enqueue(T element) {
        if (this.elements.length == this.count) {
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

    @Override
    public T dequeue() {
        if (this.count == 0) {
            throw new NoSuchElementException();
        }
        T element = this.getElement(this.head);
        System.arraycopy(this.elements, 1, this.elements, 0, this.elements.length-1);
        this.count--;
        return element;
    }

    @SuppressWarnings("unchecked")
    private T getElement(int index) {
        return (T) this.elements[index];
    }

    @Override
    public T front() {
        return this.getElement(this.head);
    }

    @Override
    public T rear() {
        return this.getElement(this.count-1);
    }

    @Override
    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public boolean isFull() {
        return this.elements.length == this.count;
    }
}
