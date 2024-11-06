package task;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

class StackIterator<T> implements Iterator<T> {
    private final MyStack<T> stack;
    private final int count;

    public StackIterator(MyStack<T> stack) {
        this.stack = stack;
        this.count = stack.popCount + stack.pushCount;
    }

    @Override
    public boolean hasNext() {
        if (count != stack.popCount + stack.pushCount) {
            throw new ConcurrentModificationException();
        }
        return !stack.isEmpty();
    }

    @Override
    public T next() {
        if(count != stack.popCount + stack.pushCount) {
            throw new ConcurrentModificationException();
        }
        stack.popCount--;

        /*
         stack.popCount-- так как мы не сможем итерироваться после 1 элемента
          в связи с увеличением счётчика popCount при вызове myPop()
         */

        return stack.myPop();

    }


}
