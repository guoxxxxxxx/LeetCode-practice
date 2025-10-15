package hot150;

/**
 * @Time: 2025/9/28 21:07
 * @Author: guo_x
 * @File: IsInterleave97
 * @Description:
 */
public class IsInterleave97 {

    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.isEmpty() && s2.isEmpty() && s3.isEmpty()){
            return true;
        }
        else if(s1.isEmpty()){
            if(s2.equals(s3))
                return true;
            else
                return false;
        }
        else if(s2.isEmpty()){
            if(s1.equals(s3))
                return true;
            else
                return false;
        }
        else if(s1.length() + s2.length() != s3.length()){
            return false;
        }
        return partMethod(s1, s2, s3) || partMethod(s2, s1, s3);
    }

    public boolean partMethod(String s1, String s2, String target){
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();
        char[] arrayT = target.toCharArray();
        for(int i=0; i<=s1.length(); i++){
            for(int j=0; j<=s2.length(); j++){
                if(i == 0 && j == 0){
                    dp[i][j] = true;
                }
                else{
                    if(i == 0){
                        dp[i][j] = dp[i][j-1] && arrayT[i+j-1] == array2[j-1];
                    }
                    else if(j == 0){
                        dp[i][j] = dp[i-1][j] && arrayT[i+j-1] == array1[i-1];
                    }
                    else{
                        dp[i][j] = dp[i][j-1] && array2[j-1] == arrayT[i+j-1] || dp[i-1][j] && array1[i-1] == arrayT[i+j-1];
                    }
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
}
