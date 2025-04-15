public class ArrayMulti_283 {
    public int[] productExceptSelf(int[] nums) {
        int[] leftArray = new int[nums.length];
        int[] rightArray = new int[nums.length];

        // 初始化数组
        leftArray[0] = 1;
        rightArray[nums.length - 1] = 1;
        for(int i=1; i<nums.length; i++){
            leftArray[i] = leftArray[i-1] * nums[i-1];
        }
        for(int j=nums.length - 2; j>=0; j--){
            rightArray[j] = rightArray[j+1] * nums[j+1];
        }

        // 计算最终结果
        for(int i=0; i<nums.length; i++){
            nums[i] = leftArray[i] * rightArray[i];
        }
        return nums;
    }
}
