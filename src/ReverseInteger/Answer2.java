package ReverseInteger;

import java.util.Stack;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Answer2 {
    public static void main(String[] args) {
        // int res = -123;
        Solution solution = new Solution();
        int reverse = solution.reverse(12300);
        System.out.println(reverse);
    }

}

class Solution2 {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(Math.abs(x));
        try {
            Integer integer = Integer.valueOf(sb.reverse().toString());
            return x > 0 ? integer : -integer;
        }catch (Exception e){
            return 0;
        }
    }
}
