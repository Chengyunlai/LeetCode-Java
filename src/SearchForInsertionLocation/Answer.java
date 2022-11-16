package SearchForInsertionLocation;

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
        int i = solution.searchInsert(new int[]{1,3,5}, 4);
        System.out.println(i);
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        // 排除两个极端的可能
        if (target > nums[high - 1]) return high;
        if (target <= nums[low]) return low;

        while (low < high) {
            int tmp = low + (high - low) / 2;
            if (target == nums[tmp]) {
                return tmp;
            }

            if (target < nums[tmp]) {
                if (target == nums[tmp - 1]) return tmp-1;
                if (target > nums[tmp-1]) return tmp;
                high = tmp;
            }else if (target > nums[tmp]) {
                if (target <= nums[tmp + 1]) return tmp + 1;
                low = tmp + 1;
            }
        }
        return -1;
    }
}
