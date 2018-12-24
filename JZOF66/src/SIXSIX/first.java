package SIXSIX;
/*  二维数组的查找
 * 
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
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
