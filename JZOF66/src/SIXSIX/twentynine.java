package SIXSIX;

import java.util.HashMap;
import java.util.Set;
/*
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
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
