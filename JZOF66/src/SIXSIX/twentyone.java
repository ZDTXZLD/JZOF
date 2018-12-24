package SIXSIX;

import java.util.Iterator;
import java.util.Stack;

/*
 * 定义栈的数据结构，
 * 请在该类型中实现一个能够得到栈中所含最小元素的min函数
 * （时间复杂度应为O（1））。
 * */
public class twentyone {
	Stack<Integer> st=new Stack<Integer>();
    public void push(int node) {
    	 st.push(node);
    }
    
    public void pop() {
    	 st.pop();
    }
    
    public int top() {
    	return st.peek();
    }
    
    public int min() {
        int min=st.peek();
        int tmp=0;
        Iterator<Integer> iterator=st.iterator();
        while(iterator.hasNext()) {
        	tmp=iterator.next();
        	if(min>tmp) {
        		min=tmp;
        	}
        }
        return min;
    }
}
