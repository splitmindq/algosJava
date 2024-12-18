package task;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Order> input = new ArrayList<>();

        System.out.println("Введите строки для сортировки.");
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            input.add(new Order(line));
        }
        Collections.sort(input);
        System.out.println("Отсортированные строки:");
        for (Order order : input) {
            System.out.println(order.value());
        }


    }
}