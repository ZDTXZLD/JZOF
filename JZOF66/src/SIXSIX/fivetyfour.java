package SIXSIX;
/*
 * ��ʵ��һ����������ƥ�����'.'��'*'��������ʽ��
 * ģʽ�е��ַ�'.'��ʾ����һ���ַ�����'*'��ʾ��ǰ����ַ����Գ�������Σ�����0�Σ���
 *  �ڱ����У�ƥ����ָ�ַ����������ַ�ƥ������ģʽ
 * �����磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣬������"aa.a"��"ab*a"����ƥ��
 * */
public class fivetyfour {
	public boolean match(char[] str, char[] pattern)
    {if (str == null || pattern == null) {
        return false;
    }
    int strIndex = 0;
    int patternIndex = 0;
    return matchCore(str, strIndex, pattern, patternIndex);   
    }
	private boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
		//str��β,pattern��β,ƥ��ɹ�
		if (strIndex == str.length && patternIndex == pattern.length) {
	        return true;
	    }
		  //strδ��β��pattern��β��ƥ��ʧ��
	    if (strIndex != str.length && patternIndex == pattern.length) {
	        return false;
	    }
	    //str��β��patternδ��β(��һ��ƥ��ʧ�ܣ���Ϊa*����ƥ��0���ַ�)
	    if (strIndex == str.length && patternIndex != pattern.length) {
	        //ֻ��patternʣ�µĲ�������a*b*c*����ʽ����ƥ��ɹ�
	        if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
	            return matchCore(str, strIndex, pattern, patternIndex + 2);
	        }
	        return false;
	    }
	    //strδ��β��patternδ��β
	    if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
	        if (pattern[patternIndex] == str[strIndex] || (pattern[patternIndex] == '.' && strIndex != str.length)) {
	            return matchCore(str, strIndex, pattern, patternIndex + 2)//*ƥ��0��������
	                    || matchCore(str, strIndex + 1, pattern, patternIndex + 2)//*ƥ��1��������
	                    || matchCore(str, strIndex + 1, pattern, patternIndex);//*ƥ��1������ƥ��str�е���һ��
	        } else {
	            //ֱ������*��*ƥ�䵽0����
	            return matchCore(str, strIndex, pattern, patternIndex + 2);
	        }
	    }
	    if (pattern[patternIndex] == str[strIndex] || (pattern[patternIndex] == '.' && strIndex != str.length)) {
	        return matchCore(str, strIndex + 1, pattern, patternIndex + 1);
	    }
		return false;
	}
}
