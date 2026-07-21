package day03;

import java.util.Arrays;

public class Number350_Solution1 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] result = new int[nums1.length + nums2.length];
        int index = 0;
        int index1 = 0;
        int index2 = 0;
        while(index1 < nums1.length && index2 < nums2.length){
            if(nums1[index1] == nums2[index2]){
                result[index++] = nums1[index1];
                index1++;
                index2++;
            } else if (nums1[index1] < nums2[index2]) {
                index1++;
            }else {
                index2++;
            }
        }
        return Arrays.copyOf(result, index);
    }
}
