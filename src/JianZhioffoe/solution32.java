package JianZhioffoe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;

import JianZhioffoe.solution32.TreeNode;

/**
从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。

 

例如:
给定二叉树: [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回：

[3,9,20,15,7]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution32 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
	}
	
//	  Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	class Solution {
	    public int[] levelOrder(TreeNode root) {
	    	if(root == null) return new int[0];
	    	Queue<TreeNode> q = new LinkedList<>();
	    	q.add(root);
	    	ArrayList<Integer> arra = new ArrayList<>();
	    	while(!q.isEmpty()){
	    		TreeNode node = q.poll();
	    		arra.add(node.val);
	    		if(node.left != null)q.add(node.left);
	    		if(node.right != null)q.add(node.right);

	    	}
	    	int[] res = new int[arra.size()];
	    	for(int i = 0; i <= arra.size(); i++){
	    		 res[i] = arra.get(i);
	    	}
	    	return res;
	    }
	}
}
