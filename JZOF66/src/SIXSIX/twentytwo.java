package SIXSIX;

import java.util.Stack;

/*
 * ���������������У���һ�����б�ʾջ��ѹ��˳��
 * ���жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ�
 * ��������1,2,3,4,5��ĳջ��ѹ��˳��
 * ����4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
 * ��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С�
 * ��ע�⣺���������еĳ�������ȵģ�
 * 
 * */
public class twentytwo {
	 public boolean IsPopOrder(int [] pushA,int [] popA) {
	      if(pushA.length==0||popA.length==0) {
	    	  return false;
	      }
	      Stack<Integer> s=new Stack<Integer>();
	      //���ڱ�ʶ�������е�λ��
	      int popIndex=0;
	      for(int i=0;i<pushA.length;i++) {
	    	  s.push(pushA[i]);
	    	  //���ջ��Ϊ��,��ջ��Ԫ�ص��ڵ���Ԫ��
	    	  while(!s.empty()&&s.peek()==popA[popIndex]) {
	    		//��ջ
	    		  s.pop();
	    		  //�����������һλ
	    		  popIndex++;
	    	  }
	      }
	      return s.empty();
	    }
	
}


