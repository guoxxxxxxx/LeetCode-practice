public class StrStr_28 {

    public int strStr(String haystack, String needle) {
        // 如果 needle 为空字符串，直接返回0
        if (needle.isEmpty()) {
            return 0;
        }

        // 计算模式串的next数组
        int[] next = new int[needle.length()];
        next[0] = 0;
        char[] needleCharArray = needle.toCharArray();

        // 计算 next 数组
        for (int i = 1, j = 0; i < needle.length(); ) {
            if (needleCharArray[i] == needleCharArray[j]) {
                j++;
                next[i] = j;
                i++;
            } else {
                if (j != 0) {
                    j = next[j - 1];  // 回溯到前一个最长前后缀的位置
                } else {
                    next[i] = 0;
                    i++;
                }
            }
        }

        // 开始进行字符串匹配
        char[] haystackCharArray = haystack.toCharArray();
        int i = 0, j = 0;

        while (i < haystackCharArray.length) {
            if (haystackCharArray[i] == needleCharArray[j]) {
                i++;
                j++;
                // 如果 j 达到 needle.length()，表示匹配成功
                if (j == needleCharArray.length) {
                    return i - j;
                }
            } else {
                if (j != 0) {
                    j = next[j - 1];  // 回溯到下一个可能的前缀位置
                } else {
                    i++;  // 当前字符不匹配，继续 haystack 中的下一个字符
                }
            }
        }

        // 如果匹配失败，返回 -1
        return -1;
    }
}
