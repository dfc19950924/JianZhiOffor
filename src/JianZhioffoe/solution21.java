package JianZhioffoe;

import java.util.ArrayList;
import java.util.Stack;

/**
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。

示例：
输入：nums = [1,2,3,4]
输出：[1,3,2,4]
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution21 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int[] i = new Solution().exchange(nums);
		for (int j : i) {
			System.out.println(j);
		}
	}
	public static class Solution {
	    public int[] exchange(int[] nums) {
//			for(int i = 0,j = nums.length-1; i < j; i++,j--){
//				
//					if(nums[i]%2 == 0 && nums[j]%2 == 1 && j >= i){
//						int temp = nums[i];
//						nums[i] = nums[j];
//						nums[j] = temp;
//					
//				}
//			}
	    	ArrayList<Integer> num1 = new ArrayList<>();
	    	ArrayList<Integer> num2 = new ArrayList<>();
	    	for(int i = 0; i < nums.length; i++){
	    		if(nums[i]%2 == 0){
	    			num1.add(nums[i]);
	    		}else{
	    			num2.add(nums[i]);
	    		}
	    	}
	    	int[] num = new int[num1.toArray().length+num2.toArray().length];
	    	
	    	System.arraycopy(num1.toArray(), 0, num, 0, num1.toArray().length);
	    	System.arraycopy(num2.toArray(), 0, num, num1.toArray().length, num2.toArray().length);
	    	
	    	return num;

	    }
		
		    }
	}

	    	
	    


