package hot150;

import java.util.ArrayList;
import java.util.List;

/**
 * @Time: 2025/10/15 23:02
 * @Author: guo_x
 * @File: a
 * @Description:
 */
public class SubarraySum560 {

    int count = 0, n = 0;
    List<Integer> ans = new ArrayList<Integer>();

    public int subarraySum(int[] nums, int k) {
        n = nums.length;
        dfs(nums, 0, k);
        return count;
    }


    public void dfs(int[] nums, int idx, int k){
        if(idx >= n || sum() > k){
            return;
        }
        ans.add(nums[idx]);
        if(sum() == k){
            count += 1;
        }
        dfs(nums, idx + 1, k);
        ans.remove(ans.size() - 1);
        dfs(nums, idx + 2, k);
    }


    private int sum(){
        int tmp = 0;
        for(int e : ans){
            tmp += e;
        }
        return tmp;
    }
}
