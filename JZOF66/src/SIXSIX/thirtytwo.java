package SIXSIX;
/*
 * 1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����
 * Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,
 * ���Ƕ��ں�����������û���ˡ�ACMerϣ�����ǰ����,
 * ������������ձ黯,���Ժܿ���������Ǹ�����������1���ֵĴ�������1 �� n ��1���ֵĴ�������
 * */
public class thirtytwo {
	 public int NumberOf1Between1AndN_Solution(int n) {
			   if(n <= 0)
			             return 0;
			         int count = 0;
			         for(long i = 1; i <= n; i *= 10){
			             long diviver = i * 10;
			             count += (n / diviver) * i + Math.min(Math.max(n % diviver - i + 1, 0), i);
			         }
			         return count;
		 
		 
	    }
	
}
