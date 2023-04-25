package kids_with_the_greatest_number_of_candies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

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
        List<Boolean> booleans = solution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
        for (Boolean aBoolean : booleans) {
            System.out.println(aBoolean);
        }
    }
}

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // 最多糖果的人
        int max = Arrays.stream(candies).max().getAsInt();
        // System.out.println("糖果最多" + max);
        List<Boolean> res = new ArrayList<>();
        for(int i = 0;i<candies.length;i++){
            int tmp = candies[i] + extraCandies;
            if(tmp >= max){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }
}