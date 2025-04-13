import org.junit.Test;

import java.util.Arrays;

/**
 * @Time: 2025/3/6 21:50
 * @Author: guoxun
 * @File: MergeNumberArray_88_Test
 * @Description:
 */

public class TestRunning {


    /**
     * 55. 跳跃游戏
     */
    @Test
    public void JumpGame_55_Test(){
        int[] nums = {3,2,1,0,4};
        JumpGame_55 jumpGame55 = new JumpGame_55();
        boolean result = jumpGame55.canJump(nums);
        System.out.println("jumpGame55: " + result);
    }


    /**
     * 88. 合并两个有序数组
     */
    @Test
    public void MergeNumberArray_88_Test(){
        MergeNumberArray_88 mergeNumberArray88 = new MergeNumberArray_88();
        int[] num1_test1 = {1, 2, 3, 0, 0, 0};
        int[] num2_test1 = {2, 5, 6};
        int m = 3, n = 3;
        int[] result_1 = mergeNumberArray88.merge(num1_test1, m, num2_test1, n);
        System.out.println(Arrays.toString(result_1));
    }


    /**
     * 201. 数字范围按位与
     */
    @Test
    public void NumberAnd_201_Test(){
        NumberAnd_201 numberAnd201 = new NumberAnd_201();
        int result = numberAnd201.rangeBitwiseAnd(2147483647, 2147483647);
        System.out.println("result = " + result);
    }


}
