package JianZhioffoe;

import java.util.ArrayList;
import java.util.Stack;

/**
输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。

示例1：

输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution25 {
//	public static void main(String[] args) {
//		int[] nums = {1,2,3,4};
//		int[] i = new Solution().exchange(nums);
//		for (int j : i) {
//			System.out.println(j);
//		}
//	}
	
//	  Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	  class Solution {
		  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
			  	ListNode dum = new ListNode(0);
			  	ListNode cur = dum;
			  	while(l1 != null && l2 != null){
			  		if(l1.val >= l2.val){
			  			cur.next = l2;
			  			l2 = l2.next;
			  		}else {
			  			cur.next = l1;
			  			l1 = l1.next;
			  		}
			  		cur = cur.next;
			  	}
			  	if(l2 == null) cur.next = l1;
			  	if(l1 == null) cur.next = l2;			  	
			  	return dum.next;
		    }

	   
	}
}

	    	
	    


