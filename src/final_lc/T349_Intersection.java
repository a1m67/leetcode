package final_lc;

import java.lang.reflect.Array;

public class T349_Intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int [] temp2 = new int[1001];
        int [] bitmap= new int[1001];
        for (int i=0; i<nums2.length; i++) {
            bitmap[i] = 0;
        }
        for (int i = 0; i < nums2.length ;i++) {
            temp2[nums2[i]]++;
        }
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] <=1000){
                if (temp2[ nums1[i]] != 0) {
                    bitmap[nums1[i]] = 1;
                }
            }
        }
        int count=0;
        for (int num : bitmap) {
            if (num != 0) {
                count++;
            }
        }
        int [] res = new int[count];
        count = 0;
        for (int i = 0;i < bitmap.length ; i++) {
            if (bitmap[i] != 0) {
                res[count++]=i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] a={1,2,2,1};
        int [] b={2,2};
        System.out.println(intersection(a,b));
    }
}
