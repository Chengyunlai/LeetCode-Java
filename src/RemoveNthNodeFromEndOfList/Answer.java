package RemoveNthNodeFromEndOfList;

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

        Solution solution = new Solution();
        ListNode listNode = solution.removeNthFromEnd(listNode1, 1);
        System.out.println(listNode.val);
        System.out.println(listNode.next.val);
        System.out.println(listNode.next.next);
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        if (head.next == null && n == 1) return null;

        int index = 0;
        ListNode res = new ListNode(-1,head);
        ListNode pre = null;
        ListNode curr = head;
        ListNode len = head;
        int length = 0;
        // 获得链表的长度
        while (len!= null){
            length++;
            len = len.next;
        }
        // System.out.println(length);
        while (curr!=null){
            if (index == 0 && n == length){
                res.next = curr.next;
                break;
            }
            if (index + n == length){
                pre.next = curr.next;
                break;
            }
            pre = curr;
            curr = curr.next;
            index ++;
        }
        return res.next;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}