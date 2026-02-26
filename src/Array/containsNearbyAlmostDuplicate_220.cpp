//LeetCode 220:存在重复元素 III
//https://leetcode.cn/problems/contains-duplicate-iii/description/

#include <vector>
#include <set>
using namespace std;

class Solution{
public:
    bool sol(vector<int>& nums,int indexDiff,int valueDiff){
        set<long> window;
        int left = 0,right = 0;
        while (right < nums.size())
        {
            auto ceiling = window.lower_bound((long)nums[right]);
            //*ceiling - nums[right]可理解为窗口中最小的差值
            if (ceiling != window.end() && *ceiling - nums[right] <= valueDiff)
            {
                return true;
            }
            auto floor = ceiling;
            if (floor != window.begin())
            {
                --floor;
                if (nums[right] - *floor <= valueDiff)
                {
                    return true;
                }
                
            }
            
            window.insert(nums[right]);
            right++;

            if (right - left > indexDiff)
            {
                window.erase(nums[left]);
                left++;
            }
            
        }
        return false;
    }
};