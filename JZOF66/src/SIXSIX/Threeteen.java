package SIXSIX;

import java.util.ArrayList;
/*
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�
 * ����֤������������ż����ż��֮������λ�ò��䡣
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
