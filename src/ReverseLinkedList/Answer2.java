package ReverseLinkedList;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Answer2 {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        ListNode listNode = solution.reverseList(listNode1);
        System.out.println(listNode.val);
        System.out.println(listNode.next.val);
        System.out.println(listNode.next.next.val);
        System.out.println(listNode.next.next.next.val);
        System.out.println(listNode.next.next.next.next);
    }
}

class Solution2 {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        int index = 0;
        ListNode pre = null;
        ListNode T = null;

        while (head != null) {
            T = head.next;
            head.next = pre;
            pre = head;
            head = T;
        }
        return pre;
    }
}
