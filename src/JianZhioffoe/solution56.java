package JianZhioffoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**

一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。

 

示例 1：

输入：nums = [4,1,4,6]
输出：[1,6] 或 [6,1]
示例 2：

输入：nums = [1,2,10,4,1,4,3,3]
输出：[2,10] 或 [10,2]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution56 {
	public static void main(String[] args) {
		int[] test = {1,2,10,4,1,4,3,3};
		int[] res = new Solution().singleNumbers(test);
		for (int i : res) {
			System.out.println(i);
		}
	}
	static class Solution {
		  public int[] singleNumbers(int[] nums) {
			  ArrayList<Integer> al = new ArrayList<>();
			  HashMap<Integer,Integer> hm = new HashMap<>();
			  int  index = 0;
			  for(int i = 0; i < nums.length; i++){
				  hm.put(nums[i], hm.containsKey(nums[i])?2:1);
				  Set<Entry<Integer,Integer>> set = hm.entrySet();
				  for (Entry<Integer, Integer> entry : set) {
					if(entry.getValue() == 1)
						al.add(entry.getKey());
				}
			  }
			  int[] res = new int[al.size()];
			  for(int j = 0; j < al.size(); j++){
				  res[j] = al.get(j);
			  }
			  return res;

		    }
	  }
}
