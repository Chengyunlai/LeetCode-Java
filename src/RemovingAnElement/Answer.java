package RemovingAnElement;

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
        int i = solution.removeElement(new int[]{3, 2, 2, 3}, 3);
        System.out.println(i);
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int low = 0;
        for (int high = 0; high < nums.length; high++) {
            if (nums[high] != val) {
                nums[low] = nums[high];
                low++;
            }
        }
        return low;
    }
}