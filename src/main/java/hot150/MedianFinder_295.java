package hot150;

import java.util.PriorityQueue;

/**
 * @Time: 2025/9/16 16:05
 * @Author: guo_x
 * @File: MedianFinder_295
 * @Description:
 */
public class MedianFinder_295 {

    private PriorityQueue<Integer> maxHeap, minHeap;

    public MedianFinder_295() {
        maxHeap = new PriorityQueue<>((a, b) -> (b - a));
        minHeap = new PriorityQueue<>((a, b) -> (a - b));
    }

    public void addNum(int num) {
        if(minHeap.size() == 0){
            minHeap.offer(num);
        }
        else if(minHeap.size() - maxHeap.size() >= 0){
            if(minHeap.peek() >= num){
                maxHeap.offer(num);
            }
            else{
                minHeap.offer(num);
                maxHeap.offer(minHeap.poll());
            }
        }
        else {
            if(maxHeap.peek() <= num){
                minHeap.offer(num);
            }
            else{
                maxHeap.offer(num);
                minHeap.offer(maxHeap.poll());
            }
        }
    }

    public double findMedian() {
        int total = maxHeap.size() + minHeap.size();
        if(total % 2 == 1){
            if(maxHeap.size() > minHeap.size()){
                return (double)(maxHeap.peek());
            }
            else {
                return (double)(minHeap.peek());
            }
        }
        else {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }
}
