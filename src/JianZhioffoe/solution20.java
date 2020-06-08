package JianZhioffoe;

import java.util.ArrayList;
import java.util.Stack;

/**
请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，
字符串"+100"、"5e2"、"-123"、"3.1416"、"0123"都表示数值，
但"12e"、"1a3.14"、"1.2.3"、"+-5"、"-1E-16"及"12e+5.4"都不是。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/biao-shi-shu-zhi-de-zi-fu-chuan-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution20 {
	public static void main(String[] args) {
		boolean i = new Solution().isNumber("0");
		System.out.println(i);
	}
	public static class Solution {
		  public boolean isNumber(String s) {
			  char[] ch = s.trim().toCharArray();
			  boolean num = false;
			  boolean dot = false;
			  boolean e = false;
			  for(int i = 0; i < ch.length; i++){
				  char c = ch[i];
				  if(c >= '0' && c <= '9'){
					  num = true;
				  }	else if(c == 'e'){
					  if(!num || e)
						  return false;
					  e = true;
					  num = false;
				  }	else if(c == '.'){
					  if(dot || e)
						  return false;
					  dot = true;
				  }	else if(c == '+' || c == '-'){
				  	
					  if(i != 0 && ch[i-1] != 'e' && ch[i-1] != 'E'){
						  return false;
					  }
				  }else{
					  return false;
				  }
			  }
			  
			  return num;

		    }
		
		    }
	}

	    	
	    


