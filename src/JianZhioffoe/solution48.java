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

从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。

 

示例 1:

输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution48 {
	public static void main(String[] args) {
		int res = new Solution().lengthOfLongestSubstring("pwwkew");
		System.out.println(res);
	}
	static class Solution {
		public int lengthOfLongestSubstring(String s) {
			Map<Character,Integer> dic = new HashMap<>();
			int i = -1, res = 0;
			for(int j = 0; j < s.length(); j++){
				if(dic.containsKey(s.charAt(j)))
					//更新左指针
					i = Math.max(i, dic.get(s.charAt(j)));
				dic.put(s.charAt(j), j);
				res = Math.max(res, j - i);
			}
			return res;
		}
		
	}
}
