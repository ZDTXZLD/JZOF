package List;
import java.util.Scanner;
/*
 * 给定一张包含N个点、M条边的无向图，每条边连接两个不同的点，
 * 且任意两点间最多只有一条边。对于这样的简单无向图，如果能将所有点划分成若干个集合，
 * 使得任意两个同一集合内的点之间没有边相连，任意两个不同集合内的点之间有边相连，
 * 则称该图为完全多部图。现在你需要判断给定的图是否为完全多部图。
 * */
/*
 * 2
5 7
1 3
1 5
2 3
2 5
3 4
4 5
3 5
4 3
1 2
2 3
3 4
 * */
/*
 * 第一行输入一个整数T表示数据组数,1<=T<=10   0<=M<=N(N-1)/2
 * 1<=X  Y<=N
 * 每组的数据格式为：
 *
 * */
//Yes

//No

public class JDone {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-- > 0)
        {
            int nodenum = sc.nextInt();
            int sidenum = sc.nextInt();
            boolean nodes[][] = new boolean[nodenum][nodenum];
            while(sidenum-- > 0)
            {
                int i = sc.nextInt() - 1;
                int j = sc.nextInt() - 1;
                nodes[i][j] = true;
                nodes[j][i] = true;
            }
            int result[] = new int[nodenum];
            for(int i = 0; i < nodenum; i++)
            {
                for(int j = 0; j < nodenum; j++)
                {
                    if(nodes[i][j]) result[i]++;
                }
            }
            boolean flag = true;
            for(int i = 0; i < nodenum; i++)
            {
                for(int j = i; j < nodenum; j++)
                {
                    if(!nodes[i][j])
                    {
                        if(result[i] != result[j])
                        {
                            flag = false;
                            break;
                        }
                    }
                }
                if(!flag) break;
            }
            if(!flag)
            {
                System.out.println("No");
            }
            else
            {
                System.out.println("Yes");
            }
        }
    }
}
