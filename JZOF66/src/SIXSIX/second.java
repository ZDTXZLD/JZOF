package SIXSIX;
/*  �滻�ո�
 * 
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.
 * �򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 *   caseͨ����Ϊ12.5  ̫��
 * */

/*
 * 1.���ҳ������ж��ٸ��ո�����
 * 2.�����µĳ���
 * 3.ѭ������,���ո��滻��%20
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
