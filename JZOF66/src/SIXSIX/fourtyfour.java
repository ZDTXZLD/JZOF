package SIXSIX;
/*
 * �����������һ����λָ�����ѭ�����ƣ�ROL����
 * �����и��򵥵����񣬾������ַ���ģ�����ָ�����������
 * ����һ���������ַ�����S���������ѭ������Kλ������������
 * ���磬�ַ�����S=��abcXYZdef��,
 * Ҫ�����ѭ������3λ��Ľ��������XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
 * */
public class fourtyfour {
    public String LeftRotateString(String str,int n) {
    if(str.length()==0||n<0) {
    	return "";
    }
    StringBuffer sb = new StringBuffer(str.substring(0, n));
    StringBuffer sb1 = new StringBuffer(str.substring(n, str.length()));
    sb1.append(sb);
    return  sb1.toString();
    }
}
