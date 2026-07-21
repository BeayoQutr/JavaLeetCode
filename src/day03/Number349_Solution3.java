package day03;

import java.util.Arrays;

public class Number349_Solution3 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int index = 0;
        outer:
        for (int num1 : nums1) {
            for (int j = 0; j < index; j++) {
                if (num1 == result[j]){
                    continue outer;
                }
            }
            for (int num2 : nums2) {
                if (num1 == num2){
                    result[index++] = num1;
                    break;
                }
            }
        }
        return Arrays.copyOf(result, index);
    }
}
