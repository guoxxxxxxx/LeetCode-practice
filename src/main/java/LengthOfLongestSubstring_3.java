import java.util.HashSet;
import java.util.Set;

/**
 * @Time: 2025/6/16 21:17
 * @Author: guo_x
 * @File: LengthOfLongestSubstring_3
 * @Description: 3. 无重复字符的最长子串
 */
public class LengthOfLongestSubstring_3 {
    public int lengthOfLongestSubstring(String s) {
        // 0. 过滤特殊情况
        if(s.length() <= 1){
            return s.length();
        }
        // 1. 定义一个set判断当前元素是否有没有出现过
        Set<Character> charSet = new HashSet<>();
        // 2. 定义双指针，一个指向下标为0的位置，另一个指向下标为1的位置
        int start = 1, end = 0;
        int currentLength = 1, maxLength = 1;
        char[] charArray = s.toCharArray();
        // 将首部元素存入
        charSet.add(charArray[0]);
        // 3. 判断首指针所指向的元素是否已经出现过，若没有出现过，则将当前长度+1，并判断当前长度是否大于最大长度
        while(start < s.length() && end < s.length()){
            if (!charSet.contains(charArray[start])){
                currentLength++;
                if (currentLength > maxLength){
                    maxLength = currentLength;
                }
                charSet.add(charArray[start]);
                start++;
            }
            else {
                // 删除end所指向元素
                charSet.remove(charArray[end]);
                end++;
                currentLength--;
            }
        }
        return maxLength;
    }
}
