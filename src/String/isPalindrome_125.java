//LeetCode 125:验证回文串
//https://leetcode.cn/problems/valid-palindrome/description/

package String;

public class isPalindrome_125 {
    public boolean sol(String s){
        StringBuilder st = new StringBuilder();
        for(int i =0;i < s.length();i++){
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                st.append(Character.toLowerCase(c));
            }
        }

        s = st.toString();
        int left = 0,right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
