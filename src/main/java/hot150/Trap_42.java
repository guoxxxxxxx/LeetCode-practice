package hot150;

public class Trap_42 {

    /**
     算法思想：
     1. 定义两个数组索引，初始时分别指向数组的首位两个端点；
     2. 将数组中，较低的那一个索引++或--,并记录改变后的元素与两端点所记录最小值的差值，即min(0, record_min - height[current]) 加入到结果中
     3. 直至left指针与right指针相遇截止
     该算法时间复杂度为O(n),空间复杂度为O(1)
     */
    public int trap(int[] height) {
        // 定义左右两端点的指针
        int left = 0, right = height.length - 1;
        int minHeight = 0;
        int currentHeight = 0;
        int result = 0;
        while(left < right){
            currentHeight = Math.min(height[left], height[right]);
            minHeight = Math.max(currentHeight, minHeight);
            if(height[left] < height[right]){
                left++;
                result += Math.max(minHeight - height[left], 0);
            }
            else{
                right--;
                result += Math.max(minHeight - height[right], 0);
            }
        }
        return result;
    }
}
