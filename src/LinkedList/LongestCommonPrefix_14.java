//LeetCode 14:最长公共前缀
//https://leetcode.cn/problems/longest-common-prefix/description/

package LinkedList;

public class LongestCommonPrefix_14 {
    public String Solution(String[] strs){
        //数组为空的特殊情况
        if (strs.length == 0) {
            return "";
        }
        //
        String s = strs[0];
        for(String string : strs){
            //以数组第一个字符串为模板一层层往下筛
            while (!string.startsWith(s)) {
                if (s.length() == 0) {
                    return "";
                }
                //需要先判断s是否为空
                s = s.substring(0,s.length() - 1);
            }
        }
        return s;
    }
}

//缺点：如果第一个字符串很长，消耗时间长