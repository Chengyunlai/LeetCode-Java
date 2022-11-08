package ContainerWithMostWater;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Answer2 {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int i = solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        System.out.println(i);
    }
}

class Solution2 {
    public int maxArea(int[] height) {
        int i = 0; // 模拟头部指针
        int j = height.length-1; // 模拟尾部指针
        int maxArea = 0;
        while (i < j){
            int min = Math.min(height[i], height[j]);
            int span = j - i;
            int res = min * span;
            maxArea = res > maxArea ? res : maxArea;
            if (min == height[i]) {
                i ++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}