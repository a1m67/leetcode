package final_lc;

import java.util.HashMap;
import java.util.Map;

public class T242_IsAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        int[] array = new int[26];
        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            array[t.charAt(i) - 'a']--;
        }
        for (int count: array) {
            if (count!=0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "ass";
        String t = "saa";
        System.out.println(isAnagram(s, t));
    }
}