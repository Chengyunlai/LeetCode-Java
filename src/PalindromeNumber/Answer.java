package PalindromeNumber;

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
        boolean palindrome = solution.isPalindrome(-121);
        System.out.println(palindrome);
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        // 思路：将其转为StringBuilder调用reverse方法，然后转为整型后与x进行判断
        StringBuilder sb = new StringBuilder();
        sb.append(Math.abs(x));
        StringBuilder reverse = sb.reverse();
        try {
            Integer integer = Integer.valueOf(reverse.toString());
            return integer == x;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
