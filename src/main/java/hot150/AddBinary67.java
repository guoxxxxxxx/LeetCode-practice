package hot150;

/**
 * @Time: 2025/9/18 21:18
 * @Author: guo_x
 * @File: AddBinary67
 * @Description:
 */
public class AddBinary67 {

    public String addBinary(String a, String b) {
        String longerStr, shorterStr;
        if(a.length() >= b.length()){
            longerStr = a;
            shorterStr = b;
        }
        else {
            longerStr = b;
            shorterStr = a;
        }

        char[] longerArray = longerStr.toCharArray();
        char[] shorterArray = shorterStr.toCharArray();

        int shorter = shorterStr.length();
        int longer = longerStr.length();
        StringBuilder sb = new StringBuilder();

        char c = '0';  // 进位位
        while(shorter > 0){
            shorter--;
            longer--;
            int count = 0;
            if(longerArray[longer] == '1'){
                count += 1;
            }
            if(shorterArray[shorter] == '1'){
                count += 1;
            }
            if(c == '1'){
                count += 1;
            }
            if(count == 0){
                sb.append('0');
                c = '0';
            }
            else if(count == 1){
                sb.append('1');
                c = '0';
            }
            else if(count == 2){
                sb.append('0');
                c = '1';
            }
            else if(count == 3){
                sb.append('1');
                c = '1';
            }
        }

        while(longer > 0){
            longer--;
            int count = 0;
            if(longerArray[longer] == '1'){
                count += 1;
            }
            if(c == '1'){
                count += 1;
            }

            if(count == 0){
                sb.append('0');
                c = '0';
            }
            else if(count == 1){
                sb.append('1');
                c = '0';
            }
            else if(count == 2){
                sb.append('0');
                c = '1';
            }
        }

        if (c == '1'){
            sb.append('1');
        }

        return sb.reverse().toString();
    }
}
