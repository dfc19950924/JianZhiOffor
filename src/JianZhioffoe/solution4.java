package JianZhioffoe;

import java.util.ArrayList;

/**
 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
示例 1：
输入：head = [1,3,2]
输出：[2,3,1]
 */
public class solution4 {
	public int[] reversePrint(ListNode head) {
		ArrayList<Integer> al = new ArrayList<>();
		while(head.next != null){
			al.add(head.val);
			head = head.next;
		}
		int[] arr = new int[al.size()];
		for(int i = 0;i<al.size();i++){
			arr[i] = al.get(i);
		}
		for(int i=0,j=arr.length;i<=j;i++,j--){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		
		return arr;
		
    }
	class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 
	}
}
