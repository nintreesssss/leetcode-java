//LeetCode 88:合并两个有序数组
//https://leetcode.cn/problems/merge-sorted-array/

package Array;

public class mergeSortedArray_88 {
    public void sol(int[] nums1,int m,int[] nums2,int n){
        int p1 = m - 1,p2 = n - 1;
        int p = nums1.length - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
                p--;
            }else{
                nums1[p] = nums2[p2];
                p2--;
                p--;
            }
        }
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
