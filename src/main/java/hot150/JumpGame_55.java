package hot150;

/**
 * @Time: 2025/4/11 10:59
 * @Author: guoxun
 * @File: hot150.JumpGame_55
 * @Description:
 */

public class JumpGame_55 {

    public boolean canJump(int[] nums) {
        int length = nums.length;
        return jumpOnce(nums, length-1);
    }

    public boolean jumpOnce(int[] nums, int endIndex){

        // base case 递归跳出条件
        if(endIndex == 0){
            return true;
        }
        int needStep = 1;
        for(int i=endIndex - 1; i>=0; i--){
            if(nums[i] >= needStep){
                return jumpOnce(nums, i);
            }
            needStep++;
        }
        return false;
    }
}
