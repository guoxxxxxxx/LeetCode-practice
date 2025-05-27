public class Gas_134 {

    /**
     * 算法思想：
     * 1. 采用贪心算法，首先从起点出发，判断从起点到下一个点的油量是否充足。
     * 2. 若充足则加油继续前往下一个点，直至回到最初点，返回最初点的下标。
     * 3. 若不充足，则将未到达的点置为起点，重复上述算法。
     * 4. 若没有任何一个点可以循环一次，则返回-1。
     * @param gas
     * @param cost
     * @return
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int currentGas = 0;
        int startIdx = 0;
        for(int i=0; i<gas.length; i++){
            // 从第i个点出发，并加油
            currentGas += gas[i];
            for(int j=0; j<gas.length; j++){
                // 计算从i至i+1共消耗燃油的数量
                currentGas -= cost[i % gas.length];
                // 判断油量是否充足
                if (currentGas >= 0){
                    // 油量充足则继续进行加油
                    i += 1;
                    currentGas += gas[i % gas.length];
                }
                else{
                    // 油量不充足则将起点置为未到达的那个点,并将油箱清空
                    startIdx = (i + 1) % gas.length;
                    currentGas = 0;
                    break;
                }
                // 判断是否已经完成一个循环
                if (j == gas.length - 1){
                    return startIdx;
                }
            }
        }
        return -1;
    }
}
