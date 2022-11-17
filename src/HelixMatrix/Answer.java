package HelixMatrix;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Answer {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] ints = solution.generateMatrix(3);
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.println(i);
            }
            System.out.println("==");
        }
    }
}

class Solution {
    public int[][] generateMatrix(int n) {
        // 初始化 4*4的矩阵
        int [][] array = new int[n][n];
        int i = 0;
        int j = 0;
        // 默认填补一号位置
        array[0][0] = 1;
        // 逻辑：我接下去要填2号位置[0][1]，一共有n * n 个位置
        int curr = 2;
        while (curr <= n*n){
            // 画格子
            while (j < n-1 && array[i][j + 1] == 0) array[i][++j] = curr++;
            while (i < n-1 && array[i+1][j] == 0) array[++i][j] = curr++;
            while (j > 0 && array[i][j-1] == 0) array[i][--j] = curr++;
            while (i > 0 && array[i-1][j] == 0) array[--i][j] = curr++;
        }
        return array;
    }
}
