package SIXSIX;
/*
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
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
