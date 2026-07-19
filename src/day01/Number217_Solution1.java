package day01;

import java.util.Arrays;

public class Number217_Solution1 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }
}
