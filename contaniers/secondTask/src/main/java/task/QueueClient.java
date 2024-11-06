package task;

import java.util.*;
import java.util.logging.Logger;

public class QueueClient {
    private static final Logger logger = Logger.getLogger(QueueClient.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();


        logger.info("Enter k: ");
        long k = scanner.nextInt();
        scanner.nextLine();
       logger.info("Enter lines of text(ENTER EMPTY LINE TO STOP): ");

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            queue.add(input);
        }
        scanner.close();
        processQueue(queue, k);


    }

    private static void processQueue(Queue<String> queue, long k) {
       String result = queue.stream()
                .skip(queue.size()-k)
                .findFirst()
                .orElse("Doesn't exist");

        logger.info(result);

    }
}

