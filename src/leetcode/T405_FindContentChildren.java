package leetcode;

import java.util.Arrays;

public class T405_FindContentChildren {
    /**
     *
     * @param g 小朋友的胃口
     * @param s 饼干的size
     * @return
     */
    public static int findContentChildren1(int[] g, int[] s) {
        int res = 0;
        int i=0,j=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (i<g.length && j<s.length) {
            if (g[i]<=s[j]){
                i++;
                j++;
                res++;
            } else if (g[i] > s[j]) {
                j++;
            }
        }
        return res;
    }
    public static int findContentChildren2(int[] g, int[] s) {
        int res = 0;
        int i= g.length-1, j=s.length-1;
        Arrays.sort(g);
        Arrays.sort(s);
        while (i>0 && j>0) {
            if (g[i]<=s[j]){
                i--;
                j--;
                res++;
            } else if (g[i] > s[j]) {
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int []g = {1,2};
        int[] s = {1,2,3};
        System.out.println(findContentChildren2(g, s));
    }
}
