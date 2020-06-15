package JianZhioffoe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**

请定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。

若队列为空，pop_front 和 max_value 需要返回 -1

示例 1：

输入: 
["MaxQueue","push_back","push_back","max_value","pop_front","max_value"]
[[],[1],[2],[],[],[]]
输出: [null,null,null,2,1,2]
示例 2：

输入: 
["MaxQueue","pop_front","max_value"]
[[],[],[]]
输出: [null,-1,-1]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution59_2 {
	public static void main(String[] args) {
		}
	}
	class MaxQueue {
		Queue<Integer> Q1;
		Deque<Integer> Q2;
	    public MaxQueue() {
	    	
	    	//队列：插入和删除
	    	Q1 = new LinkedList<Integer>();
	    	//双端队列：获取最大值
	    	Q2 = new LinkedList<>();
	    }
	    
	    public int max_value() {
	    	return Q2.size() > 0?Q2.peek():-1;
	    }
	    
	    public void push_back(int value) {
	    	//value入队
	    	Q1.offer(value);
	    	while(Q2.size() > 0 && Q2.peekLast() < value){
	    		//将deq队尾小于value的元素删掉
	    		Q2.pollLast();
	    	}
	    	//将value放在deq队尾
	    	Q2.offerLast(value);
	    }
	    
	    public int pop_front() {
	    	//获得队首元素
	    	int tmp = Q1.size()>0?Q1.poll():-1;
	    	if(Q2.size() > 0 && Q2.peek().equals(tmp)){
	    		//如果出队的元素是当前最大值，将deq的队首出队
	    		Q2.poll();
	    	}
	    	return tmp;
	    }
	}

	/**
	 * Your MaxQueue object will be instantiated and called as such:
	 * MaxQueue obj = new MaxQueue();
	 * int param_1 = obj.max_value();
	 * obj.push_back(value);
	 * int param_3 = obj.pop_front();
	 */
