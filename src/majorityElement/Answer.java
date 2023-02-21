package majorityElement;

import java.util.HashMap;
import java.util.HashSet;

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
        int i = solution.majorityElement(new int[]{1});
        System.out.println(i);
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0];
        HashMap<Integer,Integer> sites = new HashMap<>();
        for(int num : nums){
            if (sites.containsKey(num)){
                sites.compute(num,(key,value)->value + 1);
                if (sites.get(num)>len/2) return num;
            }else {
                sites.put(num,1);
            }
        }
        return 0;
    }
}
