package JianZhioffoe;
/**
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

 

示例:

现有矩阵 matrix 如下：

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
给定 target = 5，返回 true。

给定 target = 20，返回 false。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author 小济公
 *
 */
public class solution2 {
	public static void main(String[] args) {
		int[][] a = {
		             {1,   4,  7, 11, 15},
		             {2,   5,  8, 12, 19},
		             {3,   6,  9, 16, 22},
		             {10, 13, 14, 17, 24},
		             {18, 21, 23, 26, 30}
		             };
		System.out.println(findNumberIn2DArray(a,5));
		System.out.println(findNumberIn2DArray(a,20));

	}
   public  static boolean findNumberIn2DArray(int[][] matrix, int target) {
	   if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
		   return false;
	   }
	   //行数
	   int rows = matrix.length;
	   //列数
	   int cols = matrix[0].length;
	   int r =0,c =cols -1;//从右上角开始遍历数组元素
	   while(r<rows & c>=0){
		   if(matrix[r][c] == target){
			   return true;
		   }else if(matrix[r][c] > target){
			   c--;
		   }else{
			   r++;
		   }
	   }
	   return false;
    }
}
