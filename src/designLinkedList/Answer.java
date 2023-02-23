package designLinkedList;

import java.util.Map;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Answer {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(7);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(1);
        myLinkedList.addAtIndex(3,0);
        myLinkedList.deleteAtIndex(2);
        myLinkedList.addAtHead(6);
        myLinkedList.addAtTail(4);
        System.out.println(myLinkedList.get(4)); //4
        myLinkedList.addAtTail(4);
        myLinkedList.addAtIndex(5,0);
        myLinkedList.addAtHead(6);
        // [6,1,2,0,4]
    }
}

//单链表
class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val) {
        this.val=val;
    }
}

class MyLinkedList {

    private ListNode listNode;

    private int len;

    // 构造方法中应附带链表的结构，以上我们已经声明了单链表的结构
    public MyLinkedList() {
        // 构建一个单链表结构，后面的操作都是针对该链表进行操作，这里的思想是初始化MyLinkedList的时候就给与一个带有虚拟头节点的ListNode，它的值为-1
        listNode = new ListNode(-1);
        // 链表长度初始化
        len = 0;
    }

    // 获取获取链表中第 index 个节点的值。如果索引无效，则返回-1。
    // get(0) 时 获取链表的第一个节点
    public int get(int index) {
        // 先判断索引是否有效，索引下标范围：[0,len-1]
        if (index>=0 && index <=len-1){
            // 注意 虚拟头指针是不允许变动的，不然的话，每次操作这个get时虚拟头指针都是变化值
            ListNode currentNode = listNode;
            index++;
            while (index-- > 0){
                currentNode = currentNode.next;
            }
            // for (int i = 0;i<=index;i++){
            //     currentNode = currentNode.next;
            // }
            return currentNode.val;
        }
        return -1;
    }

    // 在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
    public void addAtHead(int val) {
        ListNode listNode1 = new ListNode(val);
        listNode1.next = listNode.next;
        listNode.next = listNode1;
        len++;
    }

    // 将值为 val 的节点追加到链表的最后一个元素。
    public void addAtTail(int val) {
        // 先找到最后一个元素
        ListNode curr = listNode;
        while (curr.next != null){
            curr = curr.next;
        }
        // 退出while后curr已经指向最后一个元素
        ListNode listNode1 = new ListNode(val);
        // 直接将最后一个节点的next指向listNode1
        curr.next = listNode1;
        listNode1.next = null;
        len++;
    }

    // 在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
    // 在index节点前插入一个节点，如果是在0前面插，就是头结点
    public void addAtIndex(int index, int val) {
        // 先判断索引是否有效，索引下标范围：[0,len-1]
        if (index>=0 && index <=len){
            // 注意 虚拟头指针是不允许变动的，不然的话，每次操作这个get时虚拟头指针都是变化值
            ListNode currentNode = listNode;
            ListNode pre = null;
            for (int i = 0;i<=index;i++){
                pre = currentNode;
                currentNode = currentNode.next;
            }
            ListNode listNode1 = new ListNode(val);
            listNode1.next = pre.next;
            pre.next = listNode1;
            len++;
        }else {
            return;
        }
    }
    // 如果索引 index 有效，则删除链表中的第 index 个节点。
    public void deleteAtIndex(int index) {
        if (index>=0 && index <=len-1){
            // 注意 虚拟头指针是不允许变动的，不然的话，每次操作这个get时虚拟头指针都是变化值
            ListNode currentNode = listNode;
            ListNode pre = null;
            for (int i = 0;i<=index;i++){
                pre = currentNode;
                currentNode = currentNode.next;
            }
            pre.next = currentNode.next;
            len--;
        }else {
            return;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
