//LeetCode 1658:将x减到0的最小操作数
//https://leetcode.cn/problems/minimum-operations-to-reduce-x-to-zero/description/

package Array;

public class minOperationsToReduce_1658 {
    public int sol(int[] nums,int x){
        int len = nums.length,sum = 0;
        for(int i = 0;i<len;i++){
            sum += nums[i];
        }
        int target = sum - x;
        int left = 0,right = 0;
        int windowsum = 0;
        int maxLen = Integer.MIN_VALUE;
        while (right < nums.length) {
            windowsum += nums[right];
            right++;
            while (windowsum > target && left < right) {
                windowsum -= nums[left];
                left++;
            }
            if (windowsum == target) {
                maxLen = Math.max(right - left, maxLen);
            }
        }
        return maxLen == Integer.MIN_VALUE ? -1 : len - maxLen;
    }
}
