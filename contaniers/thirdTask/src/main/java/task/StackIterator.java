package task;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;


class StackIterator<T> implements Iterator<T> {
    private final MyStack<T> stack;
    private final int expectedModCount;
    private int currentIndex;
    public StackIterator(MyStack<T> stack) {
        this.stack = stack;
        expectedModCount = stack.getModCount();
        this.currentIndex = stack.elements.size()-1;

    }

    @Override
    public boolean hasNext() {
        if(expectedModCount != stack.getModCount()) throw new ConcurrentModificationException();
        return currentIndex >= 0;
    }

    @Override

    public T next() {
        if(!hasNext()) throw new NoSuchElementException();
        return stack.elements.get(currentIndex--);

    }


}