package SIXSIX;
/*
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 * */
public class eleven {
	public static void main(String[]args) {
		System.out.println(NumberOf1(32100));
 	}
	public static int NumberOf1(int n) {
		int t=0;
		char[] ch=Integer.toBinaryString(n).toCharArray();
		for(int i=0;i<ch.length;i++){
            if(ch[i]=='1'){
                t++;
            }
        }
		return t;	        
	}
}
