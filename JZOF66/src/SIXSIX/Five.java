package SIXSIX;

import java.util.Stack;
/*   ������ջʵ�ֶ���
 * 
 * 
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 * 
 * */

/*
 * <����>�� 
��ӣ���Ԫ�ؽ�ջA 
���ӣ��ж�ջB�Ƿ�Ϊ�գ����Ϊ�գ���ջA������Ԫ��pop����push��ջB��ջB��ջ�� 
  �����Ϊ�գ�ջBֱ�ӳ�ջ�� 
����������ʵ��һ��ջ�Ĺ���?Ҫ������㷨��˼·! 
<����>�� 
��ջ����Ԫ�ؽ�����A 
��ջ���ж϶���A��Ԫ�صĸ����Ƿ�Ϊ1���������1��������У����򽫶���A�е�Ԫ��    �Դ˳����в��������B��ֱ������A�е�Ԫ������һ����Ȼ�����A�����У��ٰ�    ����B�е�Ԫ�س������Դ˷������A�С� 

 * */
public class Five {
	   Stack<Integer> stack1 = new Stack<Integer>();
	    Stack<Integer> stack2 = new Stack<Integer>();
	    
	    public void push(int node) {
	        stack1.push(node);
	    }
	    
	    public int pop() {
	       if(stack2.isEmpty()){
	           while(!stack1.isEmpty()){
	               int node=stack1.pop();
	                  stack2.add(node);
	           }
	       }     
	        return stack2.pop();

	    }
	}
