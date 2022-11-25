package SwapNodesInPairs;

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
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        Solution solution = new Solution();
        ListNode listNode = solution.swapPairs(listNode1);
        System.out.println(listNode.val);
        System.out.println(listNode.next.val);
        System.out.println(listNode.next.next.val);
        System.out.println(listNode.next.next.next.val);
        System.out.println(listNode.next.next.next.next);
    }
}

class Solution {
    public ListNode swapPairs(ListNode head) {
        // 0个情况
        if (head == null) return null;
        // 1个情况
        if (head.next == null) return head;

        ListNode pre = head;
        ListNode curr = head.next;
        // 2个情况
        if (curr.next == null){
            curr.next = pre;
            pre.next = null;
            return curr;
        }
        ListNode myHead = new ListNode(-1,curr);
        ListNode next = curr.next;

        while (curr!=null){
            // 画第一笔
            curr.next = pre;
            if (next == null || next.next == null){
                // 画第二笔
                pre.next = next;
                break;
            }else {
                // 画第二笔
                pre.next = next.next;

                // 更新
                curr = next.next;
                pre = next;
                next = curr.next;
            }
        }

        return myHead.next;
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
