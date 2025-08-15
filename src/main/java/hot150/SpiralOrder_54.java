package hot150;

import java.util.ArrayList;
import java.util.List;

/**
 * @Time: 2025/7/5 17:06
 * @Author: guo_x
 * @File: hot150.SpiralOrder_54
 * @Description:
 */
public class SpiralOrder_54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        // 定义上下左右边界
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        int total = (bottom + 1) * (right + 1);
        // 定义结果
        List<Integer> result = new ArrayList<>();

        while(left <= right || top <= bottom){
            if (total <= result.size()) break;
            // 从左向右遍历
            for(int i=left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;
            if (total <= result.size()) break;
            // 从上向下遍历
            for(int i=top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            if (total <= result.size()) break;
            // 从右向左遍历
            for(int i=right; i>=left; i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
            if (total <= result.size()) break;
            // 从下向上遍历
            for(int i=bottom; i>=top; i--){
                result.add(matrix[i][left]);
            }
            left++;
        }
        return result;
    }
}
