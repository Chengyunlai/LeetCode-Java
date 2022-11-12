package threeSum;

import java.util.Arrays;
import java.util.LinkedList;
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
        List<List<Integer>> lists = solution.threeSum(new int[]{1, 0, 1, 2, -1, -4});
        for (List<Integer> list : lists) {
            System.out.println(list);
        }

    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 排序的思想，从小到大
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        // for (int num : nums) {
        //     System.out.println(num);
        // }

        //需要三个指针
        for (int i = 0; i < nums.length - 2; i++) {
            // 第一个指针i指向第一个位置，第二个指针和第三个指针分别找剩余数组中是否有符合条件的数，即0 - num[i] =  nums[lo] + nums[hi])
            if (i == 0 || i > 0 && nums[i] != nums[i - 1]) {
                int lo = i + 1, hi = nums.length - 1, sum = 0 - nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        // 防止重复
                        while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
                        lo++;
                        hi--;
                    } else if (nums[lo] + nums[hi] < sum) {
                        lo++;
                    } else {
                        hi--;
                    }
                }
            }
        }
        return res;
    }
}
