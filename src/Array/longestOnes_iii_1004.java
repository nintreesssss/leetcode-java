//LeetCode 1004:最大连续1的个数 III
//https://leetcode.cn/problems/max-consecutive-ones-iii/description/

package Array;

public class longestOnes_iii_1004 {
    public int sol(int[] nums,int k){
        int left = 0,right = 0;
        int Onecount = 0;
        int res = 0;
        while (right < nums.length) {
            if (nums[right] == 1) {
                Onecount++;
            }
            right++;
            while (right - left - Onecount > k && left < right) {
                if (nums[left] == 1) {
                    Onecount--;
                }
                left++;
            }
            res = Math.max(right - left, res);
        }
        return res;
    }
}

//滑动窗口 维护窗口内0的个数不超过k