package SIXSIX;
/*
 * ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��
 * дЩ�����ڱ����ϡ�ͬ��Cat��Fishд�������ĸ���Ȥ��
 * ��һ������Fish������������ȴ������������˼�����磬��student. a am I����
 * ��������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ�
 * ��ȷ�ľ���Ӧ���ǡ�I am a student.����Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
 * */
public class fourtyfive {
public String ReverseSentence(String str) {
        if(str==null) {return null;}
   if(str.trim().equals("")) {
	   return str;
   }    
   String string=str;
   String [] strings=string.split(" ");
   StringBuffer buffer = new StringBuffer();
   for(int i=strings.length-1;i>=0;i--) {
	   if(i==0) {
		   buffer.append(strings[i]);
	   }else {
		   buffer.append(strings[i]);
		   buffer.append(" ");
	   }
   }
   String string2=buffer.toString();
   return string2;
}

}
