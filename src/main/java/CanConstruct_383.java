import java.util.HashMap;

/**
 * @Time: 2025/8/1 17:25
 * @Author: guo_x
 * @File: CanConstruct_383
 * @Description:
 */
public class CanConstruct_383 {


    public boolean canConstruct(String ransomNote, String magazine) {
        // 1. 首先将两个字符串都转化为字符数组
        char[] rNoteCharList = ransomNote.toCharArray();
        char[] magazineCharList = magazine.toCharArray();

        // 2. 定义一个hash表用于存储magazine中的元素及其出现的频次
        HashMap<Character, Integer> recordMap = new HashMap<>();

        // 3. 遍历magazine中的字符，并保存至hash中，并记录其出现频次
        for(int i=0; i<magazineCharList.length; i++){
            // 3.1 判断当前字符是否存在在hash中
            if(recordMap.containsKey(magazineCharList[i])){
                recordMap.put(magazineCharList[i], recordMap.get(magazineCharList[i]) + 1);
            }
            else{
                recordMap.put(magazineCharList[i], 1);
            }
        }

        // 4. 遍历目标数组，看看能否被原始数组中的字符组成
        for(int i=0; i<rNoteCharList.length; i++){
            char currentChar = rNoteCharList[i];
            // 判断hashmap中是否存在当前字符
            if(recordMap.containsKey(currentChar)){
                // 判断数量是否大于1，并对应相减
                if(recordMap.get(currentChar) >= 1){
                    recordMap.put(currentChar, recordMap.get(currentChar) - 1);
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}
