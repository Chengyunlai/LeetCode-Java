package permutations;

import java.util.ArrayList;
import java.util.LinkedList;
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
        solution.permute(new int[]{1,2,3});
    }
}

class Solution {
    // 存放路径
    LinkedList<Integer> path = new LinkedList<>();
    // 用来存放结果
    List<List<Integer>> result = new ArrayList<>();
    // 去重
    boolean[] used;
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0){
            return result;
        }
        // 初始化used
        used = new boolean[nums.length];

        loop(nums);

        return result;
    }

    public void loop(int[] nums){
        if(path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i = 0;i<nums.length;i++){
            // 如果这个值取过了就不再取了
            if(used[i]) continue;
            // 否则将它添加到path中
            path.add(nums[i]);
            // 添加完path中后，需要将其位置，置换为true
            used[i] = true;
            // 递归（每层递归结束返回后，需要回溯）
            loop(nums);
            path.removeLast();
            used[i] = false;
        }
    }
}
