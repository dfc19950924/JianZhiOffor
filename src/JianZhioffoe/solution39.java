package JianZhioffoe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。

你可以假设数组是非空的，并且给定的数组总是存在多数元素。
示例 1:

输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
输出: 2

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution39 {
	public static void main(String[] args) {
		int[] a = {2,2,1,1,1,2,2};
		majorityElement(a);
	}
   public static void majorityElement(int[] nums) {
        //(1)找到重复的数字
	   Map<Integer, Integer> m =new HashMap<Integer, Integer>();
	   for(int i = 0; i <= nums.length - 1; i++){
		   Integer num = m.get(nums[i]);  
           m.put(nums[i], num == null ? 1 : num + 1);
	   }
	   for (Entry<Integer, Integer> integer : m.entrySet()) {
//		System.out.println(integer.getKey()+":"+integer.getValue());
		 if(integer.getValue() >= nums.length/2+1)
			 System.out.println(integer.getKey());
	}
   }
}