package SIXSIX;
/*
һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
�����������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������
* */
public class Nine {
	  public static void main(String []args) {
		   
		  System.out.println(JumpFloor(6)); 
		   
	   }
		public static int JumpFloor(int target) {
	        int a=1;
	        int b=1;
	        int c=0;
	        if(target<0){ return -1 ;}
	        if(target==1){ return 1;}
	        else {
	        	  return 2 * JumpFloor(target - 1);
	        }

	        
	    }

}
