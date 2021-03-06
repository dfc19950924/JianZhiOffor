package JianZhioffoe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;

import JianZhioffoe.solution33.TreeNode;

/**
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。

 

参考以下这颗二叉搜索树：

     5
    / \
   2   6
  / \
 1   3
示例 1：

输入: [1,6,3,2,5]
输出: false
示例 2：

输入: [1,3,2,6,5]
输出: true

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution33 {
	public static void main(String[] args) {
		int[] a = {4, 8, 6, 12, 16, 14, 10};
		System.out.println(new Solution().verifyPostorder(a));
	}
	
//	  Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	static class Solution {
	    public boolean verifyPostorder(int[] postorder) {
			
	    	return recur(postorder,0,postorder.length - 1);
	    }

		private boolean recur(int[] postorder, int i, int j) {
			if(i >= j) return true;
			int p = i;
			while(postorder[p] < postorder[j])p++;
			int m = p;
			while(postorder[p] > postorder[j])p++;
			return (p == j)&&(recur(postorder,i,m-1))&&(recur(postorder,m,j - 1));
		}
	}
}
