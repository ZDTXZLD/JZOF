package SIXSIX;

import java.util.ArrayList;

/*
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
 * ���磬�����������4 X 4���� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * 
 * */

/*
����˼·��˳ʱ���ӡ���ǰ�Ȧ��ѭ����ӡ��һȦ�������л������У�
�ڴ�ӡ��ʱ������ĳһȦ��ֻ����һ�У�
Ҫ�жϴ������Ҵ�ӡ�ʹ��������ӡ��ʱ���Ƿ������ظ���ӡ��
ͬ��ֻ����һ��ʱ��Ҫ�жϴ������´�ӡ�ʹ������ϴ�ӡ��ʱ���Ƿ������ظ���ӡ�����
 * */
public class twenty {
	 public ArrayList<Integer> printMatrix(int [][] matrix) {
		   if(matrix==null)
	           return null;
	       ArrayList<Integer> list=new ArrayList<Integer> ();
	       int row=matrix.length;
	       int col=matrix[0].length;
	       int left=0,top=0,right=col-1,bottom=row-1;
	       while(left<=right&&top<=bottom){
	           //��������
	           for(int i=left;i<=right;i++){
	               list.add(matrix[top][i]);
	           }
	           //���ϵ��£�����һ�п�ʼ�����ߣ�
	           for(int j=top+1;j<=bottom;j++){
	               list.add(matrix[j][right]);
	           }
	           //���ҵ���
	           if(top!=bottom){
	               for(int k=right-1;k>=left;k--){
	                   list.add(matrix[bottom][k]);
	               }
	           }
	           //���µ���
	           if(left!=right){
	               for(int l=bottom-1;l>top;l--){
	                   list.add(matrix[l][left]);
	               }
	           }
	             
	           //��һ�������ξ���
	           top++;left++;right--;bottom--;
	             
	       }
	        return list; 
	    }
}
