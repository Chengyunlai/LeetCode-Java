package addTwoNumbers;

import RemoveLinkedListElements203.ListNode;

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
        ListNode listNode = solution.addTwoNumbers(new ListNode(5), new ListNode(5));
        int val = listNode.val;
        System.out.println(val);
        int val2 = listNode.next.val;
        System.out.println(val2);
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 双指针的思路，而且直接加到l1中
        ListNode currL1 = l1;
        ListNode currL2 = l2;
        // 保存结果
        ListNode res = new ListNode(0);
        // 做每一位的累加，并放在res中
        ListNode curr = res;

        // 进位
        int up = 0;
        while(currL1 != null || currL2 != null){
            int l1Value = currL1 != null ? currL1.val:0;
            int l2Value = currL2 != null ? currL2.val:0;

            int sum = l1Value + l2Value + up;
            // 进位
            up = sum / 10;
            // 余数留下
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if(currL1 != null)currL1 = currL1.next;
            if(currL2 != null)currL2 = currL2.next;
        }
        // 如果余数还存在，直接将其值放在尾部
        if(up != 0){
            curr.next = new ListNode(up);
        }

        return res.next;
    }
}