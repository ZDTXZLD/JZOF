package SIXSIX;
/*  ��ά����Ĳ���
 * 
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ��������
 * �ж��������Ƿ��и�������
 * 
 * */
public class first {
public static void main(String[] args) {
    int [][]array= {{123,12,123},{1213,16,65},{35,96,100}};
	int num=10;
	boolean s=Find(num,array);
	System.out.println(s);
}

public static boolean Find(int target, int [][] array) {
        boolean find=false;
       for(int i=0;i<array.length;i++){
          for(int j=0;j<array[i].length;j++){
               if(array[i][j]==target){
              find=true;
              break;
           }
          }
    }
	return find;
}

}
