//LeetCode 713:乘积小于K的子数组
//https://leetcode.cn/problems/subarray-product-less-than-k/description/

package Array;

public class SubProductLessThanK_713 {
    public int sol(int[] nums,int k){
        int len = nums.length,product = 1;
        int left = 0,right = 0;
        int res = 0;
        while (right < len) {
            product *= nums[right];
            right++;
            while (product >= k && left < right) {
                product /= nums[left];
                left++;
            }
            if (product < k) {
                res += right - left; //关键一步，在一个合法的窗口数出对应的子数组数
            }
        }
        return res;
    }
}

//滑动窗口 维护乘积小于k的窗口
