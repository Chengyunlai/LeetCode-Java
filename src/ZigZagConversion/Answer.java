package ZigZagConversion;

import java.util.ArrayList;
import java.util.List;

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
        String leetcode = solution.convert("LEETCODE", 3);
        System.out.println(leetcode);
    }

}

class Solution {
    public String convert(String s, int numRows) {
        // 当numRows 小于2 即等于1 的情况时，直接返回 s本身即可
        if (numRows <2) return s;
        // 创建一个数组,用数组模拟内容Z字，例[0] 表示第一行内容，[1]表示第二行内容... 考虑到里面的内容是变长的，所以使用StringBuilder
        List<StringBuilder> list = new ArrayList<>();
        // 需要初始化数组的长度
        for (int i = 0;i <numRows; i++) list.add(new StringBuilder());

        int index = 0;
        int flag = -1;
        // 取出字符串中每个字符
        for (char c : s.toCharArray()) {
            list.get(index).append(c);
            if (index == 0 || index == numRows-1) flag = -flag; // 初始为0时 会一直向下，当行数（数组）到最后一个时，向上一个数组存
            index += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder stringBuilder : list) {
            res.append(stringBuilder);
        }
        return res.toString();
    }
}
