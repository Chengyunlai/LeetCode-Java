package sort_the_people;

import java.util.*;

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
        String[] strings = solution.sortPeople(new String[]{"zhangsan", "lisi"}, new int[]{170, 180});
        for (String string : strings) {
            // Queue
            System.out.println(string);
        }
        ArrayList arrayList = new ArrayList();
        boolean add = arrayList.add(1);
        boolean add2 = arrayList.add(2);
        Object next = arrayList.iterator().next();
        System.out.println(next);
    }
}

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        // TreeMap是排序的而HashMap不是
        // 逆序排序
        TreeMap<Integer,String> treeMap = new TreeMap<>(Comparator.reverseOrder());

        for(int i = 0;i<heights.length;i++){
            treeMap.put(heights[i],names[i]);
        }
        return (treeMap.values().toArray(new String[]{}));
    }
}

