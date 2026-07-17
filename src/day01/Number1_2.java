package day01;

import java.util.HashMap;
import java.util.Map;

public class Number1_2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexByValue = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            Integer previousIndex = indexByValue.get(complement);
            if (previousIndex != null) {
                return new int[] {previousIndex, i};
            }
            indexByValue.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }
}
