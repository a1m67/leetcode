package y2025_lc_h100.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 文件描述
 *
 * @author Meng
 * @version 1.0
 * @date 2025-08-01 17:23:47
 */
public class T_128_longestConsecutive {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) { // ← 只从起点开始
                int currentNum = num;
                int count = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                if (max < count) {
                    max = count;
                }
            }
        }
        return max;
    }
}
