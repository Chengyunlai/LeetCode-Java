package TheSmallestSubarrayOfLength209;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Answer3 {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int i = solution3.minSubArrayLen(7, new int[]{2,3,1,2,4,3});
        System.out.println(i);
    }
}

class Solution3 {
    public int minSubArrayLen(int target, int[] nums) {
        // Arrays.sort(nums);
        int sum = 0;
        int resLength = Integer.MAX_VALUE;
        int start = 0;
        for (int end = 0;end < nums.length;end++){
            sum += nums[end];
            while (sum >= target){
                // 先记录长度，取最小
                resLength = Math.min(resLength,end-start+1);
                // 尝试缩小范围
                sum -= nums[start++];
            }
        }
        return resLength == Integer.MAX_VALUE ? 0 : resLength;
    }
}


