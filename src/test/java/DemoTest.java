import org.junit.Test;

import java.util.*;

/**
 * @Time: 2025/8/8 19:18
 * @Author: guo_x
 * @File: DemoTest
 * @Description:
 */
public class DemoTest {


    @Test
    public void test(){
        int i = 1;
        System.out.println(1<<2);
    }


    @Test
    public void stackTest(){
        TreeMap<Integer, Long> treeMap = new TreeMap<>((o1, o2) -> o2 - o1);
        treeMap.put(10, 200L);
        treeMap.put(8, 22L);
        treeMap.subMap(1, 2).keySet();
        for (int e : treeMap.keySet()){
            System.out.println(treeMap.get(e));
        }
    }

    static class Node{
        int val;
        Node(){};
        Node(int v){
            val = v;
        }
    };

    @Test
    public void queueTest(){
        List<Node> temp = new ArrayList<>();
        temp.sort((a,b) -> b.val - a.val);
    }
}
