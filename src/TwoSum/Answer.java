package TwoSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        int[] ints = solution.twoSum(new int[]{1, 2, 3, 4}, 3);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int res = target - nums[i];
            if (map.containsKey(res)){
                return new int[]{i,map.get(res)};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
