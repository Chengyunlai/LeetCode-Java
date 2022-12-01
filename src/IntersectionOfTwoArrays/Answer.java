package IntersectionOfTwoArrays;

import java.util.ArrayList;
import java.util.Arrays;
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
        int[] nums1 = new int[]{1,2,3};
        int[] nums2 = new int[]{2,3,4};
        int[] intersection = solution.intersection(nums1, nums2);
        for (int i : intersection) {
            System.out.println(i);
        }
    }
}

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i : nums1) {
            hashSet.add(i);
        }

        for (int i : nums2) {
            if(hashSet.contains(i)){
                hashSet.remove(i);
                arrayList.add(i);
            }
        }
        return arrayList.stream().mapToInt(Integer::valueOf).toArray();
    }
}

