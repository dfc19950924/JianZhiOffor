package JianZhioffoe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import JianZhioffoe.solution37.TreeNode;

/**
	
	请实现两个函数，分别用来序列化和反序列化二叉树。

示例: 

你可以将以下二叉树：

    1
   / \
  2   3
     / \
    4   5

序列化为 "[1,2,3,null,null,4,5]"

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/xu-lie-hua-er-cha-shu-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution37 {
	
//	  Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	public class Codec {

	    // Encodes a tree to a single string.
	 /**   public String serialize(TreeNode root) {
	        Queue<TreeNode> q = new LinkedList<>();
	        ArrayList<Integer> arra = new ArrayList<>();
	        q.add(root);
	        while(!q.isEmpty()){
	        	TreeNode node = q.poll();
	        	arra.add(node.val);
	        	if(node.left != null)q.add(node.left);
	        	if(node.right != null) q.add(node.right);
	        }
	        String res = arra.toString();
	        return res;
	    }
**/
		public String serialize(TreeNode root){
			if(root == null) return "[]";
			StringBuilder res = new StringBuilder("[");
			Queue<TreeNode> q = new LinkedList<>();
			q.add(root);
			while(!q.isEmpty()){
				TreeNode node = q.poll();
				if(node != null){
					res.append(node.val+',');
					if(node.left != null) q.add(node.left);
					if(node.right != null) q.add(node.right);
				}else{
					res.append("null,");
				}
			}
			res.deleteCharAt(res.length() - 1);
			res.append("]");
			return res.toString();
			
		}
	    // Decodes your encoded data to tree.
	    public TreeNode deserialize(String data) {
	        if(data.equals("[]"))return null;
	        String[] vals = data.substring(1,data.length() - 1).split(",");
	        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
	        Queue<TreeNode> q = new LinkedList<>();
	        q.add(root);
	        int i = 1;
	        while(!q.isEmpty()){
	        	TreeNode node = q.poll();
	        	if(!vals[i].equals("null")){
	        		node.left = new TreeNode(Integer.parseInt(vals[i]));
	        		q.add(node.left);
	        	}
	        	i++;
	        	if(!vals[i].equals("null")){
	        		node.right = new TreeNode(Integer.parseInt(vals[i]));
	        		q.add(node.right);
	        	}
	        	i++;
	        }
	        return root;
	    }
	}

	// Your Codec object will be instantiated and called as such:
	// Codec codec = new Codec();
	// codec.deserialize(codec.serialize(root));
}
