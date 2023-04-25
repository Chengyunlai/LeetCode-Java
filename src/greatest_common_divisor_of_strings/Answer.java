package greatest_common_divisor_of_strings;

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
        String s = solution.gcdOfStrings("ABCABC", "ABC");
        System.out.println(s);
    }
}

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // 使用辗转消除法
        // 先判断str1  和 str2 两个是否满足倍数关系
        if (!str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }

        // 满足倍数关系，使用辗转相除法，从题目的角度 s = t + ... t，s是长的
        return str1.substring(0,gcd(str1.length(),str2.length()));
    }

    public int gcd(int len1,int len2){
        // 递归
        return len2 == 0 ? len1 : gcd(len2 ,len1 % len2);
    }
}