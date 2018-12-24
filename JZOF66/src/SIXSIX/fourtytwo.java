package SIXSIX;

import java.util.ArrayList;

/*
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 * */
/*
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 * */
/*
n为奇数时，序列中间的数正好是序列的平均值，所以条件为：(n & 1) == 1 && sum % n == 0；
n为偶数时，序列中间两个数的平均值是序列的平均值
，而这个平均值的小数部分为0.5，所以条件为：(sum % n) * 2 == n.

 * 根据等差数列的求和公式：S = (1 + n) * n / 2，得到.
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
