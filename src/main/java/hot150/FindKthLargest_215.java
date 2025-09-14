package hot150;

/**
 * @Time: 2025/9/14 14:50
 * @Author: guo_x
 * @File: FindKthLargest_215
 * @Description:
 */
public class FindKthLargest_215 {

    public int findKthLargest(int[] nums, int k) {
        quickSort(nums, 0, nums.length - 1);
        return nums[nums.length - k];
    }

    public void quickSort(int[] nums, int start, int end){
        if(start >= end){
            return;
        }
        int temp = nums[start];
        int cacheStart = start, cacheEnd = end;
        while(start <= end){
            while(nums[end] >= temp && start <= end){
                end--;
                if(start == end){
                    nums[start] = temp;
                    quickSort(nums, cacheStart, start - 1);
                    quickSort(nums, start + 1, cacheEnd);
                    return;
                }
            }
            nums[start] = nums[end];
            while(nums[start] <= temp && start <= end){
                start++;
                if(start == end){
                    nums[start] = temp;
                    quickSort(nums, cacheStart, start - 1);
                    quickSort(nums, start + 1, cacheEnd);
                    return;
                }
            }
            nums[end] = nums[start];
        }
    }
}
