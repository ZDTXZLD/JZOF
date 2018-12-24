package SIXSIX;
/*  替换空格
 * 
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 *   case通过率为12.5  太低
 * */

/*
 * 1.先找出其中有多少个空格数量
 * 2.定义新的长度
 * 3.循环遍历,将空格替换成%20
 * */
public class second {
public static void main(String[] args) {
	
	StringBuffer buffer = new StringBuffer("We Are Happy");
	System.out.println(replaceSpace(buffer));
}
public static String replaceSpace(StringBuffer str) {
	int spacenum=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' ')
			spacenum++;
	}
	int indexold=str.length()-1;
	int newlength=str.length()+spacenum*2;
	int indexnew=newlength-1;
	str.setLength(newlength);
	for(;indexold>0 && indexold<newlength;indexold--){
		if(str.charAt(indexold)==' ') {
			str.setCharAt(indexnew--, '0');
			str.setCharAt(indexnew--, '2');
			str.setCharAt(indexnew--, '%');
		}else {
			str.setCharAt(indexnew--, str.charAt(indexold));
		}
	}
	return str.toString();		
}
}
