package IntegertoRoman;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
        String s = solution.intToRoman(99);
        System.out.println(s);
    }
}

class Solution {

    public String intToRoman(int num) {
        // 既然罗马数字是由7种特殊符号组成，外加6种特殊情况，所有的组合情况列举出来
        // 不行
        // Integer[] integers = new Integer[]{1,4,5,9,10,40,50,90,100,400,500,900,1000};
        // String[] symbols = new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

        int[] integers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        // 思路是给出一个数，就找出integers中最大的数，相应的符号进行拼接
        for (int i = 0;i<integers.length;i++){
            int tmp = integers[i]; // 最大的
            String symbol = symbols[i];
            while (num >= tmp){
                num -= tmp;
                sb.append(symbol);
            }
            if (num == 0){
                break;
            }
        }
        return sb.toString();
    }
}
