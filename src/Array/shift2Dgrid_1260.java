//LeetCode 1260:二维网格迁移
//https://leetcode.cn/problems/shift-2d-grid/description/

package Array;

import java.util.ArrayList;
import java.util.List;

public class shift2Dgrid_1260 {
    public List<List<Integer>> sol(int[][] grid,int k){
        List<List<Integer>> res = new ArrayList<>();
        int i = grid.length;
        int j = grid[0].length;
        ArrayList<Integer> arr = new ArrayList<>(i * j);
        for(int n = 0;n<i;n++){
            for(int m = 0;m<j;m++){
                arr.add(grid[n][m]);
            }
        }
        while (k > 0) {
            int last = arr.remove(arr.size() - 1);
            arr.add(0,last);
            k--;
        }
        for(int n = 0;n<i;n++){
            List<Integer> row = new ArrayList<>();
            for(int m = 0;m<j;m++){
                row.add(arr.get(n * j + m));
            }
            res.add(row);
        }
        return res;
    }
}
