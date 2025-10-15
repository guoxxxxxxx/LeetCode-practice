package hot150;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @Time: 2025/10/14 17:14
 * @Author: guo_x
 * @File: TopKFrequent347
 * @Description:
 */
public class TopKFrequent347 {

    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> countQueue = new PriorityQueue<>((o1, o2) -> (o2[1] - o1[1]));
        Arrays.sort(nums);
        int count = 0;
        int currentNum = nums[0];
        for(int i=0; i<nums.length; i++){
            if(currentNum == nums[i]){
                count++;
            }
            else{
                countQueue.offer(new int[]{currentNum, count});
                count = 1;
                currentNum = nums[i];
            }
        }

        countQueue.offer(new int[]{currentNum, 1});

        int[] result = new int[k];
        int idx = 0;
        while(--k >= 0){
            int[] tmp = countQueue.poll();
            result[idx++] = tmp[0];
        }

        return result;
    }
}
