package List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import javax.management.Query;

/*
 * �õ�һ��������  ��֪��������[l,r]����������������
 * 1.r-1+1=k;
 * 2.��a|,a|+1...ar�� ����һ�������ٴ���t��  ������������������
 * */
public class MTtwo {
	public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int k = sc.nextInt();
	    int t = sc.nextInt();
	    int []arr=new int[n];
	    for(int i=0;i<n;i++) {
	    	int a = sc.nextInt();
	    	arr[i]=a;
	    }
	    int count = getMaxWindow(arr,k,t);
	    System.out.println(count);
	}
	public static int getMaxWindow(int [] arr,int k,int t) {
		if(arr==null||t<1||arr.length<k) {
			return 0;
		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		int count=0;
		String string = arr.toString();
	     for(int i=0;i<=string.length()-k;i++) {
	    	   HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	    	     String a = string.substring(i, i+k);
	    	     char[] array = a.toCharArray();
	         for(int j=0;j<array.length;j++) {
	        	 if(map.containsKey(array[j])) {
	        		 int value= map.get(array[j]);
	        		 map.put((int) array[j],value++); //j++������
	        	 }else {
	        		 map.put((int) array[j], 1);
	        	 }
	         }
	         for(Integer key:map.keySet()) {
	        	 System.out.print(key+" ");
	         }
	         System.out.println();
	         Iterator<Integer> it = map.keySet().iterator(); 
	         while(it.hasNext()){
	 			Integer key = it.next();
	 			if(map.get(key)>=t){
	 				count++;
	 			}
	 		}
	       
	    }
		return  count; 
	}	
}