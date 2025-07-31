package y2025_lc_h100.array;

/**
 * 文件描述
 *
 * @author Meng
 * @version 1.0
 * @date 2025-07-31 17:08:20
 */
public class T27_removeElement {
    private static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;
        int slow = 0;
        for (int fast=0;fast< nums.length;fast++) {
            if (nums[fast] != val) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        int [] nums = new int [] {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
}
