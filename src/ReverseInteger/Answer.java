package ReverseInteger;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Answer {
    public static void main(String[] args) {
        // int res = -123;
        Solution solution = new Solution();
        int reverse = solution.reverse(12300);
        System.out.println(reverse);
    }

}

class Solution {
    public int reverse(int x) {
        Integer tmp = x;
        int flag = 1;
        if (x < 0) flag = -1;
        tmp = tmp * flag;
        char[] chars = tmp.toString().toCharArray();
        Stack stack = new Stack();
        for (char aChar : chars) {
            stack.push(aChar);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()){
            String  pop = stack.pop().toString();
            stringBuilder.append(pop);
        }
        try {
            Integer integer = Integer.valueOf(stringBuilder.toString());
            if (flag == -1) integer *= flag;
            return integer;
        }catch (Exception e){
            return 0;
        }
    }
}
