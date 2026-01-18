//LeetCode 136:只出现一次的数字
//给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间

import java.util.HashMap;
import java.util.Map;

public class singleNumber {
    public int Solution(int[] nums){
            Map<Integer,Integer> count = new HashMap<>();
            //遍历整个数组把num记录到哈希表用于计数 哈希表键值为数组里的元素 Value为出现的次数
            for(int num : nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
            }
            //再次遍历整个数组 如果该值在哈希表对应的计数为1则说明出现一次
            for(int num : nums){
                if (count.get(num) == 1) {
                    return num;
                }
            }
            return -1;
        }
    }

