package SIXSIX;

/*
 * ��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,
 * ����������λ��, ���û���򷵻� -1����Ҫ���ִ�Сд��.
 * */
public class thirtyfive {
	 public int FirstNotRepeatingChar(String str) {
		   char[] chars=new char[256];
	        for(int i=0;i<str.length();i++){
	            chars[(int)str.charAt(i)]++;
	        }
	        for(int i=0;i<str.length();i++){
	            if((int)chars[str.charAt(i)]==1){
	                return (char)i;
	            }
	        }
	        return -1;
	 }
}
