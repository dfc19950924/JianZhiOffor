package JianZhioffoe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;

import org.junit.Test;

import JianZhioffoe.solution32_3.TreeNode;

/**
请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。

 

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
  [20,9],
  [15,7]
]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution32_3 {
	
	
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
	    	Deque<TreeNode> q = new LinkedList<>();
	    	if(root != null)q.add(root);
	    	List<List<Integer>> arra = new ArrayList<>();
	    	while(!q.isEmpty()){
	    		List<Integer> temp = new ArrayList<>();
	    		for(int j = q.size() - 1; j >= 0; j--){
		    		TreeNode node = q.poll();
		    		temp.add(node.val);
		    		if(node.left != null)q.add(node.left);
		    		if(node.right != null)q.add(node.right);
		    		}
	    		if(arra.size() % 2 == 1) Collections.reverse(temp);
	    		arra.add(temp);
	    	}
	    	return arra;
	    }
	}
}
