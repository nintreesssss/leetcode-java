//LeetCode 3:无重复字符的最长子串
//https://leetcode.cn/problems/longest-substring-without-repeating-characters/

package String;

import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring_3 {
    public int sol(String s){
        Map<Character,Integer> window = new HashMap<>();
        int right = 0,left = 0;
        int res = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            right++;

            window.put(c, window.getOrDefault(c, 0) + 1);

            while (window.get(c) > 1) {
                char d = s.charAt(left);
                left++;

                window.put(d, window.get(d) - 1);
            }

            res = Math.max(res, right - left);
        }

        return res;
    }
}
