package SIXSIX;
/*
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
 * �����������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������
 * */
public class Eight {
    public int JumpFloor(int target) {
        int a=1;
        int b=1;
        int c=0;
        if(target<0){ return -1 ;}
        if(target==1){ return 1;}
        if(target==2){return 2;}
        if(target>=3){
        for(int i=1;i<target;i++){
            c=a+b;
            a=b;
            b=c;
        }
        }
        return c;
        
    }
}
