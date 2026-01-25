//LeetCode 217：存在重复元素
//https://leetcode.cn/problems/contains-duplicate/

package Array;
import java.util.HashSet;

public class containsDuplicate_217 {
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
