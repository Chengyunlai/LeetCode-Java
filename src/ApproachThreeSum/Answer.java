package ApproachThreeSum;

import java.util.Arrays;


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
        int res = solution.threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
        System.out.println(res);
        System.out.println("你".length());
    }
}

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // 先进行排序
        Arrays.sort(nums);
        // 判断数组之和与target之差是最小的
        int sub = Integer.MAX_VALUE;

        // 还是用指针遍历数组的思想
        int sum = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1;
            int high = nums.length-1;
            while (low < high){
                int tmp = nums[i] + nums[low] + nums[high];
                int abs = Math.abs(tmp - target);
                if (abs < sub){
                    sub = abs;
                    sum = tmp;
                }
                // 如何移动指针

                // 如果相加的结果大于target
                if (tmp > target){
                    // 移动高位的指针
                    high --;
                }else{
                    low++;
                }
            }
        }
        return sum;
    }
}