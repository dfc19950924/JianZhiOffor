package JianZhioffoe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;

/**

给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。

示例:

输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
输出: [3,3,5,5,6,7] 
解释: 

  滑动窗口的位置                最大值
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution59 {
	public static void main(String[] args) {
		int[] is = new Solution().maxSlidingWindow(new int[]{}, 0);
		for (int i : is) {
			System.out.println(i);
		}
	}
	static class Solution {
		public int[] maxSlidingWindow(int[] nums, int k)  {
			if(nums == null || nums.length == 0)
				return new int[]{};
			if(nums != null && nums.length > 0 && nums.length <= k){
				System.out.println("hello");
				return new int[]{findMax(nums)};
			}
			int left = 0, right = k, index = 0;
			int[] res = new int[nums.length - k + 1];
			ArrayList<Integer> al = new ArrayList<>();
			while(left + k <= nums.length){
				ArrayList<Integer> tmp = new ArrayList<>();
				for(int i = left ; i < left + k; i++){
//					System.out.print(nums[i]);
					tmp.add(nums[i]);
				}
				al.add(findMax(tmp));
				left++;
			}
			for(int n = 0; n < res.length; n++){
				res[n] = al.get(n);
			}
			return res;
			
		}
		public int findMax(ArrayList<Integer> arr){
			int max = arr.get(0);
			for (int i : arr) {
				if(i > max)max = i;
			}
			return max;
		} 
		public int findMax(int[] arr){
			if(arr == null) return 0;
			int max = arr[0];
			for (int i : arr) {
				if(i > max)max = i;
			}
			return max;
		} 
	}
}