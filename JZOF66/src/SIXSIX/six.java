package SIXSIX;
/*
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ
 * �����ǳ�֮Ϊ�������ת�� ����һ���Ǽ�����������һ����ת��
 * �����ת�������СԪ�ء� ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת��
 * ���������СֵΪ1�� NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0
 * */
public class six {
	  public static void main(String[]args){
	        int []array={3,4,5,1,2};
	        minNumberInRotateArray(array);
	    }
	    public static int minNumberInRotateArray(int [] array) {
	       if(array.length==0){  return 0 ;}
	        int minnum=array[0];;
	        for(int i=0;i<array.length;i++){
	          if(minnum>array[i]){
	              minnum=array[i];
	          }
	      }
	        return minnum;
	    }
}
