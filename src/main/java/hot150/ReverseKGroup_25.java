package hot150;

import structure.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Time: 2025/8/15 15:22
 * @Author: guo_x
 * @File: ReverseKGroup_25
 * @Description:
 */
public class ReverseKGroup_25 {


    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> cache = new ArrayList<>();

        while(head != null){
            cache.add(head.val);
            head = head.next;
        }

        // 对数组中的元素按照规则进行交换
        for(int batch=0; batch < (cache.size() / k); batch++){
            int start = batch * k;
            int end = (batch + 1) * k - 1;
            while(start < end){
                int t = cache.get(start);
                cache.set(start, cache.get(end));
                cache.set(end, t);
                start += 1;
                end -= 1;
            }
        }

        // 重新构造链表
        ListNode result = new ListNode();
        ListNode ptr = result;
        for(int e: cache){
            ptr.next = new ListNode(e);
            ptr = ptr.next;
        }
        return result.next;
    }
}
