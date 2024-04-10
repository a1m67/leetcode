public class T704_BinarySearch {

    public static void main(String[] args){
        int []nums = {-1,0,3,5,9,12};
        int target = 9;

        System.out.println(search(nums, target));
    }
    //实现方式1
//    public static int search(int[] nums, int target){
//        int left = 0 ;
//        int right = nums.length - 1 ;
//        while (left <= right){
//            int mid = (left + right) / 2 ;
//            if (nums[mid]>target){
//                right = mid - 1 ;
//            }else if (nums[mid]<target){
//                left = mid + 1 ;
//            }else {
//                return mid ;
//            }
//        }
//        return -1;
//    }


    //实现方式2
    public static int search(int[] nums, int target){
        int left = 0 ;
        int right = nums.length;
        while (left < right){
            int mid = (left + right) / 2 ;
            if (nums[mid]>target){
                right = mid ;
            }else if (nums[mid] < target){
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
