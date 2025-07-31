package y2025_lc_h100.array;

import java.util.List;

/**
 * 文件描述
 *
 * @author Meng
 * @version 1.0
 * @date 2025-07-31 16:04:37
 */
// copilot: disable
public class T704_search {
    // 左闭右闭
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (end + start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    // 左闭右开
//    public static int search(int[] nums, int target) {
//        int start = 0;
//        int end = nums.length ;
//        while (start < end) {
//            int mid = (end + start) / 2;
//            if (nums[mid] == target) {
//                return mid;
//            }
//            if (target < nums[mid]) {
//                end = mid ;
//            } else if (target > nums[mid]) {
//                start = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }



    public static void main(String[] args) {
        int [] array = new int[] {5};
        System.out.println(search(array, 5));
    }
}
