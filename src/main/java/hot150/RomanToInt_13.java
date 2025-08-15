package hot150;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt_13 {

    public int romanToInt(String s) {
        Map<Character, Integer> mapping = new HashMap<>();
        mapping.put('I', 1);
        mapping.put('V', 5);
        mapping.put('X', 10);
        mapping.put('L', 50);
        mapping.put('C', 100);
        mapping.put('D', 500);
        mapping.put('M', 1000);

        int result = 0;
        // 首先过滤特殊情况
        if (s.isEmpty()){
            return 0;
        }
        else if(s.length() == 1){
            return mapping.get(s.toCharArray()[0]);
        }
        else {
            // 将字符串转化为字符列表
            char[] charList = new char[s.length()];
            s.getChars(0, s.length(), charList, 0);
            // 从下标索引1开始从前向后遍历
            for (int i=1; i<=s.length();){
                // 判断数组是否越界, 若越界则需要添加最后一个元素的值
                if (i == s.length()){
                    result += mapping.get(charList[i-1]);
                    break;
                }
                // 判断特殊情况
                if ((charList[i] == 'V' || charList[i] == 'X') && charList[i-1] == 'I'){
                    result -= mapping.get('I');
                    result += mapping.get(charList[i]);
                    i += 2;
                }
                else if ((charList[i] == 'L' || charList[i] == 'C') && charList[i-1] == 'X'){
                    result -= mapping.get('X');
                    result += mapping.get(charList[i]);
                    i += 2;
                }
                else if ((charList[i] == 'M' || charList[i] == 'D') && charList[i-1] == 'C'){
                    result -= mapping.get('C');
                    result += mapping.get(charList[i]);
                    i += 2;
                }
                else {
                    result += mapping.get(charList[i-1]);
                    i += 1;
                }
            }
        }
        return result;
    }
}
