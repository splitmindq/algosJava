package task;

import java.util.List;
import java.util.Map;
import java.util.*;
public class ReverseOrderSort {

    public static List<Map.Entry<String,Integer>> sort(Map<String,Integer> entries){


        List<Map.Entry<String,Integer>> entriesList = new ArrayList<>(entries.entrySet());
        entriesList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        return entriesList;

    }




}
