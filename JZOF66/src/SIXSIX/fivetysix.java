package SIXSIX;
/*
 * ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ���
 * ���磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ����һ��ֻ����һ�ε��ַ���"g"��
 * ���Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"
 * */
public class fivetysix {
	  int count[]=new int[256];
	    int index=1;
	    public void Insert(char ch)
	    {
	        if(count[ch]==0){
	          count[ch]=index++; 
	        }
	        else{
	            count[ch]=-1;
	        }
	    }
	    public char FirstAppearingOnce()
	    {
	        int temp=Integer.MAX_VALUE;
	        char ch='#';
	        for(int i=0;i<256;i++){
	            if(count[i]!=0&&count[i]!=-1&&count[i]<temp){
	                temp=count[i];
	                ch=(char)i;
	            }
	        }
	        return ch;
	    }
	}