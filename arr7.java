import java.util.*;

public class arr7 {
    public static List<String> findRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        long start = (long) lower;

        for (int num : nums) {
            if (num > start) {
                result.add(range(start, num - 1));
            }
            start = (long) num + 1;
        }
        if (start <= (long) upper) {
            result.add(range(start, upper));
        }
        return result;
    }

    public static String range(long start, long end) {
        if (start == end) {
            return String.valueOf(start);
        } else {
            return start + "--" + end;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;
        List<String> missRange = findRanges(nums, lower, upper);
        System.out.println(missRange);
        // Output: ["2", "4->49", "51->74", "76->99"]
    }
}
