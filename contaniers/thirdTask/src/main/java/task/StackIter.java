package task;

public class StackIter {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.myPush(1);
        stack.myPush(2);


        StackIterator<Integer> iterator = new StackIterator<>(stack);

        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);

        }

    }
}