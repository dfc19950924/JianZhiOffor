package JianZhioffoe;

import java.util.HashSet;
import java.util.Set;

/**
 
给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B 中的元素
B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。

 

示例:

输入: [1,2,3,4,5]
输出: [120,60,40,30,24]
 

提示：

所有元素乘积之和不会溢出 32 位整数
a.length <= 100000

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/gou-jian-cheng-ji-shu-zu-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution66 {
	public static void main(String[] args) {
		for(int res:new Solution().constructArr(new int[]{1,2,3,4,5})){
			System.out.println(res);
		}
	}
	static class Solution {
	 public int[] constructArr(int[] a) {
		 int[] res = new int[a.length];
		 for(int n = 0; n < a.length; n++){
//			 System.out.println(res(a,0,n)+":"+res(a,n+1,a.length));
			 res[n] = res(a,0,n)*res(a,n+1,a.length);
		 }
		 return res;
    }
	 public int res(int[] arr,int i,int j){
		 int res = 1;
		 for(int tep = i; tep < j; tep++){
//			 System.out.println(arr[tep]);
			 res *= arr[tep];
//			 System.out.println(res);
		 }
		 return res;
	 }
	}
}