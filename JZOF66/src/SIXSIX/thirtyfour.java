package SIXSIX;

import java.util.ArrayList;

/*
 * ��������2��3��5��������������Ugly Number��������6��8���ǳ�����
 * ��14���ǣ���Ϊ������������7�� ϰ�������ǰ�1�����ǵ�һ��������
 * �󰴴�С�����˳��ĵ�N��������
 * */
public class thirtyfour {
	 public int GetUglyNumber_Solution(int index) {
	    if(index==0) return 0;
	    ArrayList<Integer> list = new  ArrayList<Integer>();
	    int count=1;
	    list.add(1);
	    int min=0;
	    int m1=0,m3=0,m5=0;
	    while(count<index) {
	    	min=min(list.get(m1)*2,list.get(m3)*3,list.get(m5)*5);
	    	count++;
	    	list.add(min);
	        if(min==list.get(m1)*2)
	           m1++;
	        if(min==list.get(m3)*3)
	        	m3++;
	        if(min==list.get(m5)*5)
	        	m5++;
	    }
	    return list.get(index-1);	 
	 }

	private int min(int a, int b, int c) {
		int temp=a>b?b:a;
		return temp=temp>c?c:temp;
	}
}
