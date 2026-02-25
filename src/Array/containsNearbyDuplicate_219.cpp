//LeetCode 219:存在重复元素 II
//https://leetcode.cn/problems/contains-duplicate-ii/description/

#include <vector>
#include <unordered_set>
using namespace std;

class Solution
{
public:
    bool sol(vector<int>& nums,int k){
        int left = 0,right = 0;
        unordered_set<int> window;
        while (right < nums.size())
        {
            if (window.find(nums[right]) != window.end())
            {
                return true;
            }
            window.insert(nums[right]);
            right++;

            if (right - left > k)
            {
                window.erase(nums[left]);
                left++;
            }
            
        }
        return false;
    }
};

