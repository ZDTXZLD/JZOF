package List;
/*
 * 360�ڶ���
 *��[l,r]ʱ�����,С��һ�����˶��ٶ䲻ͬ�Ļ�
 * 
 * */
import java.util.BitSet;
import java.util.Scanner;

public class Kanhua{

	public static void main(String[] args) {
		BitSet[] sets = new BitSet[101];
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();	//��������
		int m = in.nextInt();	//����
		for(int i=1;i<=m;i++) {
			sets[i] = new BitSet(1024);
		}
		for(int i=1;i<=n;i++) {
			int ai = in.nextInt();
			sets[ai].set(i);     //��ʾ��ai�仨�ǵ�i�ο���
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