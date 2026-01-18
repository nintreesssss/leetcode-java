//LeetCode 217：存在重复元素
//给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。

import java.util.HashSet;

public class containsDuplicate {
    public boolean Solution(int[] nums){

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
