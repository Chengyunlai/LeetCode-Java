package LongestPalindromicSubstring;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Answer {
    public static void main(String[] args) {
        String str = "aabbccb";
        Solution solution = new Solution();
        String s = solution.longestPalindrome(str);
        System.out.println(s);
    }
}

class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int maxLength = 0;
        String res = null;
        // 暴力破解
        int length = s.length();
        for (int i = 0; i < length; i++){
            for (int j = i+1; j <= length; j++){
                // 取出每个子串
                String substring = s.substring(i, j);
                int subLength = substring.length();
                // 判断该子串是否是回文
                if (judgment(substring) && subLength > maxLength){
                    maxLength = subLength;
                    res = substring;
                }
            }
        }
        return res;
    }

    boolean judgment(String s){
        int length = s.length();
        for(int i = 0; i < length / 2; i++){
            if (s.charAt(i) != s.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }
}
