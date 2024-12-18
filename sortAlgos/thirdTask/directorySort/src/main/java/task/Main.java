package task;

import java.util.*;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter directory path + parameter(-t(sort by time), -s(sort by size))\n:");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine(); // -t -> case 1, sort by time, -s -> case 0, sort by size

        String[] parts = in.split(" ");
        String dirPath = parts[0];


        File dirFile = new File(dirPath);
        File[] files = dirFile.listFiles();

        if (files == null || !dirFile.exists()) {
            System.out.println("Directory does not exist or is empty");
            return;
        }

        int caseParam = getCaseParam(in);
        int orderParam = getOrderParam(sc);

        sortFiles(files, caseParam, orderParam);

        printFiles(files, caseParam);

    }

    private static int getCaseParam(String input) {
        if (input.contains("-t")) {
            return 1; // Sort by time
        } else if (input.contains("-s")) {
            return 2; // Sort by size
        }
        return 0;
    }

    private static int getOrderParam(Scanner sc) {
        System.out.println("By ascending or descending order -> 0 for ascending, 1 for descending:");
        String order = sc.nextLine();
        return order.equals("0") ? 0 : 1;
    }

    private static void sortFiles(File[] files, int caseParam, int orderParam) {

        if (caseParam == 1) {
            Arrays.sort(files, (o1, o2) ->
                    orderParam == 0 ? Long.compare(o1.length(), o2.length()) :
                            Long.compare(o2.length(), o1.length())
            );
        } else if (caseParam == 2) {
            Arrays.sort(files, (o1, o2) ->
                    orderParam == 0 ? Long.compare(o1.lastModified(), o2.lastModified()) :
                            Long.compare(o2.lastModified(), o1.lastModified())
            );

        }

    }

    private static void printFiles(File[] files,int caseParam) {
        for (File file : files) {
            if (caseParam == 1) {
                Date date = new Date(file.lastModified());
                System.out.println(file.getName() + " - Last modified: " + date);
            }
            else{
                System.out.println(file.getName() + " - Size: " + file.length() + " bytes");
            }
        }
    }
}