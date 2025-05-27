import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntToRoman_12 {

    /**
     * 算法思想：
     * 1. 首先将num跟1000整出，得到M的数量
     * 2. 对于余数，将其跟900整除，得到CM的数量
     * 3. 以此类推
     * @param num
     * @return
     */
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        HashMap<Integer, String> mapping = new HashMap<>();
        mapping.put(1000, "M");
        mapping.put(900, "CM");
        mapping.put(500, "D");
        mapping.put(400, "CD");
        mapping.put(100, "C");
        mapping.put(90, "XC");
        mapping.put(50, "L");
        mapping.put(40, "XL");
        mapping.put(10, "X");
        mapping.put(9, "IX");
        mapping.put(5, "V");
        mapping.put(4, "IV");
        mapping.put(1, "I");
        int[] max2Low = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int e : max2Low){
            int count = num / e;
            for (int i=0; i<count; i++){
                result.append(mapping.get(e));
            }
            num = num % e;
        }
        return result.toString();
    }
}
