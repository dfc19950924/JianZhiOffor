package JianZhioffoe;

import java.util.HashMap;
import java.util.Map;

/**

统计一个数字在排序数组中出现的次数。

 

示例 1:

输入: nums = [5,7,7,8,8,10], target = 8
输出: 2
示例 2:

输入: nums = [5,7,7,8,8,10], target = 6
输出: 0

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution53 {
	public static void main(String[] args) {
		System.out.println(new Solution().search(new int[]{5,7,7,8,8,10}, 6));
	}
	static class Solution {
	    public int search(int[] nums, int target) {
	    	int time = 0;
			for(int i = 0; i < nums.length; i++){
				if(nums[i] == target)
					time++;
			}
			return time;

	    }
	}
	
}
