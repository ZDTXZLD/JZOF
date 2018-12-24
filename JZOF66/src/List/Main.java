package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
 * 360第一题
 * 有一个城市需要修建,给你N个民居的坐标X,Y，问吧这么多民居放入城市中,城市余姚的最小面积是多少
 * 
 * */
public class Main {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> b=new ArrayList<Integer>();
        for(int j=0;j<i;j++) {
        	int q=sc.nextInt();
        	int w=sc.nextInt();
            a.add(q);
            b.add(w);
        }
       
        Object[] array =  a.toArray();
        Object[] array2 =  b.toArray();
        Arrays.sort(array);
        Arrays.sort(array2);
       int minx=(int)array[0];
       int maxx=(int)array[array.length-1];
       int miny=(int)array2[0];
       int maxy=(int)array2[array2.length-1];
       int x=maxx-minx;
       int y=maxy-miny;
         int  xy=x*y;
        System.out.println(xy);
	}
}
/*
 * import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int minX=Integer.MAX_VALUE;
		int minY=Integer.MAX_VALUE;
		int maxX=Integer.MIN_VALUE;
		int maxY=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int tmpX = in.nextInt();
			if(tmpX<minX) minX=tmpX;
			if(tmpX>maxX) maxX=tmpX;
			int tmpY = in.nextInt();
			if(tmpY<minY) minY=tmpY;
			if(tmpY>maxY) maxY=tmpY;
		}
		int maxDiff =Math.max(maxX-minX, maxY-minY);
		System.out.println((long)maxDiff*maxDiff);
	}

}
 * */