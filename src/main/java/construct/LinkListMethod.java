package construct;

import structure.ListNode;

/**
 * @Time: 2025/8/12 19:29
 * @Author: guo_x
 * @File: Method
 * @Description:
 */
public class LinkListMethod {


    /**
     * 根据数组构建单链表
     * @param elements 数组
     * @return 单链表的首结点指针
     */
    public static ListNode constructListNode(int[] elements){
        ListNode head = new ListNode();
        ListNode ptr = head;
        for(int e: elements){
            ptr.next = new ListNode(e);
            ptr = ptr.next;
        }
        return head.next;
    }


    /**
     * 打印链表中的内容
     */
    public static void print(ListNode head){
        ListNode ptr = head;

        while(ptr != null){
            System.out.print(ptr.val + ", ");
            ptr = ptr.next;
        }
    }
}
