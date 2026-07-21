package day03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Number350_Solution2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length){
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        int[] result = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            if (map.containsKey(num)){
                if(map.get(num) == 0){
                    map.remove(num);
                }else{
                    result[index++] = num;
                    int count = map.get(num) - 1;
                    map.put(num, count);
                }
            }
        }
        return Arrays.copyOf(result, index);
    }
}
