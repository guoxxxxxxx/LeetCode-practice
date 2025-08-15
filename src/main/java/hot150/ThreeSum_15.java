package hot150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1;){
            int start = i + 1;
            int end = nums.length - 1;
            while(start < end){
                if (nums[i] + nums[start] + nums[end] == 0){
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    // 跳过相同的部分
                    while(start < nums.length - 1 && start < end && nums[start] == nums[start + 1]){
                        start += 1;
                    }
                    while(nums[end] == nums[end - 1] && end < start){
                        end -= 1;
                    }
                    end--;
                    start++;
                }
                else if(nums[i] + nums[start] + nums[end] > 0){
                    end--;
                }
                else {
                    start++;
                }
            }
            // 跳过相同的部分
            while(nums[i] == nums[i + 1] && i < nums.length - 2){
                i += 1;
            }
            i += 1;
        }
        return result;
    }
}
