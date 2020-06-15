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
给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。

 

示例 1:

输入: 12258
输出: 5
解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution46 {
	public static void main(String[] args) {
		int a = 5211314;
		System.out.println(new Solution().translateNum(a));
	}
	static class Solution {
		    public int translateNum(int num) {
				//a代表一个数字代表一个字母；b代表两个数字组成一个字母；
				int a = 1, b = 1, x, y = num%10;
				while(num != 0){
					num/=10;
					x = num % 10;
					int temp = x * 10 + y;
					int c = (temp >= 10 && temp <= 25)?a+b:a;
					b = a;
					a = c;
					y = x;
				}
		    	return a;

		    }
		}	
	}
