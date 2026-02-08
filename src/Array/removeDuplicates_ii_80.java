//LeetCode 80:删除有序数组中的重复项 II
//https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii/description/

package Array;

public class removeDuplicates_ii_80 {
    public int sol(int[] nums){
        if (nums.length == 0) {
            return 0;
        }
        int slow = 0,fast = 0;
        int count = 0;
        for(int i = 0;i < nums.length;i++){
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }else if (slow < fast && count < 2) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
            count++;
            if (fast < nums.length && nums[fast] != nums[fast - 1]) {
                count = 0;
            }
        }
        return slow + 1;
    }
}
