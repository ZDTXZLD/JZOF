package SIXSIX;
/*
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，
 * 但是string不符合数字要求时返回0)，
 * 要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 * */
//输入一个字符串,包括数字字母符号,可以为空
//如果是合法的数值表达则返回该数字，否则返回0
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
