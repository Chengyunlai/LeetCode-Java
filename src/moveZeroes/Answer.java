package moveZeroes;

import java.util.ArrayList;
import java.util.Arrays;
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
        solution.moveZeroes(new int[]{0,1,0,3,12});
    }
}
class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int low = 0;
        int count = 0;
        for(int fast = 0;fast < nums.length;fast++){
            if(nums[fast]!=0){
                nums[low] = nums[fast];
                low++;
            }else{
                count++;
            }
        }
        for(int i = (nums.length-count);i<nums.length;i++){
            nums[i] = 0;
        }
    }
}