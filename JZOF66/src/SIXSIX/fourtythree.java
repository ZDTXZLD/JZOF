package SIXSIX;
import java.util.ArrayList;
/*
 * ����һ����������������һ������S���������в�����������
 * ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С��
 * 
 * */
//��Ӧÿ�����԰����������������С���������
public class fourtythree {
	 public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
	     ArrayList<Integer> list = new ArrayList<Integer>();
	     if(array==null||array.length<2) {
	    	 return list;
	     }       
	     int i=0,j=array.length-1;
	     while(i<j) {
	    	   if(array[i]+array[j]==sum){
	               list.add(array[i]);
	               list.add(array[j]);
	                   return list;
	              }else if(array[i]+array[j]>sum){
	                   j--;
	               }else{
	                   i++;
	               }   
	           }
	     return list; 
	 }
}
