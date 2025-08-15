package hot150;

import java.util.ArrayList;
import java.util.List;

/**
 * @Time: 2025/6/14 17:42
 * @Author: guo_x
 * @File: hot150.FullJustify_68
 * @Description:
 */


public class FullJustify_68 {

    public List<String> fullJustify(String[] words, int maxWidth) {
        // 存储最终结果
        List<String> result = new ArrayList<>();
        // 定义一个字符数组用于存储当行所放置的元素
        List<String> rowResult = new ArrayList<>();
        int space = maxWidth;       // 用于记录当前行的剩余空间
        for(int i=0; i<words.length;){
            space = maxWidth;
            while(space >= words[i].length()){
                rowResult.add(words[i]);
                space -= words[i].length() + 1;
                i++;
                // 判断是否已经将全部元素处理完成
                if(words.length <= i){
                    result.add(insertSpace2Word(rowResult, space + rowResult.size(), true));
                    return result;
                }
            }
            // 当前行已经无法放入新元素，创建新的容器继续进行上述过程
            result.add(insertSpace2Word(rowResult, space + rowResult.size(), false));
            rowResult = new ArrayList<>();
        }
        return result;
    }


    // 向每个单词之间插入空格
    public String insertSpace2Word(List<String> wordList, int space, boolean isLastOne){
        StringBuilder sb = new StringBuilder();
        int spaceCount = wordList.size() - 1; // 一共需要插入的空格的位置的数量
        // 判断是否为最后一个，如果为最后一个则每个之间留一个空格，其余空格放到最后
        if (isLastOne){
            for(String e : wordList){
                sb.append(e);
                if (space > 0){
                    sb.append(" ");
                }
                space--;
            }
            // 将剩余空格插入到尾部
            sb.append(generateSpace(space));
            return sb.toString();
        }
        // 如果要插入的数量为0则将空格全部插入到尾部
        if (spaceCount == 0){
            sb.append(wordList.get(0)).append(generateSpace(space));
            return sb.toString();
        }
        // 开始向每个位置插入空格
        sb.append(wordList.get(0));
        int insertSpaceCount = space / spaceCount;
        int extraSpaceCount = space - (insertSpaceCount * spaceCount);
        for(int i=0; i<spaceCount; i++){
            int currentSpace = extraSpaceCount > 0 ? insertSpaceCount + 1 : insertSpaceCount;
            sb.append(generateSpace(currentSpace)).append(wordList.get(i+1));
            space -= currentSpace;
            extraSpaceCount--;
        }
        return sb.toString();
    }


    // 生成指定数量的空格字符串
    public String generateSpace(int count){
        String result = "";
        for(int i=0; i<count; i++){
            result += " ";
        }
        return result;
    }
}
