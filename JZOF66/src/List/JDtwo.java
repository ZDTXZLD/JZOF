package List;

import java.util.Scanner;

/*
 * ����n����Ʒ��ÿ����Ʒ���������� ai , bi , ci ��
 * ����i��Ʒ���ϸ�Ʒ�������� : ��������Ʒ j , ��aj>ai , bj>bi , cj>ci�����i��ƷΪ���ϸ�Ʒ��

�ָ���n����Ʒ��a,b,c����������������ϸ�Ʒ��������
����n����Ʒ��ÿ����Ʒ���������� ai , bi , ci ������i��Ʒ���ϸ�Ʒ�������� : ��������Ʒ j , ��aj>ai , bj>bi , cj>ci�����i��ƷΪ���ϸ�Ʒ��

�ָ���n����Ʒ��a,b,c����������������ϸ�Ʒ��������
�������һ����������ʾ���ϸ�Ʒ��������
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
