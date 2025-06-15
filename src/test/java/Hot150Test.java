import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Time: 2025/3/6 21:50
 * @Author: guoxun
 * @File: MergeNumberArray_88_Test
 * @Description:
 */

public class Hot150Test {


    /**
     * 打印结果
     * @param result 打印结果
     */
    private void println(Object result){
        System.out.println("result = " + result);
    }


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


    /**
     * 58. 最后一个单词的长度
     */
    @Test
    public void LengthOfLastWord_58_Test(){
        LengthOfLastWord_58 lengthOfLastWord58 = new LengthOfLastWord_58();
        String case1 = "   fly me   to   the moon  ";
        int result = lengthOfLastWord58.lengthOfLastWord(case1);
        System.out.println("result = " + result);
    }


    /**
     * 14. 最长公共前缀
     */
    @Test
    public void longestCommonPrefix_14(){
        LongestCommonPrefix_14 longestCommonPrefix14 = new LongestCommonPrefix_14();
        String[] StrList = {"flower","flow","flight"};
        String result = longestCommonPrefix14.longestCommonPrefix(StrList);
        System.out.println("result = " + result);
    }


    /**
     * 28. 找出字符串中第一个匹配项的下标
     */
    @Test
    public void strStr_28(){
        StrStr_28 strStr28 = new StrStr_28();
        String case1_h = "mississippi";
        String case1_n = "issip";
        int i = strStr28.strStr(case1_h, case1_n);
        println(Optional.of(i));
    }


    /**
     * 68. 文本左右对齐
     */
    @Test
    public void fullJustify_68(){
        FullJustify_68 fullJustify68 = new FullJustify_68();
//        String[] case1 = {"This", "is", "an", "example", "of", "text", "justification."};
        String[] case2 = {"What","must","be","acknowledgment","shall","be"};
        int maxWidth = 16;
        List<String> result = fullJustify68.fullJustify(case2, maxWidth);
        for (String e : result){
            System.out.println(e);
        }
    }


    /**
     * 125. 验证回文串
     */
    @Test
    public void isPalindrome_125(){
        IsPalindrome_125 isPalindrome125 = new IsPalindrome_125();
        String case1 = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome125.isPalindrome(case1);
        System.out.println(result);
    }

    /**
     * 6. Z 字形变换
     */
    @Test
    public void zConvert(){
        ZConvert_6 zConvert6 = new ZConvert_6();
        String case1 = "AB";
        String result = zConvert6.convert(case1, 1);
        println(result);
    }


    /**
     * 392. 判断子序列
     */
    @Test
    public void isSubsequence_392(){
        IsSubsequence_392 isSubsequence392 = new IsSubsequence_392();
        String s = "abc";
        String t = "ahbgdc";
        boolean result = isSubsequence392.isSubsequence(s, t);
        System.out.println(result);
    }

}
