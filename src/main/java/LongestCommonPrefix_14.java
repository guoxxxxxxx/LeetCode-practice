import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix_14 {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder builder = new StringBuilder();
        // 首先将字符串数组转化为字符数组
        List<char[]> charList = new ArrayList<>();
        for(String e : strs){
            charList.add(e.toCharArray());
        }
        // 计算最长公共前缀
        char currentChar = ' ';
        int currentIdx = 0;
        while(true){
            for(int i=0; i < strs.length; i++){
                // 判断当前索引是否越界
                if(charList.get(i).length <= currentIdx){
                    return builder.toString();
                }
                // 给当前字符分配初始元素
                if(i == 0){
                    currentChar = charList.get(i)[currentIdx];
                }
                // 判断接下来的字符是否和最一开始的相同 并且为最后一个字符数组
                if(currentChar == charList.get(i)[currentIdx] && i == strs.length - 1){
                    builder.append(currentChar);
                    currentIdx += 1;
                }
                else if(currentChar != charList.get(i)[currentIdx]){
                    return builder.toString();
                }
            }
        }
    }
}
