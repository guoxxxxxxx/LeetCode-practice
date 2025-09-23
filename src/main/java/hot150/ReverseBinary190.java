package hot150;

/**
 * @Time: 2025/9/19 21:11
 * @Author: guo_x
 * @File: ReverseBinary190
 * @Description:
 */
public class ReverseBinary190 {

    public int reverseBits(int n) {

        int flag = 31;
        StringBuilder sb = new StringBuilder();
        while(flag >= 0){
            if(n >= Math.pow(2, flag)){
                sb.append('1');
                n -= Math.pow(2, flag);
            }
            else {
                sb.append('0');
            }
            flag--;
        }

        char[] array = sb.toString().toCharArray();

        int result = 0;
        int current = 1;

        for(int i=0; i<array.length; i++){
            if(array[i] == '1'){
                result += current;
            }
            current *= 2;
        }
        return result;
    }
}
