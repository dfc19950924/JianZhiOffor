package JianZhioffoe;
/**
 * 
 * @author 小济公
 *
 */
public class solution1 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 11, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		System.out.println(findRepeatNumber(a));
		
	}
	public static int findRepeatNumber(int[] nums) {
		for (int i = 0;i<nums.length;i++){
			for (int j = i+1;j<nums.length;j++){
				if(nums[i] == nums[j]){
					return nums[i];
				}
			}
		}
		return -1;
    }
}
