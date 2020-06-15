package JianZhioffoe;

import java.util.HashMap;
import java.util.Map;

/**

在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。

示例:

s = "abaccdeff"
返回 "b"

s = "" 
返回 " "

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution50 {
	public static void main(String[] args) {
		int res = new Solution().firstUniqChar("abaccdef");
		System.out.println(res);
	}
	static class Solution {
		public char firstUniqChar(String s) {
			char[] array = s.toCharArray();
			Map<Character,Boolean> map = new HashMap<>();
			for (char c : array) {
				map.put(c,!map.containsKey(c));
			}
			for (char c : array) {
				if(map.get(c))return c;
			}
			return ' ';
		}
		
	}
}
