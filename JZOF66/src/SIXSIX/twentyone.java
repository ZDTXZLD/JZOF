package SIXSIX;

import java.util.Iterator;
import java.util.Stack;

/*
 * ����ջ�����ݽṹ��
 * ���ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min����
 * ��ʱ�临�Ӷ�ӦΪO��1������
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
