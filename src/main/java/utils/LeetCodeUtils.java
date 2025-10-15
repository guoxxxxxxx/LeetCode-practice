package utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Time: 2025/9/27 19:47
 * @Author: guo_x
 * @File: LeetCodeUtils
 * @Description:
 */
public class LeetCodeUtils {


    /**
     * 根据字符串将内容转化为二维数组
     * @param str 字符串
     * @return 二维数据
     */
    public static int[][] convertString2Array2D(String str){
        // 去掉外层方括号
        str = str.trim();
        if (str.startsWith("[") && str.endsWith("]")) {
            str = str.substring(1, str.length() - 1);
        }

        // 按 '],[' 分割每一行
        String[] rows = str.split("],\\[");
        int[][] result = new int[rows.length][];

        for (int i = 0; i < rows.length; i++) {
            // 去掉每行可能残留的方括号
            String row = rows[i].replaceAll("[\\[\\]]", "");
            String[] nums = row.split(",");
            result[i] = new int[nums.length];
            for (int j = 0; j < nums.length; j++) {
                result[i][j] = Integer.parseInt(nums[j].trim());
            }
        }

        return result;
    }
}
