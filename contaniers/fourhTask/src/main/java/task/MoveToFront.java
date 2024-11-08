package task;

import java.util.LinkedList;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoveToFront {
    private static Logger log = LoggerFactory.getLogger(MoveToFront.class);

    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        try (Scanner sc = new Scanner(System.in)) {
            log.info("Введите символы -> (ctrl+D для завершения):");

            while (sc.hasNext()) {
                char ch = sc.next().charAt(0);
                int index = list.indexOf(ch);
                if (index == -1) {
                    list.add(ch);
                    log.info("Добавлен символ {}", list.getLast());
                } else {
                    list.remove(index);
                    list.add(ch);
                    log.info("Добавлен символ {}", list.getLast());
                }
            }
        }

        log.info("Список:{}", list);
    }
}