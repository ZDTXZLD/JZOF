package SIXSIX;

import java.util.ArrayList;
/*
 * ����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�
 * ����С��4��������1,2,3,4,��
 * */

/*
 * ���ڶ������㷨,��������,ʱ�临�Ӷ�O(nlogk)
 * */
public class thirty {
	 public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		   ArrayList<Integer> al = new ArrayList<Integer>();
	        if (k > input.length) {
	            return al;
	        }
	        for (int i = 0; i < k; i++) {
	            for (int j = 0; j < input.length - i - 1; j++) {
	                if (input[j] < input[j + 1]) {
	                    int temp = input[j];
	                    input[j] = input[j + 1];
	                    input[j + 1] = temp;
	                }
	            }
	            al.add(input[input.length - i - 1]);
	        }
	        return al; 
	    }
	}
