package task;

import java.util.HashMap;
import java.util.Map;

public record Order(String value) implements Comparable<Order> {

    private static final String ORDER = "RWQOJMVAHBSGZXNTCIEKUPDYFL";
    private static final Map<Character, Integer> letterPosition = new HashMap<>();

    static {
        for (int i = 0; i < ORDER.length(); ++i) {
            letterPosition.put(ORDER.charAt(i), i);
        }
    }

    @Override
    public int compareTo(Order other) {
        String firstString = this.value;
        String secondString = other.value;

        int length = Math.min(firstString.length(), secondString.length());
        for (int i = 0; i < length; i++) {
            int pos1 = letterPosition.get(firstString.charAt(i));
            int pos2 = letterPosition.get(secondString.charAt(i));

            if (pos1 != pos2) {
                return Integer.compare(pos1, pos2);
            }
        }

        return Integer.compare(firstString.length(), secondString.length());
    }

}
