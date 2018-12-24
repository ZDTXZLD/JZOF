package SIXSIX;
/*
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
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
