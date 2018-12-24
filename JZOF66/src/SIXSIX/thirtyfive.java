package SIXSIX;

/*
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 * */
public class thirtyfive {
	 public int FirstNotRepeatingChar(String str) {
		   char[] chars=new char[256];
	        for(int i=0;i<str.length();i++){
	            chars[(int)str.charAt(i)]++;
	        }
	        for(int i=0;i<str.length();i++){
	            if((int)chars[str.charAt(i)]==1){
	                return (char)i;
	            }
	        }
	        return -1;
	 }
}
