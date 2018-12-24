package SIXSIX;

import java.util.HashMap;
import java.util.Set;
/*
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * */
public class twentynine {
	 public int MoreThanHalfNum_Solution(int [] array) {
     if(array==null||array.length<=0) return 0;
      int num=1;
      int result=array[0];
     for(int i=1;i<array.length;i++) {
    	 if(num==0) {
    		result=array[i];
    		num=1;
    	 }else {
    	if(array[i]==result) {
    		num++;
    	}	 else {
    		num--;
    	}
    	 }
    	 }
     num=0;
     for(int i=0;i<array.length;i++) {
    	 if(result==array[i]) {
    		 num++;
    	 }
     }
     if(num*2<=array.length) {
    	 result=0;
     }
     return result;
	 
	 }
}
