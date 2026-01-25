//LeetCode 20:有效的括号
//https://leetcode.cn/problems/valid-parentheses/

package Stack;
import java.util.Stack;

public class bracketsIsValid_20 {
    public boolean Solution(String s){
        Stack<Character> left = new Stack<>();
        for(char c : s.toCharArray()){
            if (c == '(' || c == '[' || c == '{') {
                left.push(c);
            }else{
                if (!left.isEmpty() && leftOf(c) == left.peek()) {
                    left.pop();
                }else{
                    return false;
                }
            }
        }
        return left.isEmpty();
    }

    char leftOf(char c){
        if (c == ']') {
            return '[';
        }
        if (c == '}') {
            return '{';
        }
        return '(';
    }
}