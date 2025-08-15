package structure;

/**
 * @Time: 2025/8/12 19:28
 * @Author: guo_x
 * @File: ListNode
 * @Description:
 */
public class ListNode {

    public int val;

    public ListNode next;


    public ListNode() {}


    public ListNode(int val) {
        this.val = val;
    }


    public ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }

    public void show(){
        ListNode temp = next;
        System.out.println(val + ", ");
        while (temp != null){
            System.out.println(temp.val + ", ");
            temp = temp.next;
        }
    }
}

