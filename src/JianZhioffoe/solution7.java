package JianZhioffoe;

import java.util.ArrayList;

/**
输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
例如，给出

前序遍历 preorder = [3,9,20,15,7]
中序遍历 inorder = [9,3,15,20,7]
返回如下的二叉树：

    3
   / \
  9  20
    /  \
   15   7
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution7 {
	class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
		  }
	int preindex = 0,inindex = 0;
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return dfs(preorder,inorder,null);
    }
	private TreeNode dfs(int[] preorder,int[] inorder,TreeNode finish){
		TreeNode root = new TreeNode(preorder[preindex++]);//根结点
		//左节点
		root.left = dfs(preorder,inorder,root);
		inindex++;
		//右节点
		root.right = dfs(preorder,inorder,finish);
		//返回null的情况
		if(preindex == preorder.length || (finish.val == inorder[inindex] && finish != null)) 
			return null;
		return root;
	}
}
