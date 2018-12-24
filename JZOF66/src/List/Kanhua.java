package List;
/*
 * 360第二题
 *求[l,r]时间段中,小明一共看了多少朵不同的花
 * 
 * */
import java.util.BitSet;
import java.util.Scanner;

public class Kanhua{

	public static void main(String[] args) {
		BitSet[] sets = new BitSet[101];
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();	//看花次数
		int m = in.nextInt();	//花数
		for(int i=1;i<=m;i++) {
			sets[i] = new BitSet(1024);
		}
		for(int i=1;i<=n;i++) {
			int ai = in.nextInt();
			sets[ai].set(i);     //表示第ai朵花是第i次看的
		}
		int q = in.nextInt();
		for(int i=0;i<q;i++) {
			int l=in.nextInt();
			int r=in.nextInt();
			int count = 0;
			for(int j=1;j<=m;j++) {
				if(!sets[j].get(l, r+1).isEmpty()) count++;
			}
			System.out.println(count);
		}
	}

}