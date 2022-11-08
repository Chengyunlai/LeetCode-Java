package ContainerWithMostWater;

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
        int res = solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.println(res);
    }
}

class Solution {
    public int maxArea(int[] height) {
        int length = height.length;
        int maxArea = 0;
        int leftC = -1;
        int rightC = -1;
        for (int i = 0;i<length-1;i++){
            for (int j = i + 1;j<length;j++){
                // leftC = i;
                int min = Math.min(height[i], height[j]);
                int res = min * (j - i);
                // maxArea = res > maxArea ? res : maxArea;
                if (res > maxArea){
                    maxArea = res;
                }
            }
        }
        return maxArea;
    }
}
