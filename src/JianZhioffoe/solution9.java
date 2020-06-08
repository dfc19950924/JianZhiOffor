package JianZhioffoe;

import java.util.ArrayList;
import java.util.Stack;

/**
用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )

示例 1：

输入：
["CQueue","appendTail","deleteHead","deleteHead"]
[[],[3],[],[]]
输出：[null,null,3,-1]


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution9 {
	class CQueue {
		Stack stk1,stk2;
		int size;
	    public CQueue() {
	    	stk1 = new Stack<Integer>();
	    	stk2 = new Stack<Integer>();
	    	size = 0;
	    }
	    
	    public void appendTail(int value) {
	    	while(!stk1.isEmpty())
	    		stk2.push(stk1.pop());
	    	stk1.push(value);
	    	size++;
	    	while(!stk2.isEmpty())
	    		stk1.push(stk2.pop());
	    }
	    
	    public int deleteHead() {
	    	if(size == 0){
	    		return -1;
	    	}
	    	int res = (int) stk1.pop();
	    	size--;
	    	return res;
	    }
	}

	/**
	 * Your CQueue object will be instantiated and called as such:
	 * CQueue obj = new CQueue();
	 * obj.appendTail(value);
	 * int param_2 = obj.deleteHead();
	 */
}
