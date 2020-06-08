package JianZhioffoe;

import java.util.ArrayList;
import java.util.Stack;

/**
请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。

[["a","b","c","e"],
["s","f","c","s"],
["a","d","e","e"]]

但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入这个格子。
示例 1：
输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
输出：true
示例 2：
输入：board = [["a","b"],["c","d"]], word = "abcd"
输出：false

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution12 {
	public static void main(String[] args) {
		String[][] a = {{"A","B","C","E"},{"S","F","C","S"},{"A","D","E","E"}};
		boolean i = new Solution().exist(a, "ABC");
		System.out.println(i);
	}
	static class Solution {
	    public boolean exist(String[][] a, String word) {
	        for(int i = 0;i < a.length;i++){
	            for(int j = 0;j<a[0].length;j++){
	               if(dfs(a,word,0,i,j))
	                return true;
	            }
	        }
	        return false;
	    }
	    public boolean dfs(String[][] a,String word,int i,int x,int y){
	        if(x >= a.length || x < 0 || y >= a[0].length || y < 0 || a[x][y] != String.valueOf(word.charAt(i)))
	            return false;
	        if(i == word.length() - 1)
	            return true;
	        String temp = a[x][y];
	        a[x][y] = "*";
	        boolean flag = dfs(a,word,i + 1,x + 1,y) || dfs(a,word,i + 1,x - 1,y) || dfs(a,word,i + 1,x ,y + 1) 
	        || dfs(a,word,i + 1,x,y - 1);
	        a[x][y] = temp;
	        return flag;
	    }
	} 
	    
}

