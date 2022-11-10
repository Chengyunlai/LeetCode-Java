package RomantoInteger;

import java.util.HashMap;
import java.util.Map;

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
        int res = solution.romanToInt("MCMXCIV");
        System.out.println(res);
    }
}

class Solution {
    public int romanToInt(String s) {
        s = s.replace("IV","a");
        s = s.replace("IX","b");
        s = s.replace("XL","c");
        s = s.replace("XC","d");
        s = s.replace("CD","e");
        s = s.replace("CM","f");

        Map<String, Integer> map = new HashMap<>();
        map.put("M", 1000);
        map.put("f",900);
        map.put("D", 500);
        map.put("e",400);
        map.put("C", 100);
        map.put("d",90);
        map.put("L", 50);
        map.put("c",40);
        map.put("X", 10);
        map.put("b",9);
        map.put("V", 5);
        map.put("a",4);
        map.put("I", 1);

        char[] chars = s.toCharArray();
        // 使用滑动窗口法
        int i = 0;
        int j = i + 1;
        int sum = 0;
        int length = s.length();

        while (i < length) {
            String s1 = String.valueOf(chars[i]);
            Integer res1 = map.get(s1);
            if (i != length - 1) {
                String s2 = String.valueOf(chars[j]);
                Integer res2 = map.get(s2);
                if (res1 >= res2) {
                    // 执行相加操作
                    sum += res1 + res2;
                    i += 2;
                    j += 2;
                } else {
                    // 前面的减后面的
                    sum += res2 - res1;
                    i += 2;
                    j += 2;
                }
            }else{
                sum += res1;
                i++;
            }
        }
        return sum;
    }
}