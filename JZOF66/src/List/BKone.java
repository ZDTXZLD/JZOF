package List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ����������һ�����������ü�����ֻ��������ť��
 * ���µ�һ����ť��ʹ��ʾ��ֵ����1�����µڶ�����ť��ʹ��ʾ��ֵ����2
 * ����ǰ��ʾ��ֵΪN����ô����Ҫ�����ٴΰ�ť����ʹ��ʾ��ֵ���M��
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
