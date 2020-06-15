package JianZhioffoe;

import java.util.HashMap;
import java.util.Map;

/**

在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。

 

示例 1:

输入: [7,5,6,4]
输出: 5

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/shu-zu-zhong-de-ni-xu-dui-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution51 {
	public static void main(String[] args) {
		int res = new Solution().reversePairs(new int[]{7,5,6,4});
		System.out.println(res);
	}
	static class Solution {
		 int res = 0;
		 public int reversePairs(int[] nums) {
//			 for (int i : nums) {
//				System.out.println(i);
//			}
			 mergeSort(nums, 0, nums.length - 1);
//			 for (int i : nums) {
//				System.out.println(i);
//			}
			return res;
			 	
		    }
		//两路归并算法，两个排好序的子序列合并为一个子序列
		 public void merge(int[] a, int left, int mid, int right){
			 int[] temp = new int[a.length];
			//p1、p2是检测指针，k是存放指针
			 int p1 = left,p2 = mid + 1, k = left;
			 while(p1 <= mid && p2 <= right){
				 if(a[p1] <= a[p2])
					 temp[k++] = a[p1++];
				 else
					 res = res + (mid - p1);
					 temp[k++] = a[p2++];
			 }
			 //如果第一个序列未检测完，直接将后面所有元素加到合并的序列中
			 while(p1 <= mid)temp[k++] = a[p1++];
			 //如果第二个序列未检测完，直接将后面所有元素加到合并的序列中
			 while(p2<=right) temp[k++]=a[p2++];
			//复制回原素组
		        for (int i = left; i <=right; i++) 
		            a[i]=temp[i];
		 }
		 	public void mergeSort(int [] a,int start,int end){
		        if(start<end){//当子序列中只有一个元素时结束递归
		            int mid=(start+end)/2;//划分子序列
		            mergeSort(a, start, mid);//对左侧子序列进行递归排序
		            mergeSort(a, mid+1, end);//对右侧子序列进行递归排序
		            merge(a, start, mid, end);//合并
		        }
		    }
	}
}
