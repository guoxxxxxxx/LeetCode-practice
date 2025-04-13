/**
 * @Time: 2025/4/11 15:23
 * @Author: guoxun
 * @File: NumberAnd_201
 * @Description:
 */

public class NumberAnd_201 {


    public int rangeBitwiseAnd(int left, int right) {
        int result = left;
        for(long i = left + 1; i<=right; i++){
            if(result == 0){
                return 0;
            }
            else{
                result &= i;
            }
        }
        return result;
    }
}
