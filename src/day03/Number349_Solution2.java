package day03;

import java.util.Arrays;

public class Number349_Solution2 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] result = new int[nums1.length + nums2.length];
        int index = 0;
        int index1 = 0;
        int index2 = 0;
        while (index1 < (nums1.length - 1) && index2 < (nums2.length - 1)){
            if(nums1[index1] == nums2[index2]){
                if (index == 0 || nums1[index1] != result[index - 1]){
                    result[index++] = nums1[index1];
                }
                index1++;
                index2++;
            } else if (nums1[index1] < nums2[index2]) {
                index1++;
            } else {
                index2++;
            }
        }
        return Arrays.copyOf(result, index);
    }
}
