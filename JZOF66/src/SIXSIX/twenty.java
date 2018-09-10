package SIXSIX;

import java.util.ArrayList;

/*
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * 
 * */

/*
解题思路：顺时针打印就是按圈数循环打印，一圈包含两行或者两列，
在打印的时候会出现某一圈中只包含一行，
要判断从左向右打印和从右向左打印的时候是否会出现重复打印，
同样只包含一列时，要判断从上向下打印和从下向上打印的时候是否会出现重复打印的情况
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
	           //从左向右
	           for(int i=left;i<=right;i++){
	               list.add(matrix[top][i]);
	           }
	           //从上到下（从下一行开始向下走）
	           for(int j=top+1;j<=bottom;j++){
	               list.add(matrix[j][right]);
	           }
	           //从右到左
	           if(top!=bottom){
	               for(int k=right-1;k>=left;k--){
	                   list.add(matrix[bottom][k]);
	               }
	           }
	           //从下到上
	           if(left!=right){
	               for(int l=bottom-1;l>top;l--){
	                   list.add(matrix[l][left]);
	               }
	           }
	             
	           //下一个正方形矩阵
	           top++;left++;right--;bottom--;
	             
	       }
	        return list; 
	    }
}
