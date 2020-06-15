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
输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。

序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。

 

示例 1：

输入：target = 9
输出：[[2,3,4],[4,5]]
示例 2：

输入：target = 15
输出：[[1,2,3,4,5],[4,5,6],[7,8]]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution57_2 {
	public static void main(String[] args) {
		
	}
	static class Solution {
		public int[][] findContinuousSequence(int target) {
			int i = 1; // 滑动窗口左边界
			int j = 1;//滑动窗口右边界
			int sum = 0; //滑动窗口数字的和
			List<int[]> res = new ArrayList<>();
			while(i <= target/2){
				if(sum < target){
					sum += j;
					j++;
				}else if(sum > target){
					sum -= i;
					i++;
				}else{
					int[] arr = new int[j - i];
					for (int k : arr) {
						k = k + i;
					}
					res.add(arr);
				sum -= i;
				i++;
				}
				
			}
			return res.toArray(new int[res.size()][]);
			
		}
	}
		
	}
