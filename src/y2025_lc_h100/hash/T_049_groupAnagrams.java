package y2025_lc_h100.hash;

import java.util.*;

import static java.util.Arrays.sort;


/**
 * 文件描述
 *
 * @author Meng
 * @version 1.0
 * @date 2025-08-01 11:17:07
 */
public class T_049_groupAnagrams {
    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
