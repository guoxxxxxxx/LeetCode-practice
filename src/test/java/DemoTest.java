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
        int[][] array = new int[][]{{3,2}, {1,2}, {4,2}};
        Arrays.sort(array, (e1, e2) -> {
            return e2[0] - e1[0];
        });
        List<Integer> temp = new ArrayList<>();
        System.out.println(Arrays.deepToString(array));
    }


    @Test
    public void stackTest(){
        Stack<Character> stack = new Stack<>();
        stack.push('1');
        stack.isEmpty();
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
