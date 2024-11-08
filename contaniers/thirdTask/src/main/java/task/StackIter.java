package task;

import java.util.Iterator;

public class StackIter {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();

        myStack.myPush(1);
        myStack.myPush(2);
        myStack.myPush(3);

        Iterator<Integer> iterator = myStack.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        myStack.myPush(4);

        while (iterator.hasNext()) {
            System.out.println(iterator.next()); //throw exception cause user didn't create new iterator for changed stack
        }


    }
}