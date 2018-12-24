package List;

import java.util.Scanner;

/*
 * 输入两个数字  N人算法 M人编程
 * 一个队至少一个算法一个编程
 * */
public class MTCKone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
	    int sum=N+M;
	    int count=0;
	    while(sum>=3&&N>0&&M>0) {
	    	if(N>M) {
	    		N--;
	    		N--;
	    		M--;
	    		sum=sum-3;
	    		count++;
	    	}else {
	    		M--;
                M--;
	    		N--;
                count++;
                sum=sum-3;
	    	} 	
	    }
	    System.out.println(count);
	}
}
