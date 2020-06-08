package JianZhioffoe;

import java.util.ArrayList;
import java.util.Stack;

/**
一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。

答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。

示例 1：

输入：n = 2
输出：2
示例 2：

输入：n = 7
输出：21

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution10_2 {
	public static void main(String[] args) {
		int i = new Solution().numWays(2);
		System.out.println(i);
	}
	static class Solution {
	    public int numWays(int n) {
	    	if(n == 0)
				return 1;
	    	if(n == 1)
	    		return 1;
	    	int first = 1;
	    	int second = 1;
	    	int res = 0;
	    	for (int i = 2; i <= n ;i++){
	    		res = (first+second) % 1000000007;
                first = second % 1000000007;
                second = res % 1000000007;
	    	}
	    	return res % 1000000007;

	    }
	}
}