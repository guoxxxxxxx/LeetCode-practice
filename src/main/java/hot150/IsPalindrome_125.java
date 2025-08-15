package hot150;

/**
 * @Time: 2025/6/14 18:22
 * @Author: guo_x
 * @File: hot150.IsPalindrome_125
 * @Description:
 */
public class IsPalindrome_125 {

    public boolean isPalindrome(String s) {
        // 1. 首先将大写字母全部转化为小写字母
        String lowStr = s.toLowerCase();
        // 2. 采用正则表达式删除掉所有非字母元素
        String pure = lowStr.replaceAll("[^a-z]", "");
        // 3. 采用双指针便利字符串
        int left = 0, right = pure.length() - 1;
        char[] charArray = pure.toCharArray();
        while (left <= right){
            if (charArray[left] == charArray[right]){
                left++;
                right--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
