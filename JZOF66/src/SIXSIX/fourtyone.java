package SIXSIX;

import java.util.HashMap;

/*
 * 一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。
 * 请写程序找出这两个只出现一次的数字。
 * */

//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class fourtyone {
	 public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	        if(array.length<2)return;
	          HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	            for(int i=0;i<array.length;i++){
	                Integer key = array[i];
	                Integer value = map.get(key);
	                if(value == null){
	                    map.put(key, 1);
	                }
	                else {
	                    map.put(key, value+1);
	                }
	            }
	             
	            int index=0;
	           for(int i=0;i<array.length;i++){
	               if(map.get(array[i]) == 1 && index == 0){
	                   num1[index] = array[i];
	                   index ++;
	               }
	               else if(map.get(array[i]) == 1 && index == 1){
	                   num2[index-1] = array[i];
	                   break;
	               }
	                   
	           }
	           
	           
	    }
	}
