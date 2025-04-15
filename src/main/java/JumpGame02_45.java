/**
 * 45.跳跃游戏2
 */

public class JumpGame02_45 {
    public int jump(int[] nums) {
        int[] shortArray = new int[nums.length];
        // init shortArray
        for(int i = 0; i<nums.length; i++){
            shortArray[i] = nums.length + 2;
        }

        shortArray[0] = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<=nums[i]; j++){
                if(i + j < nums.length && shortArray[i + j] > shortArray[i] + 1){
                    shortArray[i + j] = shortArray[i] + 1;
                }
            }
        }

        return shortArray[nums.length - 1];
    }


    public int jump_method2(int[] nums) {
        int startIdx = 0, endIdx = 0;
        int step = 0;

        while(nums.length - 1 > endIdx){
            int endIdxTemp = 0, startIdxTemp = 0;
            step += 1;
            for(int i=startIdx; i<=endIdx; i++){
                if(endIdxTemp < nums[i] + i){
                    endIdxTemp = nums[i] + i;
                    startIdxTemp = i + 1;
                }
            }
            endIdx = endIdxTemp;
            startIdx = startIdxTemp;
        }
        return step;
    }

}
