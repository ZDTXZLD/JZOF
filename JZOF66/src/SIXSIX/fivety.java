package SIXSIX;
/*
 * ��һ���ַ���ת����һ������(ʵ��Integer.valueOf(string)�Ĺ��ܣ�
 * ����string����������Ҫ��ʱ����0)��
 * Ҫ����ʹ���ַ���ת�������Ŀ⺯���� ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0
 * */
//����һ���ַ���,����������ĸ����,����Ϊ��
//����ǺϷ�����ֵ����򷵻ظ����֣����򷵻�0
public class fivety {
	   public int StrToInt(String str) {
	        if(str==null||str.length()==0) {
	        	return 0;
	        }
	   int fuhao=0;
	   char[] array = str.toCharArray();
	   if(array[0]=='-') {
		   fuhao=1;
	   }
	   int sum=0;
	   for(int i=fuhao;i<array.length;i++) {
		   if(array[i]=='+') {
			   continue;
		   }
		   if(array[i]<48||array[i]>57) {
			   return 0;
		   }
		   sum=sum*10+array[i]-48;
	   }
	   return fuhao==0?sum:sum*(-1);
	   }
}
