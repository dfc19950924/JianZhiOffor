package JianZhioffoe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**

输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。

示例 1：

输入：arr = [3,2,1], k = 2
输出：[1,2] 或者 [2,1]
示例 2：

输入：arr = [0,1,2,1], k = 1
输出：[0]
 */
public class solution40 {
	class Solution {
	    public int[] getLeastNumbers(int[] arr, int k) {
	    	if(k >= arr.length)return arr;
	    	int[] res = new int[k];
	    	sort(arr);
	    	for(int i = 0; i <= k - 1; i++){
	    		res[i] = arr[i];
	    	}
	    	return res;
	    }
	    void sort(int[] arr){
	    	for(int i = 0; i <= arr.length - 1; i++){
	    		for(int j = i; j <= arr.length - 1; j++){
	    			if(arr[i] >= arr[j]){
	    				swap(arr,i,j);
	    			}
	    		}
	    	}
	    }
		private void swap(int[] arr,int i, int j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}