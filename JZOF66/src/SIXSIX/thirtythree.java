package SIXSIX;
/*
 * ����һ�����������飬����������������ƴ�������ų�һ������
 * ��ӡ��ƴ�ӳ���������������С��һ����������������{3��32��321}��
 * ���ӡ���������������ųɵ���С����Ϊ321323��
 * */
public class thirtythree {
	  public String PrintMinNumber(int [] numbers) {
		  String str="";
		  for(int i=0;i<numbers.length;i++) {
			  for(int j=i+1;j<numbers.length;j++) {
				  int a=Integer.valueOf(numbers[i]+""+numbers[j]);
				  int b=Integer.valueOf(numbers[j]+""+numbers[i]);
				  if(a>b) {
					  int t=numbers[i];
					  numbers[i]=numbers[j];
					  numbers[j]=t;
				  }
			  }
		  }
		  for(int i=0;i<numbers.length;i++) {
			  str+=String.valueOf(numbers[i]);
		  }
		  return str;
		  
	  }
}
