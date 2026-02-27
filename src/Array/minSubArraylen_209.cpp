//LeetCode 209:长度最小的子数组
//https://leetcode.cn/problems/minimum-size-subarray-sum/description/

#include <vector>
#include <climits>
using namespace std;

class Solution{
public:
    int sol(int target,vector<int>& nums){
        int right = 0,left = 0;
        int windowSum = 0;
        int res = INT_MAX;
        while (right < nums.size())
        {
            windowSum += nums[right];
            right++;
            while (windowSum >= target && left < right)
            {
                res = min(res,right - left);
                windowSum -= nums[left];
                left++;
            }
        }
        return res == INT_MAX ? 0:res;
    }
};