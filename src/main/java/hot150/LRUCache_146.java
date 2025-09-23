package hot150;

import java.util.HashMap;

/**
 * @Time: 2025/8/17 14:25
 * @Author: guo_x
 * @File: LRUCache_146
 * @Description:
 */
public class LRUCache_146 {

    class LRUNode{
        public int key;
        public int value;
        public LRUNode next, pre;

        LRUNode() {};
        LRUNode(int _key, int _value) {this.key = _key; this.value = _value;}
    }

    private int free;
    private HashMap<Integer, LRUNode> cache = new HashMap<>();
    private LRUNode head, rear;

    public LRUCache_146(int capacity) {
        this.free = capacity;
        head = new LRUNode();
        rear = head;
    }

    public int get(int key) {
        if(cache.containsKey(key)){
            moveToHead(cache.get(key));
            return cache.get(key).value;
        }
        else {
            return -1;
        }
    }

    public void put(int key, int value) {
        // 判读key是否在缓存里
        if(cache.containsKey(key)){
            cache.get(key).value = value;
            moveToHead(cache.get(key));
        }

        // 如果不在缓存里，判断是否还有空闲空间
        else if(free > 0){
            LRUNode newNode = new LRUNode(key, value);
            setToHead(newNode);
            cache.put(key, newNode);
            free--;
        }

        // 如果缓存中无空闲位置了，则进行替换算法
        else{
            // 拿出所要替换的元素
            cache.remove(rear.key, rear);
            // 将尾指针前移一个位置
            rear = rear.pre;
            rear.next = null;
            LRUNode newNode = new LRUNode(key, value);
            setToHead(newNode);
            cache.put(key, newNode);
        }
    }

    private void moveToHead(LRUNode node){
        if (node.pre == head){
            return;
        }
        // 判断当前结点是否为尾结点
        if(node.next == null){
            rear = node.pre;
            node.pre.next = null;
        }
        node.pre.next = node.next;
        node.next.pre = node.pre;
        node.next = head.next;
        node.pre = head;
        if (head.next != null) {
            head.next.pre = node;
        }
        head.next = node;
    }

    private void setToHead(LRUNode node){
        node.next = head.next;
        node.pre = head;
        if(head.next != null){
            head.next.pre = node;
        }
        head.next = node;
        moveRear2End();
    }

    private void moveRear2End(){
        while(rear.next != null){
            rear = rear.next;
        }
    }
}
