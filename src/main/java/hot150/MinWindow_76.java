package hot150;

import java.util.HashMap;

/**
 * @Time: 2025/7/4 19:39
 * @Author: guo_x
 * @File: hot150.MinWindow_76
 * @Description:
 */
public class MinWindow_76 {
    public String minWindow(String s, String t) {
        // 1. 首先先判断特殊情况
        if(s.length() < t.length()){
            return "";
        }
        String result = "";
        // 2.定义滑动窗口的边界位置
        int start = 0, end = -1;
        // 3. 创建初始标记Map
        HashMap<Character, Integer> flag = new HashMap<>();
        // 3.1 初始化flag
        for(char e : t.toCharArray()){
            if (flag.containsKey(e)){
                flag.put(e, flag.get(e) + 1);
            }
            else {
                flag.put(e, 1);
            }
        }
        char[] charArray = s.toCharArray();
        while(s.length() > start){
            char start_e = charArray[start];
            if(flag.containsKey(start_e)){
                flag.put(start_e, flag.get(start_e) - 1);
                // 检查是否满足题目条件
                if(check(flag) && (result.length() == 0 || result.length() > start - end)){
                    result = s.substring(end + 1, start + 1);
                }
                // 将后续指针往前移动，看看是否还是满足条件
                while(check(flag)){
                    end += 1;
                    char end_char = charArray[end];
                    if(flag.containsKey(end_char)){
                        flag.put(end_char, flag.get(end_char) + 1);
                    }
                    // 检查是否满足题目条件
                    if(check(flag) && (result.length() == 0 || result.length() > start - end)){
                        result = s.substring(end + 1, start + 1);
                    }
                }
            }
            start += 1;
        }
        return result;
    }


    /**
     检查当前滑动窗口中的元素是否满足题目条件
     */
    private boolean check(HashMap<Character, Integer> flag){
        for(char e : flag.keySet()){
            if(flag.get(e) != 0){
                return false;
            }
        }
        return true;
    }
}
