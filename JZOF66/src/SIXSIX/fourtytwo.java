package SIXSIX;

import java.util.ArrayList;

/*
 * ������к�ΪS�������������С������ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��
 * */
/*
 * С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100��
 * ���������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
 * û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22��
 * ���ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck!
 * */
/*
nΪ����ʱ�������м�������������е�ƽ��ֵ����������Ϊ��(n & 1) == 1 && sum % n == 0��
nΪż��ʱ�������м���������ƽ��ֵ�����е�ƽ��ֵ
�������ƽ��ֵ��С������Ϊ0.5����������Ϊ��(sum % n) * 2 == n.

 * ���ݵȲ����е���͹�ʽ��S = (1 + n) * n / 2���õ�.
 * */

public class fourtytwo {
	 public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
	       ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		   for(int n=(int)Math.sqrt(2*sum);n>=2;n--) {
			   if((n&1)==1&&sum%n==0||(sum % n) * 2 == n) {
			       ArrayList<Integer> list1 = new ArrayList<>();
	                for (int j = 0, k = (sum / n) - (n - 1) / 2; j < n; j++, k++) {
	                    list1.add(k);
	                }
	                list.add(list1);
	            }
	        }
	        return list;
		 
	    }
	
}
