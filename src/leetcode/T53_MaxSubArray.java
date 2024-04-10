package leetcode;

public class T53_MaxSubArray {
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int res = Integer.MIN_VALUE;
        int count = 0;

       for (int i = 0; i < nums.length; i++){
           count += nums[i];
           res = Math.max(res, count);
           if (count  < 0){
                count = 0;
           }
       }
        return res;
    }

    public static void main(String[] args) {
        int [] num = {5,4,-1,7,8};
        System.out.println(maxSubArray(num));
    }
}