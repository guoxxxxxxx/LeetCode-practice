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
        int[] target = new int[26];
        int[] source = new int[26];

        for(int i=0; i<p.length(); i++){
            char sChar = s.charAt(i);
            source[sChar - 'a'] += 1;
            char tChar = s.charAt(i);
            target[tChar - 'a'] += 1;
        }

        List<Integer> result = new ArrayList<>();

        for(int i=p.length(); i<s.length(); i++){
            if(check(target, source)){
                result.add(i - p.length());
            }
            source[s.charAt(i - p.length()) - 'a'] -= 1;
            source[s.charAt(i) - 'a'] += 1;
        }

        if(check(target, source)){
            result.add(s.length() - p.length());
        }

        return result;
    }


    private boolean check(int[] target, int[] source){
        for(int i=0; i<target.length; i++){
            if(target[i] != source[i]){
                return false;
            }
        }
        return true;
    }
}
