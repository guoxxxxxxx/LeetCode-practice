package hot150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Time: 2025/10/9 17:34
 * @Author: guo_x
 * @File: FindAnagrams438
 * @Description:
 */
public class FindAnagrams438 {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> target = new HashMap<>();
        HashMap<Character, Integer> currentMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        if(p.length() > s.length()){
            return result;
        }

        // 构造目标hashmap
        for(int i=0; i<p.length(); i++){
            if(target.containsKey(p.charAt(i))){
                target.put(p.charAt(i), target.get(p.charAt(i)) + 1);
            }
            else{
                target.put(p.charAt(i), 1);
            }

            // 构造滑动窗口的hashmap
            if(currentMap.containsKey(s.charAt(i))){
                currentMap.put(s.charAt(i), currentMap.get(s.charAt(i)) + 1);
            }
            else{
                currentMap.put(s.charAt(i), 1);
            }
        }

        int i=0;
        while(i + p.length() < s.length()){
            if(isSameMap(target, currentMap)){
                result.add(i);
            }
            currentMap.put(s.charAt(i), currentMap.get(s.charAt(i)) - 1);
            if(currentMap.containsKey(s.charAt(i + p.length()))){
                currentMap.put(s.charAt(i + p.length()), currentMap.get(s.charAt(i + p.length())) + 1);
            }
            else{
                currentMap.put(s.charAt(i + p.length()), 1);
            }
            i++;
        }

        return result;
    }

    // 判断两个hashmap是否一样
    public boolean isSameMap(HashMap<Character, Integer> target, HashMap<Character, Integer> current){
        for(Character key : target.keySet()){
            if(!current.containsKey(key) || current.get(key) != target.get(key)){
                return false;
            }
        }
        return true;
    }
}
