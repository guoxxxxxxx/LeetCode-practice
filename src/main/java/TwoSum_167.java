public class TwoSum_167 {

    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length;
        int currentSum;
        while(true){
            currentSum = numbers[start] + numbers[end];
            if(currentSum == target){
                return new int[]{start + 1, end + 1};
            }
            else if(currentSum > target){
                end--;
            }
            else{
                start++;
            }
        }
    }
}
