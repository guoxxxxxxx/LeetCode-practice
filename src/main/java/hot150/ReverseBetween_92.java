package hot150;

import structure.ListNode;

/**
 * @Time: 2025/8/12 19:34
 * @Author: guo_x
 * @File: ReverseBetween_92
 * @Description:
 */
public class ReverseBetween_92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(right == left){
            return head;
        }

        ListNode newHead = new ListNode();
        ListNode newHeadPtr = newHead;

        int idx = 1;
        boolean flag = false;
        ListNode oldHeadPtr = head;
        while(oldHeadPtr != null){
            // 如果索引值介于区间之间，则在新链表尾部采用头插法
            if(idx >= left && idx <= right){
                ListNode nextNode = oldHeadPtr.next;
                if(!flag){
                    oldHeadPtr.next = null;
                    flag = true;
                }
                else{
                    oldHeadPtr.next = newHeadPtr.next;
                }
                newHeadPtr.next = oldHeadPtr;
                // 回复结点指针指向
                oldHeadPtr = nextNode;
            }
            // 否则在链表尾部采用头插法
            else{
                // 将新链表指针移动到最后一个结点上
                while(newHeadPtr.next != null){
                    newHeadPtr = newHeadPtr.next;
                }
                newHeadPtr.next = oldHeadPtr;
                newHeadPtr = newHeadPtr.next;
                oldHeadPtr = oldHeadPtr.next;
                newHeadPtr.next = null;
            }
            idx += 1;
        }
        return newHead.next;
    }
}
