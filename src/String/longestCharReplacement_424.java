//LeetCode 424:替换后的最长重复字符
//https://leetcode.cn/problems/longest-repeating-character-replacement/description/

package String;

public class longestCharReplacement_424 {
    public int sol(String s,int k){
        int left = 0,right = 0;
        int MaxCount = 0;
        int count[] = new int[26];
        while (right < s.length()) {
            int c = s.charAt(right) - 'A';
            count[c]++;
            MaxCount = Math.max(MaxCount, count[c]);
            right++;
            while (right - left - MaxCount > k && left < right) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
        }
        return right - left;
    }
}
