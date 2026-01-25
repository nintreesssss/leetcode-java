//LeetCode 8:字符串转换整数 
//https://leetcode.cn/problems/string-to-integer-atoi/

package String;
public class StringToInteger_8 {
    public static void main(String[] args) {
        String str1 = "42";
        String str2 = "   -42";
        String str3 = "4193 with words";
        String str4 = "91283472332";
        System.out.println(parseInt(str1));
        System.out.println(parseInt(str2));
        System.out.println(parseInt(str3));
        System.out.println(parseInt(str4));
    }
    public static int parseInt(String str){
        int i = 0; //遍历字符串
        int sign = 1; //记录符号 默认为正
        int x = 0; //记录转换后的整数
        //循环直到跳过前序空格
        while(i<str.length() && str.charAt(i) == ' ')i++;
        //判断是否有符号以及是正还是负
        if (i<str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
            sign = str.charAt(i) == '+' ? 1 : -1;
            i++;
        }
        //主循环体遍历字符串
        while (i<str.length()) {
            //获取首位字符并且转换成整数 ASC码从0开始计数
            int digit = str.charAt(i) - '0';
            //如果当前字符不是数字 跳出循环 遍历完毕
            if (digit < 0 || digit > 9) break;
            //检测溢出
            if (x > Integer.MAX_VALUE / 10 || (x == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
            //如果是正数返回int上限 如果是负数返回下限
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            x = x*10+digit;
            i++;
        }
        return x*sign;
    }
}
