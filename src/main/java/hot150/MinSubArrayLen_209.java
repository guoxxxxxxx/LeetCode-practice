package hot150;

/**
 * @Time: 2025/6/15 22:17
 * @Author: guo_x
 * @File: hot150.MinSubArrayLen_209
 * @Description: 209. 长度最小的子数组
 */
public class MinSubArrayLen_209 {

    public int minSubArrayLen(int target, int[] nums) {

        // 1. 定义两个指针，两个指针初始位置都指向0的位置
        int start = 0, end = 0;
        int minDistance = nums.length + 10;
        int currentValue = 0;
        // 2. 计算首位指针元素的和(如果累加和符合题目要求，计算当前首尾指针的距离，如果距离小于已知距离，则将最小距离进行存储)，当前要排除首位指针指向同一元素的情况
        while(start < nums.length || (start == nums.length - 1 && currentValue < target)){
            if(start == end){
                currentValue = nums[start];
                // 判断是否已经满足解
                if(currentValue >= target){
                    return 1;
                }
                else{
                    start += 1;
                    if(start < nums.length){
                        currentValue += nums[start];
                    }
                }
            }
            else{
                if(currentValue < target){
                    start += 1;
                    if(start < nums.length){
                        currentValue += nums[start];
                    }
                }
                else{
                    // 计算前后指针的距离
                    int currentDistance = start - end + 1;
                    if(currentDistance < minDistance){
                        minDistance = currentDistance;
                    }
                    currentValue -= nums[end];
                    end++;
                }
            }
        }
        if(minDistance == nums.length + 10){
            return 0;
        }
        return minDistance;
        // 3. 如果当前累加和小于目标值，则将首指针向后移动一个位置
        // 4. 如果当前累加和的值大于目标值，则将尾指针向前移动一个距离
        // 5. 结束条件，当首位指针都指向最后一个位置或首指针指向最后一个位置，但当前元素的值已经小于目标值时，结束算法。
    }
}
