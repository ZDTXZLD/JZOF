package Sort;
//归并排序
public class MergeSort {

	private static void merge(int[] list) {
	if(list.length>1) {
		int [] firstHalf=new int[list.length/2];
		//src:源数组；	srcPos:源数组要复制的起始位置；
		//dest:目的数组；	destPos:目的数组放置的起始位置；	length:复制的长度。
	    System.arraycopy(list, 0, firstHalf, 0, list.length/2);
		merge(firstHalf);    //递归排序
		
		int secondHalflength=list.length-list.length/2;
		int []secondHalf=new int[secondHalflength];
		System.arraycopy(list, list.length/2, secondHalf, 0, secondHalflength);
		merge(secondHalf);
		
		
		combine(firstHalf,secondHalf,list);
	} 
		
	}
	
	private static void combine(int[] firstHalf, int[] secondHalf, int[] list) {
	   int current1=0;             //firstHalf的索引
	   int current2=0;             //secondHalf的索引
	   int current3=0;             //list数组的索引
	   
	   //当前两个状态的按顺序排序的,要将两个合并到一个数组
	   //当当前的索引小于长度时
	   while(current1<firstHalf.length && current2<secondHalf.length) {
		   if(firstHalf[current1]<secondHalf[current2])
			   list[current3++]=firstHalf[current1++];
		   else
			   list[current3++]=secondHalf[current2++];   
	   }
	   
	   //如果两个集合仍有未移动的元素,将其移动到list集合中
	   while(current1<firstHalf.length)
		   list[current3++]=firstHalf[current1++];
	   while(current2<secondHalf.length)   
		   list[current3++]=secondHalf[current2++];
	  
	}

	public static void main(String[] args) {
		int list[]= {12,652,23,56,2232,6,26,-23,-12,356,56};
		merge(list);
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+"  ");
		}
	}

	
}
