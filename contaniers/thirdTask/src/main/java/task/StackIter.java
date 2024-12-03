package task;

import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StackIter {
    private static final Logger log = LoggerFactory.getLogger(StackIter.class.getName());

    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();

        myStack.myPush(1);
        myStack.myPush(2);
        myStack.myPush(3);

        Iterator<Integer> iterator = myStack.iterator();

        while (iterator.hasNext()) {
            log.info("Стек элемент: {}", iterator.next());
        }

        myStack.myPush(4);

        while (iterator.hasNext()) {
            log.info("Стек элемент: {}", iterator.next()); //throw exception cause user didn't create new iterator for changed stack
        }


    }
}