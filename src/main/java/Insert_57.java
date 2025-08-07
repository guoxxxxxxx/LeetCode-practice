import java.util.ArrayList;
import java.util.List;

/**
 * @Time: 2025/8/7 17:39
 * @Author: guo_x
 * @File: Insert_57
 * @Description:
 */
public class Insert_57 {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> resultList = new ArrayList<>();
        // 特殊情况
        // 0-1 如果intervals为空则直接将newInterval添加返回
        if(intervals.length == 0){
            return new int[][] {{newInterval[0], newInterval[1]}};
        }
        // 0-2 判断newInterval是否是在两端的
        if(newInterval[1] < intervals[0][0]){
            // 在首部的情况
            resultList.add(newInterval);
            for(int[] e : intervals){
                resultList.add(e);
            }
            return resultList.toArray(new int[resultList.size()][]);
        }
        // 在尾部的情况
        else if(newInterval[0] > intervals[intervals.length-1][1]){
            for(int[] e : intervals){
                resultList.add(e);
            }
            resultList.add(newInterval);
            return resultList.toArray(new int[resultList.size()][]);
        }

        boolean flag = false;

        // 普通情况
        // 记录合并开始索引位置
        int start = 0, end = 0;
        // 首先寻找到新区间的首部在已存在的区间的哪个位置
        for(int i=0; i<intervals.length; i++){
            // 此条件成立说明可以合并区间
            if((intervals[i][0] <= newInterval[0] && intervals[i][1] >= newInterval[0])
                    || (intervals[i][0] >= newInterval[0] && intervals[i][0] <= newInterval[1])){
                flag = true;
                if((intervals[i][0] <= newInterval[0] && intervals[i][1] >= newInterval[0])){
                    // 记录可合并的起始位置
                    start = intervals[i][0];
                    end = intervals[i][1];
                    if(end < newInterval[1]){
                        end = newInterval[1];
                    }
                }
                else{
                    // 记录可合并的起始位置
                    start = newInterval[0];
                    end = newInterval[1];
                    if(end < intervals[i][1]){
                        end = intervals[0][1];
                    }
                }
                // 循环合并，直到无法合并为止
                while(true){
                    i++;
                    if(intervals.length == i){
                        resultList.add(new int[]{start, end});
                        break;
                    }
                    if(intervals[i][0] >= start && intervals[i][0] <= end){
                        if(end < intervals[i][1]){
                            end = intervals[i][1];
                        }
                    }
                    else{
                        resultList.add(new int[]{start, end});
                        i--;    // 恢复索引
                        break;
                    }
                }
            }
            // 如果不成立则添加至列表中
            else{
                resultList.add(intervals[i]);
                // 判断是否不属于任何一个区间
                if(intervals.length - 1 > i && !flag){
                    if(intervals[i + 1][0] > newInterval[1]){
                        resultList.add(newInterval);
                        i++;
                        // 将剩余的数组全部添加
                        for(;i<intervals.length;i++){
                            resultList.add(intervals[i]);
                        }
                        return resultList.toArray(new int[resultList.size()][]);
                    }
                }
            }
        }
        return resultList.toArray(new int[resultList.size()][]);
    }
}
