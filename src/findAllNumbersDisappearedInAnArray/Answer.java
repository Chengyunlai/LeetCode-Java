package findAllNumbersDisappearedInAnArray;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> disappearedNumbers = solution.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        for (Integer disappearedNumber : disappearedNumbers) {
            System.out.println(disappearedNumber);
        }

    }
}

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        List<Integer> res = new ArrayList<>();

        for(int num : nums){
            nums[Math.abs(num)-1] = - Math.abs(nums[Math.abs(num)-1]);
        }

        for(int i = 0;i<len;i++){
            if(nums[i] > 0){
                res.add(i+1);
            }
        }
        return res;
    }
}
