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

字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。

 

示例 1：

输入: s = "abcdefg", k = 2
输出: "cdefgab"
示例 2：

输入: s = "lrloseumgh", k = 6
输出: "umghlrlose"

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution58_2 {
	public static void main(String[] args) {
		System.out.println(new Solution().reverseLeftWords("abcdefg",2));
	}
	static class Solution {
		public String reverseLeftWords(String s, int n) {
			if(n > s.length())return s;
			char[] array = s.toCharArray();
			String res = "";
			for(int i = n; i < s.length(); i++){
				res += array[i];
			}
			
			for(int i = 0; i < n; i++){
				res += array[i];
			}
			
			return res;
		}

		
	}
}