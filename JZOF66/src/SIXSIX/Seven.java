package SIXSIX;


/*
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n��
 * �������쳲��������еĵ�n���0��ʼ����0��Ϊ0����
    n<=39
 * */
public class Seven {
	public static void main(String[]args) {
		int a=Fibonacci(10);
		System.out.println(a);
	}
	public static  int Fibonacci(int n) {
        int a=1,b=1,c=0;      
        if(n<0){            
            return 0;       
        }else if(n==1||n==2){     
            return 1;      
        }else{        
            for (int i=3;i<=n;i++){       
                c=a+b;          
                b=a;             
                a=c;           
            }           
            return c;      
        }    
    } 
}
