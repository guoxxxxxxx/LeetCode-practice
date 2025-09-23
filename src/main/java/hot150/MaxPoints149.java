package hot150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Time: 2025/9/23 15:33
 * @Author: guo_x
 * @File: MaxPoints149
 * @Description:
 */
public class MaxPoints149 {

    public int maxPoints(int[][] points) {
        HashMap<Integer, List<Double>> map = new HashMap<>();
        if(points.length <= 2){
            return points.length;
        }
        for(int i=0; i<points.length; i++){
            map.put(i, new ArrayList<Double>());
            for(int j=0; j<points.length; j++){
                if(i == j){
                    continue;
                }
                map.get(i).add(computeSlope(points[i], points[j]));
            }
        }
        int max = 0;
        for(int key : map.keySet()){
            max = Math.max(max, maxCount(map.get(key)));
        }
        return max + 1;
    }

    public double computeSlope(int[] p1, int[] p2){
        if((p1[1] - p2[1]) == 0){
            return Double.MAX_VALUE;
        }
        return ((double)p1[0] - p2[0]) / (p1[1] - p2[1]);
    }


    public int maxCount(List<Double> list){
        int max = -1;
        double xl = list.get(0);
        list.sort(null);
        int current = 0;
        for(int i = 0; i<list.size(); i++){
            if(list.get(i) == xl){
                current += 1;
            }
            else {
                max = Math.max(current, max);
                current = 1;
                xl = list.get(i);
            }
        }
        max = Math.max(current, max);
        return max;
    }
}
