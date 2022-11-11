package LongestCommonPrefix;

import java.util.LinkedList;
import java.util.Queue;

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
        solution.longestCommonPrefix(new String[]{"flower","flow","flight"});

        String[] str = new String[]{"flower","flow","flight"};




    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // 可以任意先选一个作为参照
        String tmp = strs[0];
        // String substring = tmp.substring(0, tmp.length()-1);
        // System.out.println(substring);
        // tmp会越来越短，最后输出的tmp就是公共最长前缀
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(tmp)){
                tmp = tmp.substring(0,tmp.length()-1);
            }
        }
        return tmp;
    }
}