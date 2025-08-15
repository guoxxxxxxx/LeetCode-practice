package hot150;

/**
 * 算法思想:
 * 1. 采用left数组记录从左到右遍历所需的糖果数
 * 2. 采用right数组记录从右到左遍历所需的糖果数
 * 3. 取上述两个数组中每个数组的最大值记为所需糖果数
 */
public class Candy_135 {

    public int candy(int[] ratings) {
        // 判断特殊情况
        if(ratings.length == 0){
            return 0;
        }
        else if(ratings.length == 1){
            return 1;
        }
        int[] left = new int[ratings.length];
        int[] right = new int[ratings.length];
        // 第一次遍历，从左向右遍历
        left[0] = 1;
        for(int i=1; i<ratings.length; i++){
            if (ratings[i] > ratings[i-1]){
                left[i] = left[i-1] + 1;
            }
            else {
                left[i] = 1;
            }
        }
        // 第二次遍历，从右向左遍历
        right[ratings.length-1] = 1;
        for (int i=ratings.length - 2; i>=0; i--){
            if (ratings[i] > ratings[i+1]){
                right[i] = right[i+1] + 1;
            }
            else {
                right[i] = 1;
            }
        }
        // 计算合
        int result = 0;
        for(int i=0; i<ratings.length; i++){
            if (left[i] > right[i])
                result += left[i];
            else
                result += right[i];
        }
        return result;
    }
}
