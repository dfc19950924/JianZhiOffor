package JianZhioffoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;

/**

在一个 m*n 的棋盘的每一格都放有一个礼物，每个
礼物都有一定的价值（价值大于 0）。你可
以从棋盘的左上角开始拿格子里的礼
物，并每次向右或者向下移动一格、直到
到达棋盘的右下角。给定一个棋盘及其上面的礼
物的价值，请计算你最多能拿到多少价值的礼物？

 

示例 1:

输入: 
[
  [1,3,1],
  [1,5,1],
  [4,2,1]
]
输出: 12
解释: 路径 1→3→5→2→1 可以拿到最多价值的礼物

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/li-wu-de-zui-da-jie-zhi-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution47 {
	public static void main(String[] args) {
		int[][] arr = {{1,2,5},{3,2,1}};
		System.out.println("hello world");
		System.out.println(new Solution().maxValue(arr));
	}
	static class Solution {
	/**	public int maxValue(int[][] grid) {
			if(grid.length == 1 && grid[0].length == 1)return grid[0][0];
			int i = 0, j = 0,sum = grid[0][0];
			while((!(i == grid.length - 1 && j == grid[0].length - 1))&&(i < grid.length - 1&&j < grid[0].length - 1)){
				if(grid[i][j+1] > grid[i+1][j]){
					sum += grid[i][j+1];
					j++;
				}else{
					sum += grid[i+1][j];
					i++;
				}
			}
			return sum+grid[grid.length - 1][grid[0].length - 1];
		}
	**/
		public int maxValue(int[][] grid){
			int m = grid.length, n = grid[0].length;
			for(int i = 0; i <= m -1; i++){
				for(int j = 0; j <= n - 1; j++){
					if(i == 0 && j == 0 )continue;
					else if(i == 0)grid[i][j] += grid[i][j-1];
					else if(j == 0)grid[i][j] += grid[i-1][j];
					else grid[i][j] += Math.max(grid[i][j-1], grid[i-1][j]);
				}
			}
			return grid[m - 1][n - 1];
		}
	}
}
