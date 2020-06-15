package JianZhioffoe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;

import org.junit.Test;

import JianZhioffoe.solution32_2.TreeNode;

/**
从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。

 

例如:
给定二叉树: [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回其层次遍历结果：

[
  [3],
  [9,20],
  [15,7]
]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution32_2 {
	
	
//	  Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	class Solution {
		@Test
	    public List<List<Integer>> levelOrder(TreeNode root) {
	    	if(root == null) return null;
	    	Queue<TreeNode> q = new LinkedList<>();
	    	q.add(root);
	    	List<List<Integer>> arra = new ArrayList<>();
	    	while(!q.isEmpty()){
	    		ArrayList<Integer> temp = new ArrayList<>();
	    		for(int j = q.size(); j >= 0; j--){
		    		TreeNode node = q.poll();
		    		temp.add(node.val);
		    		if(node.left != null)q.add(node.left);
		    		if(node.right != null)q.add(node.right);
	    		}
	    		arra.add(temp);
	    	}
	    	return arra;
	    }
	}
}
