import java.util.*;

/**
 * @Time: 2025/7/4 18:36
 * @Author: guo_x
 * @File: FindSubstring_30
 * @Description: 30. 串联所有单词的子串
 */
public class FindSubstring_30 {

    public List<Integer> findSubstring(String s, String[] words){
        // 用于保存结果
        List<Integer> result = new ArrayList<>();
        // 记录单词的长度
        int word_length = words[0].length();
        // 特殊情况直接返回
        if(s.length() < words.length * word_length){
            return result;
        }

        // 多层循环完成全部遍历
        for(int i=0; i<word_length; i++){
            // 窗口指针
            int start = 0, end = words.length * word_length;
            // 初始化标记值
            Map<String, Integer> flag = new HashMap<>();
            for(String e : words){
                if(flag.containsKey(e)){
                    flag.put(e, flag.get(e) + 1);
                }
                else{
                    flag.put(e, 1);
                }
            }
            // 初始化当前滑动窗口的值
            for(int j=start + i; j < end + i; j += word_length){
                // 判断s的长度是否还够被截取
                if (s.length() < j + word_length){
                    // 长度不够了，终止循环
                    break;
                }
                String currentWords = s.substring(j, j+word_length);
                // 移除已经存在的元素或添加尚未存在的元素
                if (flag.containsKey(currentWords)){
                    flag.put(currentWords, flag.get(currentWords) - 1);
                }
                else {
                    flag.put(currentWords, -1);
                }
            }
            // 进行第一次检查
            if (checkIsOk(flag)){
                result.add(start + i);
            }
            // 滑动窗口, 继续遍历后面的元素 bar foo the foo bar man
            while(end + i + word_length <= s.length()){
                String currentWord = s.substring(end + i, end + i + word_length);
                end += word_length;
                if (flag.containsKey(currentWord)){
                    flag.put(currentWord, flag.get(currentWord) - 1);
                }
                else {
                    flag.put(currentWord, -1);
                }
                // 将前面的元素出掉
                currentWord = s.substring(start + i, start + i + word_length);
                flag.put(currentWord, flag.get(currentWord) + 1);
                start += word_length;
                // 再次进行检查
                if (checkIsOk(flag)){
                    result.add(end + i - words.length * word_length);
                }
            }
        }
        return result;
    }


    /**
     * 判断当前窗口下是否符合题目条件
     * @param flag 标记为集合
     * @return true or false
     */
    public boolean checkIsOk(Map<String, Integer> flag){
        boolean result = true;
        for(String key : flag.keySet()){
            if (flag.get(key) != 0){
                result = false;
                return result;
            }
        }
        return result;
    }
}
