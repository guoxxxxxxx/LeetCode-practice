package hot150;

import java.util.List;

/**
 * @Time: 2025/9/26 16:52
 * @Author: guo_x
 * @File: WordBreak139
 * @Description:
 */
public class WordBreak139 {

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for(int i=1; i<=s.length(); i++){
            for(int j=0; j<i; j++){
                if(dp[j] && wordDict.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
