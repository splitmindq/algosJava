package task;

import java.util.Iterator;
import java.util.logging.Logger;

public class StackIter {
    private static final Logger log = Logger.getLogger(StackIter.class.getName());
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();

        myStack.myPush(1);
        myStack.myPush(2);
        myStack.myPush(3);

        Iterator<Integer> iterator = myStack.iterator();

        while (iterator.hasNext()) {
            log.info(String.valueOf(iterator.next()));
        }

        myStack.myPush(4);

        while (iterator.hasNext()) {
            log.info(String.valueOf(iterator.next())); //throw exception cause user didn't create new iterator for changed stack
        }


    }
}