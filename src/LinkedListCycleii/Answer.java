package LinkedListCycleii;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Answer {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        // listNode3.next = listNode2;

        Solution solution = new Solution();
        ListNode listNode = solution.detectCycle(listNode1);
        System.out.println(listNode);
    }
}

class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<>();
        while (head!=null){
            if (!hashSet.contains(head)){
                hashSet.add(head);
            }else {
                return head;
            }
            head = head.next;
        }
        return null;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
