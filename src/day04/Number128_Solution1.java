package day04;

import java.util.Arrays;

public class Number128_Solution1 {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int maxLen = 1;
        int curLen = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 1) {
                curLen++;                // 连续，长度+1
                maxLen = Math.max(maxLen, curLen);
            } else if (!(nums[i] == nums[i-1])){
                curLen = 1;              // 打断，重置
            }
        }

        return maxLen;
    }
}
