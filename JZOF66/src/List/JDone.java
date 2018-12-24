package List;
import java.util.Scanner;
/*
 * ����һ�Ű���N���㡢M���ߵ�����ͼ��ÿ��������������ͬ�ĵ㣬
 * ��������������ֻ��һ���ߡ����������ļ�����ͼ������ܽ����е㻮�ֳ����ɸ����ϣ�
 * ʹ����������ͬһ�����ڵĵ�֮��û�б�����������������ͬ�����ڵĵ�֮���б�������
 * ��Ƹ�ͼΪ��ȫ�ಿͼ����������Ҫ�жϸ�����ͼ�Ƿ�Ϊ��ȫ�ಿͼ��
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
 * ��һ������һ������T��ʾ��������,1<=T<=10   0<=M<=N(N-1)/2
 * 1<=X  Y<=N
 * ÿ������ݸ�ʽΪ��
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
