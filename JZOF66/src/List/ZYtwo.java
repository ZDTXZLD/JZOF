package List;
/*
 * Ğ¡º¢ÌøÌ¨½×
 * */
public class ZYtwo {
	 public static int JumpFloor(int target) {
	        int a=1;
	        int b=2;
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
	        c=c-1;
	        return c;
	        
	    }
}
