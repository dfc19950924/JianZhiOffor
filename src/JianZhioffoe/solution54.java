package JianZhioffoe;

import java.util.ArrayList;
import java.util.Arrays;

/**

给定一棵二叉搜索树，请找出其中第k大的节点。

 

示例 1:

输入: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
输出: 4
示例 2:

输入: root = [5,3,6,2,4,null,null,1], k = 3
       5
      / \
     3   6
    / \
   2   4
  /
 1
输出: 4

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution54 {
	// Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	class Solution {
	    public int kthLargest(TreeNode root, int k) {
	    	ArrayList<Integer> al = preOrderTraveral(root);
	    	int[] res = new int[al.size()];
	    	for(int i = 0; i < res.length; i++){
	    		res[i] = al.get(i);
	    	}
            Arrays.sort(res);
            reverse(res);
	    	return res[k - 1];

	    }
        public void reverse(int[] arr){
	    	for(int i = 0,j = arr.length - 1;i < j;i++,j--){
	    		int temp = arr[i];
	    		arr[i] = arr[j];
	    		arr[j] = temp;
	    	}
	    }
	    ArrayList<Integer> al = new ArrayList<>();
        public ArrayList<Integer> preOrderTraveral(TreeNode node){
	    	if(node == null)return null;
	    	al.add(node.val);
	    	preOrderTraveral(node.left);
            preOrderTraveral(node.right);
	    	
	    	return al;
	    }
	}
}
