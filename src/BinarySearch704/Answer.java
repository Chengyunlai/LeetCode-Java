package BinarySearch704;

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
        int search = solution.search(new int[]{1}, 1);
        // 输出下标
        System.out.println(search);
    }
}

class Solution {
    public int search(int[] nums, int target) {
        // 首指针
        int left = 0;
        // 尾指针
        int right = nums.length-1;
        while (left <= right){
            // 中间值，计算是通过长度
            int mid = left + (right - left) / 2;
            if (target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }
}
