package List;

import java.util.Scanner;

/*
 * 现有n个物品，每个物品有三个参数 ai , bi , ci ，
 * 定义i物品不合格品的依据是 : 若存在物品 j , 且aj>ai , bj>bi , cj>ci，则称i物品为不合格品。

现给出n个物品的a,b,c参数，请你求出不合格品的数量。
现有n个物品，每个物品有三个参数 ai , bi , ci ，定义i物品不合格品的依据是 : 若存在物品 j , 且aj>ai , bj>bi , cj>ci，则称i物品为不合格品。

现给出n个物品的a,b,c参数，请你求出不合格品的数量。
输出包含一个整数，表示不合格品的数量。
3
1 4 2
4 3 2
2 5 3
 * */
public class JDtwo {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int [][]a =new int [n][3];
	        for(int i=0;i<n;i++){
	        	a[i][0]=sc.nextInt();
	        	a[i][1]=sc.nextInt();
	        	a[i][2]=sc.nextInt();
	        }
	        int ai=a[n][0];
	        int bi=a[n][1];
	        int ci=a[n][2];
	        int count=0;
	        for(int i=0;i<n;i++){
	        	for(int j=0;j<n;j++){
	        		if(a[i][0]<ai&&a[i][1]<bi&&a[i][2]<ci){
	        			count++;
	        			break;
	        		}
	        	}
	        }
	        System.out.println(count);
	    }
}
