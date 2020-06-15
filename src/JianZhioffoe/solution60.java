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
 
 把n个骰子扔在地上，所有骰子朝上一面的点数之和为s。输入n，打印出s的所有可能的值出现的概率。

 

你需要用一个浮点数数组返回答案，其中第 i 个元素代表这 n 个骰子所能掷出的点数集合中第 i 小的那个的概率。

 

示例 1:

输入: 1
输出: [0.16667,0.16667,0.16667,0.16667,0.16667,0.16667]
示例 2:

输入: 2
输出: [0.02778,0.05556,0.08333,0.11111,0.13889,0.16667,0.13889,0.11111,0.08333,0.05556,0.02778]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/nge-tou-zi-de-dian-shu-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution60 {
	public static void main(String[] args) {
		double[] arr = new double[2];
		arr = new Solution().twoSum(2);
		for (double d : arr) {
			System.out.println(d);
		}
	}
	static class Solution {
	    public double[] twoSum(int n) {
	    	int[][] arr = new int[n + 1][6 * n + 1];//表示i个骰子掷出s点的次数
	    	for(int i = 1; i <= 6; i++){
	    		arr[1][i] = 1;//表示一个骰子掷出i点的次数为1
	    	}
	    	for(int i = 2; i <= n; i++){//表示骰子的个数
	    		for(int s = i; s < 6 * i; s++){//表示可能会出现的点数之和
	    			for(int j = 1; j <= 6; j++){//表示当前这个骰子可能掷出的点数
	    				if(s - j < j - 1)break;//当总数还没有j大时，就不存在这种情况
	    				//当前n个骰子出现的点数之和等于前一次出现的点数之和加上这一次出现的点数
	    				arr[i][s]+=arr[i - 1][s - j];
	    			}
	    	   }
	    	}
	    	//掷出n次点数出现的所有情况
	    	double total = Math.pow((double)6, (double)n);
	    	//因为最大就只会出现5*n+1中点数
	    	double[] ans = new double[5 * n + 1];
	    	for(int i = n; i <= 6 * n;i++){
	    		ans[i - n] = ((double)arr[n][i])/total;
	    	}
	    	return ans;

	    }
	}
}