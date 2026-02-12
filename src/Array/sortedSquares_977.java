//LeetCode 977:有序数组的平方
//https://leetcode.cn/problems/squares-of-a-sorted-array/description/

package Array;

public class sortedSquares_977 {
    public int[] sol(int[] nums){
        int[] res = new int[nums.length];
        int left = 0,right = nums.length - 1;
        int p = nums.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] >= nums[right] * nums[right]) {
                res[p] = nums[left] * nums[left];
                left++;
            }else{
                res[p] = nums[right] * nums[right];
                right--;
            }
            p--;
        }
        return res;
    }
}
