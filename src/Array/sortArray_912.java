//LeetCode 912:排序数组
//https://leetcode.cn/problems/sort-an-array/

package Array;

public class sortArray_912 {
    public int[] sol(int[] nums){
        int n = nums.length;
        int h = 1;
        while (h < n/2) {
            h = 3 * h + 1;
        }

        while (h >=1) {
            int sortedIndex = h;
            while (sortedIndex < n) {
                for(int i = sortedIndex;i>=h;i-=h){
                    if (nums[i] < nums[i-h]) {
                        int temp = nums[i];
                        nums[i] = nums[i-h];
                        nums[i-h] = temp;
                    }else{
                        break;
                    }
                }
                sortedIndex++;
            }
            h = h/3;
        }
        return nums;
    }
}

//此处使用希尔排序 时间复杂度略小于n^2，可优化

