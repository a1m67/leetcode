package y2025_lc_h100.array;

import java.util.Arrays;

/**
 * 文件描述
 *
 * @author Meng
 * @version 1.0
 * @date 2025-07-31 17:43:45
 */
public class T977_sortedSquares {
    private static int[] sortedSquares(int[] nums) {
        if (nums.length == 0) return new int[0];
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int current = nums.length - 1;
        while (left <= right) {
            int l = nums[left] * nums[left];
            int r = nums[right] * nums[right];
            if (l < r) {
                res[current--] = r;
                right --;
            }else {
                res[current--] = l;
                left++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int [] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
