package TheSquareOfTheArray977;

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
        int[] ints = solution.sortedSquares(new int[]{-4, -1, 0, 3, 10});
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0;
        int j = nums.length-1;
        int k = res.length-1;
        while (i <= j){
            if (nums[j] * nums[j] >= nums[i] * nums[i]){
                res[k] = nums[j] * nums[j];
                j--;
            }
            else{
                res[k] = nums[i] * nums[i];
                i++;
            }
            k--;
        }
        return res;
    }
}
