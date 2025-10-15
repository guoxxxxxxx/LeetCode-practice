import construct.LinkListMethod;
import hot150.*;
import org.junit.Test;
import structure.ListNode;
import utils.LeetCodeUtils;

import java.util.*;

/**
 * @Time: 2025/3/6 21:50
 * @Author: guoxun
 * @File: MergeNumberArray_88_Test
 * @Description:
 */

public class Hot150Test {


    @Test
    public void test(){
        ArrayList<Integer> integers = new ArrayList<>(19);
        Collections.fill(integers, 10);
        System.out.println(integers);
    }


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

    /**
     * 15. 三数之和
     */
    @Test
    public void threeSum_15(){
        ThreeSum_15 threeSum15 = new ThreeSum_15();
//        int[] case1 = new int[]{2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4,5,5,-10};
        int[] case1 = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum15.threeSum(case1);
        for (List<Integer> e : lists){
            System.out.println(e);
        }
    }

    /**
     * 209. 长度最小的子数组
     */
    @Test
    public void minSubArrayLen_209(){
        MinSubArrayLen_209 minSubArrayLen209 = new MinSubArrayLen_209();
        int[] nums = new int[]{2,3,1,2,4,3};
        int target = 7;
        int result = minSubArrayLen209.minSubArrayLen(target, nums);
        System.out.println(result);
    }


    /**
     * 3. 无重复字符的最长子串
     */
    @Test
    public void lengthOfLongestSubstring_3(){
        LengthOfLongestSubstring_3 lengthOfLongestSubstring3 = new LengthOfLongestSubstring_3();
        String case1 = "abcabcbb";
        int result = lengthOfLongestSubstring3.lengthOfLongestSubstring(case1);
        System.out.println(result);
    }

    /**
     * 30. 串联所有单词的子串
     */
    @Test
    public void findSubstring_30(){
        FindSubstring_30 findSubstring30 = new FindSubstring_30();
        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};
        List<Integer> result = findSubstring30.findSubstring(s, words);
        System.out.println(result);
    }


    /**
     * 54. 螺旋矩阵
     */
    @Test
    public void spiralOrder_54(){
        SpiralOrder_54 spiralOrder54 = new SpiralOrder_54();
        int[][] test1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> result = spiralOrder54.spiralOrder(test1);
        System.out.println(result);
    }


    /**
     * 57. 插入区间
     */
    @Test
    public void insert_57(){
        int[][] intervals = new int[][]{{23,25},{30,34},{41,43}};
        int[] newIntervals = new int[]{29,32};
        Insert_57 insert57 = new Insert_57();
        int[][] result = insert57.insert(intervals, newIntervals);
        System.out.println(Arrays.deepToString(result));
    }


    /**
     * 92. 反转链表 II
     */
    @Test
    public void reverseBetween_92(){
        int[] elements = new int[]{1,2,3,4,5};
        ListNode head = LinkListMethod.constructListNode(elements);
        ReverseBetween_92 reverseBetween92 = new ReverseBetween_92();
        ListNode listNode = reverseBetween92.reverseBetween(head, 1, 2);
        listNode.show();
    }


    /**
     * 25. K 个一组翻转链表
     */
    @Test
    public void reverseKGroup_25(){
        int[] elements = new int[]{1,2,3,4,5};

        ListNode listNode = LinkListMethod.constructListNode(elements);
        ReverseKGroup_25 reverseKGroup25 = new ReverseKGroup_25();
        ListNode result = reverseKGroup25.reverseKGroup(listNode, 2);
        LinkListMethod.print(result);
    }


    /**
     * 146. LRU缓存
     */
    @Test
    public void LRUCacheTest_146(){
        String[] operator = new String[]{"LRUCache","put","put","put","put","get","get","get","get","put","get","get","get","get","get"};
        String[] origin_data = "[[3],[1,1],[2,2],[3,3],[4,4],[4],[3],[2],[1],[5,5],[1],[2],[3],[4],[5]]".replace("[", "").split("],");
        LRUCache_146 lruCache146 = null;
        for(int i=0; i<operator.length; i++) {
            String[] data = origin_data[i].replace("]", "").split(",");
            if (operator[i].equals("LRUCache")){
                lruCache146 = new LRUCache_146(Integer.parseInt(data[0]));
            }
            else if (operator[i].equals("get")){
                System.out.println(lruCache146.get(Integer.parseInt(data[0])));
            }
            else if (operator[i].equals("put")){
                lruCache146.put(Integer.parseInt(data[0]), Integer.parseInt(data[1]));
            }
        }
    }


    /**
     * 39. 组合总和
     */
    @Test
    public void combinationSum_39(){
        CombinationSum_39 combinationSum39 = new CombinationSum_39();
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> lists = combinationSum39.combinationSum(candidates, target);
        System.out.println(lists);
    }


    /**
     * 79. 单词搜索
     */
    @Test
    public void exist_79(){

        char[][] board = {{'A','B','C','E'}, {'S','F','E','S'}, {'A','D','E','E'}};
        String word = "ABCESEEEFS";

        Exist_79 exist79 = new Exist_79();
        boolean result = exist79.exist(board, word);
        System.out.println(result);
    }


    /**
     * 427. 建立四叉树
     */
    @Test
    public void construct_427(){
        Construct_427 construct427 = new Construct_427();
        int[][] grid = {
                {1,1,1,1,0,0,0,0},
                {1,1,1,1,0,0,0,0},
                {1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1},
                {1,1,1,1,0,0,0,0},
                {1,1,1,1,0,0,0,0},
                {1,1,1,1,0,0,0,0},
                {1,1,1,1,0,0,0,0}};
        Construct_427.Node construct = construct427.construct(grid);
        System.out.println(construct);
    }


    /**
     * 33. 搜索旋转排序数组
     */
    @Test
    public void search33(){
        int[] nums = {5,1,2,3,4};
        int target = 1;

        Search_33 search33 = new Search_33();
        int search = search33.search(nums, target);
        System.out.println(search);
    }


    /**
     * 215. 数组中的第K个最大元素
     */
    @Test
    public void findKthLargest215(){
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        FindKthLargest_215 findKthLargest215 = new FindKthLargest_215();
        int kthLargest = findKthLargest215.findKthLargest(nums, k);
        System.out.println(kthLargest);
    }


    /**
     * 295. 数据流的中位数
     */
    @Test
    public void medianFinder295(){
        String[] operate = {"MedianFinder","addNum","addNum","findMedian","addNum","findMedian"};
        String data = "[[],[1],[2],[],[3],[]]";
        String[] split = data.replaceAll("[\\[\\]]", "").split(",");
        MedianFinder_295 medianFinder295 = new MedianFinder_295();
        for(int i=0; i<operate.length; i++){
            if(operate[i].equals("MedianFinder")){
                continue;
            }
            else if(operate[i].equals("addNum")){
                medianFinder295.addNum(Integer.parseInt(split[i]));
            }
            else {
                System.out.println(medianFinder295.findMedian());
            }
        }
    }


    /**
     * 67. 二进制求和
     */
    @Test
    public void addBinary67(){
        String a = "1010";
        String b = "1011";
        AddBinary67 addBinary67 = new AddBinary67();
        String result = addBinary67.addBinary(a, b);
        System.out.println(result);
    }


    /**
     * 190. 颠倒二进制位
     */
    @Test
    public void reverseBinary190(){
        int n = 43261596;
        ReverseBinary190 reverseBinary190 = new ReverseBinary190();
        int result = reverseBinary190.reverseBits(n);
        System.out.println(result);
    }


    /**
     * 149. 直线上最多的点数
     */
    @Test
    public void maxPoints149(){
        int[][] points = {{9,-25},{-4,1},{-1,5},{-7,7}};
        MaxPoints149 maxPoints149 = new MaxPoints149();
        int result = maxPoints149.maxPoints(points);
        System.out.println(result);

    }


    /**
     * 139. 单词拆分
     */
    @Test
    public void wordBreak139(){
        String s = "leetcode";
        String[] list = {"leet", "code"};
        List<String> wordDict = Arrays.asList(list);
        WordBreak139 wordBreak139 = new WordBreak139();
        boolean b = wordBreak139.wordBreak(s, wordDict);
        System.out.println(b);
    }


    /**
     * 64. 最小路径和
     */
    @Test
    public void minPathSum64(){
        String s = "[[1,2,3],[4,5,6]]";
        int[][] grid = LeetCodeUtils.convertString2Array2D(s);
        MinPathSum64 minPathSum64 = new MinPathSum64();
        int result = minPathSum64.minPathSum(grid);
        System.out.println(result);
    }


    /**
     * 5. 最长回文子串
     */
    @Test
    public void longestPalindrome5(){
        String s = "aaaa";
        LongestPalindrome5 longestPalindrome5 = new LongestPalindrome5();
        String s1 = longestPalindrome5.longestPalindrome(s);
        System.out.println(s1);
    }


    /**
     * 97. 交错字符串
     */
    @Test
    public void isInterleave97(){
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        IsInterleave97 isInterleave97 = new IsInterleave97();
        boolean interleave = isInterleave97.isInterleave(s1, s2, s3);
        System.out.println(interleave);
    }


    /**
     * 224. 基本计算器
     */
    @Test
    public void calculate224(){
        String s = "1-(     -2)";
        Calculate224 calculate224 = new Calculate224();
        int calculate = calculate224.calculate(s);
        System.out.println(calculate);
    }


    /**
     * 438. 找到字符串中所有字母异位词
     */
    @Test
    public void findAnagrams438(){
        String s = "cbaebabacd";
        String p = "abc";
        FindAnagrams438 findAnagrams438 = new FindAnagrams438();
        List<Integer> anagrams = findAnagrams438.findAnagrams(s, p);
        System.out.println(anagrams);
    }


    /**
     * 347. 前 K 个高频元素
     */
    @Test
    public void topKFrequent347(){
        int[] nums = {1, 1};
        int k = 1;
        TopKFrequent347 topKFrequent347 = new TopKFrequent347();
        int[] result = topKFrequent347.topKFrequent(nums, k);
        System.out.println(Arrays.toString(result));
    }
}
