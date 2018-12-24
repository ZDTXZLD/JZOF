package SIXSIX;

import java.util.*;


/*
 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
 * ���������ַ���abc,
 * ���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
 *
 * ��������
 * ����һ���ַ���,���Ȳ�����9(�������ַ��ظ�),�ַ�ֻ������Сд��ĸ��
 * */
public class twentyeight {
	   public ArrayList<String> Permutation(String str) {
	   ArrayList<String> result = new ArrayList<String>();
	   if(str==null||str.length()==0) return result;
	   char[] chars=str.toCharArray();
	   TreeSet<String> temp=new TreeSet<>();
	   Permutation(chars,0,temp);
	   result.addAll(temp);
	   return result;  
	   }

	private void Permutation(char[] chars, int begin, TreeSet<String> result) {
	if(chars==null||chars.length==0||begin<0||begin>chars.length-1) return ;
	if(begin==chars.length-1) {
		result.add(String.valueOf(chars));
	}else {
		for(int i=begin;i<chars.length-1;i++) {
			swap(chars,begin,i);
			Permutation(chars,begin+1,result);
			swap(chars,begin,i);
		}
		
	}
		
	}

	private void swap(char[] chars, int begin, int i) {
	   char t=chars[begin];
	   chars[begin]=chars[i];
	   chars[i]=t;
		}  
}
