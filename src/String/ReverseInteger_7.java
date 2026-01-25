//LeetCode 7:翻转整数 
//https://leetcode.cn/problems/reverse-integer/description/

package String;
public class ReverseInteger_7 {
    public static void main(String[] args) {
        //测试用例
        int x = 123;
        int y = -123;
        System.out.println(reverse(x));
        System.out.println(reverse(y));
    }
    public static int reverse(int x){
        int rev = 0;
        while (x != 0) {
            //rev进位后没溢出，但是补上个位后溢出的特殊情况也需要考虑
			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && x > Integer.MAX_VALUE%10)) return 0;
			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && x < Integer.MIN_VALUE%10)) return 0;
            //rev进一位然后补上个位
            rev = rev*10+x%10;
            //去除x的个位
            x /= 10;
        }
        return rev;
    }
}


/*    
    public int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;  更好的解法
    } 
*/