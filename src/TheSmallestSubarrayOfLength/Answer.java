package TheSmallestSubarrayOfLength;

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
        int i = solution.minSubArrayLen(6, new int[]{1,2,3,2,4});
        System.out.println(i);
    }
}

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 1){
            if (nums[0] != target){
                return 0;
            }
        }
        int i = 0;
        int j = 0;
        int sum = nums[i];
        int res = Integer.MAX_VALUE;
        while (j < nums.length){
            if (sum == target) {
                res = Math.min(res,(j-i+1));
                if (j+1 == nums.length) break;
                j++;
                sum += nums[j];
            }else if(sum < target){
                if (j+1 == nums.length) break;
                j++;
                sum += nums[j];
            }else {
                sum -= nums[i];
                i++;
            }
        }
        if (sum == target){
            return res;
        }
        return 0;
    }
}
