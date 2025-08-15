package hot150;

public class IsSubsequence_392 {

    public boolean isSubsequence(String s, String t) {
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        int i = 0, j = 0;
        // 过滤特殊情况
        if(s.length() == 0){
            return true;
        }
        else if(t.length() == 0){
            return false;
        }

        // main
        while(s.length() > i && t.length() > j){
            if(sCharArray[i] == tCharArray[j]){
                i++;
                j++;
            }
            else{
                j++;
            }
            // 判断当前有没有结束
            if(i == s.length()){
                return true;
            }
        }
        return false;
    }
}
