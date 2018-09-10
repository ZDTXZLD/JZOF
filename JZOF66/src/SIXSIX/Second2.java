package SIXSIX;

public class Second2 {
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("We Are Happy");
		System.out.println(replaceSpace(buffer));
	}
    public static String replaceSpace(StringBuffer str) {
	       return str.toString().replaceAll("\\s", "%20");
}
    
}
