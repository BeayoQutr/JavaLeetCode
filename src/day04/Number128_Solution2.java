package day04;

import java.util.HashSet;
import java.util.Set;

public class Number128_Solution2 {
    public int longestConsecutive(int[] nums){
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : set) {
            if (set.contains(num - 1)) {
                continue;
            }

            int currentNumber = num;
            int currentLength = 1;

            while (set.contains(currentNumber + 1)) {
                currentNumber++;
                currentLength++;
            }

            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}
