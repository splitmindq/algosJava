    package task;

    import java.util.ArrayList;
    import java.util.EmptyStackException;
    import java.util.Iterator;
    import java.util.List;

    public class MyStack<T>{


        final List<T> elements;
        private int modCount;

        public MyStack() {

           this.elements = new ArrayList<T>();
           this.modCount = 0;

        }


        public void myPush(T element) {

            elements.add(element);
            modCount++;

        }
        public T myPop() {
            if(isEmpty()){
                throw new EmptyStackException();
            }
            T element = elements.removeLast();
            elements.removeLast();
            modCount++;
            return element;
        }

        public boolean isEmpty() {
            return elements.isEmpty();
        }

        public int getModCount() {
            return modCount;
        }

        public Iterator<T> iterator() {
            return new stackIterator<>(this);
        }

    }
