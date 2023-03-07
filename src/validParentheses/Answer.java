package validParentheses;

import java.util.HashMap;
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
        Solution solution = new Solution();
        boolean valid = solution.isValid("(])");
        System.out.println(valid);
    }
}
class Solution {
    public boolean isValid(String s) {
        if (null == s || s =="" || s.length() == 1) return false;
        // 创建栈
        Stack stack = new Stack();
        // 遍历字符串
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            // 如果是左括号就进栈
            if (aChar == '(' || aChar == '[' || aChar == '{'){
                stack.push(aChar);
            }else {
                if (stack.isEmpty()) return false;
                char peek = (char) stack.peek();
                // 否则要出栈
                switch (aChar){
                    case ')':
                        // 判断此时的栈顶元素
                        if (peek == '('){
                            stack.pop();
                        } else{
                            return false;
                        }
                        break;
                    case ']':
                        if (peek == '['){
                            stack.pop();
                        } else{
                            return false;
                        }
                        break;
                    case '}':
                        if (peek == '{'){
                            stack.pop();
                        } else{
                            return false;
                        }
                        break;
                }
            }
        }
        return stack.isEmpty() ? true : false;
    }
}
