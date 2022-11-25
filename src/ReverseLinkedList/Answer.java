package ReverseLinkedList;


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
        System.out.println(listNode.next.next.next.next.next);
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        int index = 0;
        ListNode A = head;
        ListNode B = head.next;
        ListNode T = null;

        while (B != null) {
            T = B.next;
            if (index++ == 0){
                A.next = null;
            }
            B.next = A;
            A = B;
            B = T;
        }
        return A;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}