package List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 假设有这样一个计算器，该计算器只有两个按钮，
 * 按下第一个按钮能使显示数值减少1，按下第二个按钮能使显示数值乘以2
 * ，当前显示数值为N，那么至少要按多少次按钮才能使显示数值变成M？
 * */
public class BKone {
	public static void main(String[] args) throws Exception  {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);	
	String str=br.readLine();
	String []str2=str.split(" ");
	int [] a=new int[2];
	for(int i=0;i<str2.length;i++) {
		a[i]=Integer.parseInt(str2[i]);
	}
	System.out.println(getCount(a[0],a[1]));
	
	}
	public static  int getCount(int n,int m ) throws Exception  {
	 int i=0;
	 if(n>=m) {
		 return i+n-m;
	 }else if(2*n>=m) {
		 if(m%2==0) {
			return i+n-m/2+1;
		 }else {
			 return i+n-(m+1)/2+2;
		 }
	 }
	 if(2*n<m) {
		 return getCount(2*n,m)+i;
	 }
	 return i;
	 
	}
}
