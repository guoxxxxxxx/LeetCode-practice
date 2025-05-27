import org.junit.Test;

import java.util.Arrays;

/**
 * @Time: 2025/3/6 21:50
 * @Author: guoxun
 * @File: MergeNumberArray_88_Test
 * @Description:
 */

public class Hot150Test {

    /**
     * 45. 跳跃游戏
     */
    @Test
    public void JumpGame2_45_Test(){
        int[] case1 = {2,3,1,1,4};
        JumpGame02_45 jumpGame0245 = new JumpGame02_45();
        int result = jumpGame0245.jump_method2(case1);
        System.out.println("result = " + result);
    }


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


    /**
     * 238. 除自身以外数组的乘积
     */
    @Test
    public void ArrayMulti_238_Test(){
        int[] case1 = {1,2,3,4};
        ArrayMulti_283 arrayMulti283 = new ArrayMulti_283();
        int[] result = arrayMulti283.productExceptSelf(case1);
        System.out.println("result = " + Arrays.toString(result));
    }


    /**
     *  274. H 指数
     */
    @Test
    public void HIndex_274_Test(){
        int[] case1 = {3,0,6,1,5};
        HIndex_274 hIndex274 = new HIndex_274();
        int result = hIndex274.hIndex(case1);
        System.out.println("result = " + result);
    }


    /**
     * 134. 加油站
     */
    @Test
    public void Gas_134_Test(){
        int[] gas = new int[]{5,1,2,3,4};
        int[] cost = new int[]{4,4,1,5,1};
        Gas_134 gas134 = new Gas_134();
        int result = gas134.canCompleteCircuit(gas, cost);
        System.out.println(result);
    }


    /**
     * 135. 分发糖果
     */
    @Test
    public void Candy_135_Test(){
        Candy_135 candy135 = new Candy_135();
        int[] ratings1 = new int[]{1,0,2};
        int[] ratings2 = new int[]{1,2,2};
        int result = candy135.candy(ratings1);
        System.out.println("result = " + result);
    }


    /**
     * 42. 接雨水
     */
    @Test
    public void Trap_42_Test(){
        Trap_42 trap42 = new Trap_42();
        int[] case1 = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int result = trap42.trap(case1);
        System.out.println("result = " + result);
    }


    /**
     * 13. 罗马数字转整数
     */
    @Test
    public void RomanToInt_13_Test(){
        RomanToInt_13 romanToInt13 = new RomanToInt_13();
        String case1 = "D";
        int result = romanToInt13.romanToInt(case1);
        System.out.println("result = " + result);
    }

}
