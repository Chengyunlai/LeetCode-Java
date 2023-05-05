package longgestSubstringWithoutRepeatingCharacters;

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
        int abcabcbb = solution.lengthOfLongestSubstring("abcabcbb");
        System.out.println(abcabcbb);
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // 遍历字符串的子路是这样的：
        // 1 取字符串的长度：s.length()
        // 2 使用一个指针，用for循环遍历，遍历的时候用charAt(i)取出每个元素

        // 思路是用快慢指针遍历该s，快指针指向的每个如果不重复的元素（判断set中是否有），将不重复的元素放入到set中
        // 如果有重复元素了，从set中一个个去移除掉慢指针中的元素（因为可能重复元素是在开头，例如awa；或者重复在最后aww）
        // 但是重复在哪不重要，因为这是要找最长子串的长度，将其长度记录下来即可

        // 快慢指针
        int i = 0; // 慢指针
        int j = 0; // 快指针

        // 字符串长度
        int len = s.length();

        // Set的Contains方法可以判断是否有该元素
        HashSet<Character> set = new HashSet<>();

        // 记录长度
        int maxLen = 0;

        // 遍历
        while(j < len){
            // 取出s中每个元素，并且判断set中是否存在
            if(!set.contains(s.charAt(j))){
                // 如果不存在，将其放在set中
                set.add(s.charAt(j++));
                // 记录长度
                maxLen = Math.max(maxLen,j-i); // 假设只有一个元素，此时j为1，i为0，长度为1，满足条件
            }else if(s.charAt(j) == s.charAt(j-1)){
                // 如果set中有了charAt[j]这个元素，需要找新的子串
                // 如果是pwwa这个结构可以走这个，但是wpwa就不能这样直接清除
                set.clear();
                i = j;
            }else{
                set.remove(s.charAt(i++));
            }
        }
        return maxLen;
    }
}