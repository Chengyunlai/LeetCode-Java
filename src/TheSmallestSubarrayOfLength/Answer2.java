package TheSmallestSubarrayOfLength;

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
        int i = solution.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        System.out.println(i);
    }
}

class Solution2 {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int index = 0;index < nums.length; index++){
            sum += nums[index];
            while (sum >= target){
                min = Math.min(min,index-left+1);
                sum -= nums[left++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
