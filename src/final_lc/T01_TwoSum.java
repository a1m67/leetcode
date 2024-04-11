package final_lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T01_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        //使用哈希表
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                res[0] = i;
                res[1] = map.get(target-nums[i]);
            }
            map.put(nums[i], i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        System.out.println(
                twoSum(nums, 6)
        );
    }
}