package RemoveLinkedListElements;

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
        ListNode listNode3 = new ListNode(6);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        ListNode listNode = solution.removeElements(listNode1, 6);
        System.out.println(1);
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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;

        if (head.next == null && head.val == val) return null;

        // 头结点可能要被删除，所以需要设置一个根头结点,next指向的是head
        ListNode listNode = new ListNode(-1,head);

        // 需要两个指针，第一个指向listNode的链表，第二个指向head的链表
        ListNode nodeList = listNode;
        ListNode headList = head;

        while (headList != null){
            if (headList.val == val){
                // 头指针改变
                nodeList.next = headList.next;;
            }else{
                nodeList = headList;
            }
            headList = headList.next;
        }
        return listNode.next;
    }
}