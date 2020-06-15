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
 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。

要求时间复杂度为O(n)。

 

示例1:

输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution42 {
	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(new Solution().maxSubArray(nums));
		
	}
	static class Solution {
	    public int maxSubArray(int[] nums) {
	    	int res = nums[0];
	    	for (int i = 1; i < nums.length; i++) {
				nums[i] += Math.max(nums[i - 1], 0);
				System.out.println(nums[i]+":");
				res = Math.max(res, nums[i]);
				System.out.println(res);
	    	}
	    	return res;
	    }
	}
}