package hot150;

/**
 * @Time: 2025/9/9 14:21
 * @Author: guo_x
 * @File: Search_33
 * @Description:
 */
public class Search_33 {

    public int search(int[] nums, int target) {
        int length = nums.length;
        if(length == 1 && nums[0] == target){
            return 0;
        }
        else if(length == 2){
            if(nums[0] == target){
                return 0;
            }
            else if(nums[1] == target){
                return 1;
            }
        }

        int left = 0;
        int right = length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > nums[left]){
                if(nums[left] <= target && nums[mid] > target){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            else {
                if(nums[right] == target){
                    left = mid + 1;
                }
                else if(nums[right] > target && nums[mid] < target){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }

        }
        return -1;
    }
}
