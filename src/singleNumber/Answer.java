package singleNumber;

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
        int i = solution.singleNumber(new int[]{2,2,2,2});
        System.out.println(i);
    }
}
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int target = nums[0];
        for(int i = 1;i < nums.length ;i++){
            // 如果后边一个数与我的target不同的话，就表示当前的target是唯一的
            if(nums[i] != target) {
                return target;
            }else {
                do{
                    i++;
                }while (nums[i] == target);
                target = nums[i];
            }
        }
        return target;
    }
}
