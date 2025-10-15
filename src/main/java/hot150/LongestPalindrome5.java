package hot150;

/**
 * @Time: 2025/9/28 20:12
 * @Author: guo_x
 * @File: LongestPalindrome5
 * @Description:
 */
public class LongestPalindrome5 {

    public String longestPalindrome(String s) {
        if(s.length() == 1){
            return s;
        }
        char[] array = s.toCharArray();
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int i=0; i<s.length(); i++){
            dp[i][i] = true;
        }
        int length = 0;
        int ri = 0, rj = 0;
        for(int n=1; n<s.length(); n++){
            for(int i=0; i<s.length()-n; i++){
                int j = i + n;
                if(n <= 2){
                    dp[i][j] = array[i] == array[j];
                }
                else{
                    dp[i][j] = dp[i+1][j-1] && array[i] == array[j];
                }
                if(dp[i][j] && n > length){
                    length = n;
                    ri = i;
                    rj = j;
                }
            }
        }
        return s.substring(ri, rj+1);
    }
}
