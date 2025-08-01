package y2025_lc_h100.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 文件描述
 *
 * @author Meng
 * @version 1.0
 * @date 2025-07-31 18:29:58
 */
public class T_001_twoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{map.get(complement), i};
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int [] nums = {3,2,4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
}
