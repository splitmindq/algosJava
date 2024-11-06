package task;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
    private final List<T> elements;
    public int popCount;
    public int pushCount;

    public MyStack() {
        this.elements = new ArrayList<>();
        this.popCount = 0;
        this.pushCount = 0;
    }

    public void myPush(T element) {
        this.elements.add(element);
        this.pushCount++;
    }

    public T myPop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T element = elements.removeLast();
        popCount++;
        return element;
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}