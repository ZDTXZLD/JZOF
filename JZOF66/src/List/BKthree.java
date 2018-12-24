package List;

import java.util.LinkedHashMap;
import java.util.Scanner;

import java.util.HashMap;
import java.util.Scanner;
/*
 * 家族关系 
 * */
public class BKthree{
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i =0;i<n;i++) {
			map.put(in.nextInt(), in.nextInt());
		}
		int m = in.nextInt();
		for(int i=0;i<m;i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			boolean a = find(x,y,map);
			boolean b = find(y,x,map);
			if(a)//2 10
				System.out.println(2);
			else if(b)//10 2
				System.out.println(1);
			else//没有关系
				System.out.println(0);
		}
	}
	public static boolean find(int x,int y,HashMap<Integer,Integer> map) {
		int t = map.get(x);
		while(t!=-1) {
			if(t==y) {
				return true;
			}else {
			   t = map.get(t);	
			}
		}
		return false;
	}
}
