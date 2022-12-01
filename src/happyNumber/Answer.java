package happyNumber;

import java.util.HashSet;
import java.util.Set;

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
        boolean happy = solution.isHappy(2);
        System.out.println(happy);
    }
}

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> record = new HashSet<>();

        while (n != 1 && !record.contains(n)) {
            record.add(n);
            n = getNextNumber(n);
        }
        return n == 1;
    }


    private int getNextNumber(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        // 取出每个数的操作
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            sum += Character.getNumericValue(aChar) * Character.getNumericValue(aChar);
        }
        return sum;
    }
}
