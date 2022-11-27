package IntersectionOfTwoLinkedListsLcci;

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

        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);

        //1 2 3 4
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        // 5 6 2 3 4
        listNode5.next = listNode6;
        listNode6.next = listNode2;

        Solution solution = new Solution();

        // 返回的是交叉处的节点
        ListNode intersectionNode = solution.getIntersectionNode(listNode1, listNode5);
        System.out.println(intersectionNode.val);
    }
}

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currHeadA = headA;
        ListNode tmp = new ListNode(-1);
        while (currHeadA != null){
            tmp = headB;
            while (tmp!=null){
                if (tmp == currHeadA){
                    return tmp;
                }
                tmp = tmp.next;
            }
            currHeadA = currHeadA.next;
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