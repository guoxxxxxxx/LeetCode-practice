package hot150;

public class ZConvert_6 {

    public String convert(String s, int numRows) {

        // 判断特殊情况
        if (numRows == 1){
            return s;
        }
        // 1. 定义队列
        StringBuilder[] sb = new StringBuilder[numRows];

        // 1.1 给队列进行初始化
        for(int i=0; i<numRows; i++){
            sb[i] = new StringBuilder();
        }

        // 2. 循环遍历字符串
        char[] charArray = s.toCharArray();
        int idx = 0;
        int sbIdx = 0;
        boolean isDesc = false;
        while(charArray.length > idx){
            // 将数组插入到对应的队列中
            sb[sbIdx].append(charArray[idx]);
            // 判断当前队列下标是递减还是递增
            if(isDesc){
                sbIdx -= 1;
            }
            else{
                sbIdx += 1;
            }
            // 判断是否应该转向
            if(sbIdx == numRows){
                isDesc = true;
                sbIdx -= 2;
            }
            else if(sbIdx == -1){
                isDesc = false;
                sbIdx += 2;
            }
            idx += 1;
        }

        // 将结果进行拼接
        String result = "";
        for(int i=0; i<numRows; i++){
            result += sb[i].toString();
        }
        return result;
    }
}
