package JianZhioffoe;
/**
 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

 

示例 1：

输入：s = "We are happy."
输出："We%20are%20happy."

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

解题思路：
① 在字符串尾部填充任意字符，使得字符串的长度等于替换之后的长度。因为一个空格要替换成三个字符（%20），所以当遍历到一个空格时，需要在尾部填充两个任意字符。

② 令 P1 指向字符串原来的末尾位置，P2 指向字符串现在的末尾位置。P1 和 P2 从后向前遍历，当 P1 遍历到一个空格时，就需要令 P2 指向的位置依次填充 02%（注意是逆序的），否则就填充上 P1 指向字符的值。从后向前遍是为了在改变 P2 所指向的内容时，不会影响到 P1 遍历原来字符串的内容。

③ 当 P2 遇到 P1 时（P2 <= P1），或者遍历结束（P1 < 0），退出。
 */
public class solution3 {
	public static void main(String[] args) {
		String s = "    ";
		System.out.println(replaceSpace(s));
	}
	 public static String replaceSpace(String s) {
		 StringBuffer str = new StringBuffer(s);
		 int p1 = str.length()-1;
		 for(int i = 0;i <= p1; i++){
			if(str.charAt(i) == ' '){
				str.append("  ");
			} 	
		 }
		 int p2 = str.length()-1;
		 while(p1 >= 0 && p2>p1 ){
			 char c = s.charAt(p1--);
			 if(c == ' '){
				 str.setCharAt(p2--,'0');
				 str.setCharAt(p2--,'2');
				 str.setCharAt(p2--,'%');
			 }else{
				 str.setCharAt(p2--,c);				 
			 }
		 }
		return str.toString();
	 }
}
