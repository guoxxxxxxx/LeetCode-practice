package hot150;

/**
 * @Time: 2025/3/6 21:48
 * @Author: guoxun
 * @File: hot150.MergeNumberArray_88
 * @Description:
 */

public class MergeNumberArray_88 {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
        int index_1 = 0, index_2 = 0, index = 0;
        while(index_1 < m || index_2 < n){
            if(index_1 == m){
                result[index] = nums2[index_2];
                index_2 += 1;
                index += 1;
                continue;
            }
            if(index_2 == n){
                result[index] = nums1[index_1];
                index_1 += 1;
                index += 1;
                continue;
            }
            if(nums1[index_1] > nums2[index_2]){
                result[index] = nums2[index_2];
                index_2 += 1;
            }
            else{
                result[index] = nums1[index_1];
                index_1 += 1;
            }
            index += 1;
        }
        nums1 =  result;
        return nums1;
    }
}
