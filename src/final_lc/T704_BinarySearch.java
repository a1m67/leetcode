package final_lc;
// todo: 二分查找以后不在写了
public class T704_BinarySearch {

    public static int search(int[] nums, int target) {
        int result = -1;
        int i = 0,j = nums.length;
        while (i < j) {
            int mid =( i + j )/2;
            if (nums[mid] == target) {
                result = mid;
                break;
            }
            else if (nums[mid] < target) {
                i = mid + 1;
            } else if ( nums[mid] > target) {
                j = mid;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int []nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }
}
