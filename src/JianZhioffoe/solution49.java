package JianZhioffoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;

/**

我们把只包含因子 2、3 和 5 的数称作丑数（Ugly Number）。求
按从小到大的顺序的第 n 个丑数。
示例:
输入: n = 10
输出: 12
解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/chou-shu-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution49 {
	public static void main(String[] args) {
		int res = new Solution().nthUglyNumber(10);
		System.out.println(res);
	}
	static class Solution {
		public int nthUglyNumber(int n) {
			int p2 = 0, p3 = 0, p5 = 0;//定义三个指针，初始都为0位置
			int[] res = new int[n];
			res[0] = 1;
			for(int i = 1; i < n; i++){
				res[i] = Math.min(Math.min(res[p3]*3, res[p5]*5),2 * res[p2]);
				//第一个丑数是1，计算第二个丑数，必须是2,3,5的倍数
				if(res[i] == res[p2] * 2)p2++;
				//找到归属2的倍数的下一个丑数
				if(res[i] == res[p3] * 3)p3++;
				//找到归属3的倍数的下一个丑数
				if(res[i] == res[p5] * 5)p5++;
				//找到归属5的倍数的下一个丑数
			}
			return res[n - 1];
		}
		
	}
}
