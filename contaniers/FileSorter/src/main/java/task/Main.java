package task;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String directory = sc.nextLine();
        File dir = new File(directory);

        if (!dir.exists()) {
            System.out.println("Directory does not exist");
        } else {
            String[] files = dir.list();
            assert files != null;
            Arrays.sort(files, String.CASE_INSENSITIVE_ORDER);

            for (String file : files) {
                System.out.println(file);
            }
        }

    }
}