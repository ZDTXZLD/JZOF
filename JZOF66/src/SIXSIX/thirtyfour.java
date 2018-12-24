package SIXSIX;

import java.util.ArrayList;

/*
 * 含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，
 * 但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。
 * 求按从小到大的顺序的第N个丑数。
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
