package ValidAnagram;
import java.util.Arrays;

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
        boolean anagram = solution.isAnagram("abc", "cba");
        System.out.println(anagram);
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);
        String s1 = String.valueOf(chars1);
        String s2 = String.valueOf(chars2);

        if (!s1.equals(s2)) {
            return false;
        }
        return true;
    }
}
