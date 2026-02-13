//LeetCode 1329:将矩阵按对角线排序
//https://leetcode.cn/problems/sort-the-matrix-diagonally/description/

package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;

public class diagonalSort_1329 {
    public int[][] sol(int[][] mat){
        int m = mat.length,n = mat[0].length;

        HashMap<Integer,ArrayList<Integer>> diagonals = new HashMap<>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                int ID = i - j;
                diagonals.putIfAbsent(ID,new ArrayList<>());
                diagonals.get(ID).add(mat[i][j]);
            }
        }

        for(List<Integer> diagonal : diagonals.values()){
            Collections.sort(diagonal,Collections.reverseOrder());
        }

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                ArrayList<Integer> diagonal = diagonals.get(i - j);
                mat[i][j] = diagonal.remove(diagonal.size() - 1);
            }
        }
        return mat;
    }
}
