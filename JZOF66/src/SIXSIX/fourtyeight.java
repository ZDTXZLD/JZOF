package SIXSIX;
/*
 * ��1+2+3+...+n��Ҫ����ʹ�ó˳�����
 * for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����
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
