package maximum_sum_of_two_non_overlapping_subarrays;

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
        int i = solution.maxSumTwoNoOverlap(new int[]{0, 6, 5, 2, 2, 5, 1, 9, 4}, 1, 2);
        System.out.println(i);
    }
}

class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        // 拿到数组长度
        int len = nums.length;

        // 计算前缀和
        int[] sum = new int[len+1];
        for(int i = 1;i <= len;i++){
            sum[i] = sum[i-1] + nums[i-1];
        }

        int max = 0;
        //
        int size = firstLen + secondLen;

        for (int i = 0; i < len + 1 - size; i++) {
            for (int j = 0; j < len - size - i + 1; j++) {
                int[] subArray = Arrays.copyOfRange(nums, j + i, j + i + size);
                System.out.println(Arrays.toString(subArray));
                max = Math.max(max,
                        sum[j + size + i] - sum[j] - Math.min(sum[j + firstLen + i] - sum[j + firstLen], sum[j + secondLen + i] - sum[j + secondLen]));
            }
        }
        return max;
    }
}
