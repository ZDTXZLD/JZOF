package SIXSIX;
/*
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ����������Yes,�������No���������������������������ֶ�������ͬ��
 * */
public class twentyFour {
 	
public boolean VerifySquenceOfBST(int [] sequence) {
       if(sequence.length==0) 
    	   return false;
       if(sequence.length==1) 
    	   return true;
       return ju(sequence,0,sequence.length-1);
    }
    public boolean ju(int[]a,int star,int root) {
	   if(star>=root)
		   return true;
	int i=star;
	while(a[i]<a[root]) {
		++i;
	}
	for(int j=i;j<root;j++) {
		if(a[j]<a[root]) {
			return false;
		}
	}
	   return ju(a,star,i-1)&&ju(a,i,root-1);
	   
    }


}
