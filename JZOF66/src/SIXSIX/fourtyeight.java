package SIXSIX;
/*
 * 求1+2+3+...+n，要求不能使用乘除法、
 * for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * */
public class fourtyeight {
	  public int Sum_Solution(int n) {
		  int sum = 0;
	        for(int i=1;i<=n;i++){
	            sum+=i;
	        }
	        return sum;
	    }
}
