package SIXSIX;

import java.util.ArrayList;
/*
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * */
public class Threeteen {
	public static void main(String[] args) {
		int arr[]= {3,6,5,8,19,7,16,10};
		reOrderArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	 public static void reOrderArray(int [] array) {
	  ArrayList<Integer> a = new ArrayList<Integer>();
      ArrayList<Integer> b = new ArrayList<Integer>();
      for(int i=0;i<array.length;i++){
          if(array[i]%2!=0){
              a.add(array[i]);
          }else if(array[i]%2==0){
              b.add(array[i]);
          }
      }
      for(int i=0;i<b.size();i++){
          a.add(b.get(i));
      }
      for(int i=0;i<a.size();i++){
          array[i] = a.get(i);
      }
  }
	}
