package hot150;

import java.util.ArrayList;
import java.util.List;

/**
 * @Time: 2025/9/2 13:53
 * @Author: guo_x
 * @File: CombinationSum_39
 * @Description:
 */
public class CombinationSum_39 {
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        traceBack(candidates, 0, target, new ArrayList<Integer>());
        return result;
    }

    public void traceBack(int[] candidates, int start, int space, List<Integer> temp){
        if(space == 0){
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        else if(space < 0 || start >= candidates.length){
            return;
        }
        for(int i=start; i<candidates.length; i++){
            List<Integer> newList = new ArrayList<>(temp);
            newList.add(candidates[i]);
            traceBack(candidates, i, space - candidates[i], newList);
        }
    }
}
