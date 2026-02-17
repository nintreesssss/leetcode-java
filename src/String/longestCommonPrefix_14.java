//LeetCode 14:最长公共前缀
//https://leetcode.cn/problems/longest-common-prefix/description/

package String;

public class longestCommonPrefix_14 {
    public String sol(String[] strs){
        if (strs.length == 0) {
            return "";
        }
        String s = strs[0];
        for(String string : strs){
            while (!string.startsWith(s)) {
                if (s.length() == 0) {
                    return "";
                }
                s = s.substring(0,s.length() - 1);
            }
        }
        return s;
    }
}
