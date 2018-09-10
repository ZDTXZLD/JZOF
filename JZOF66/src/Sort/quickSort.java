package Sort;

public class quickSort {

	private static void quickSort(int[] list) {
	quickSort(list,0,list.length-1);
		
	}
	
	//使用主元划分数组
	private static void quickSort(int[] list, int first, int last) {
	   if(last>first) {
		   int pivotIndex=partition(list,first,last);
		   quickSort(list,first,pivotIndex-1);
		   quickSort(list,pivotIndex+1,last);
	   }
		
	}


	private static int partition(int[] list, int first, int last) {
	int pivot=list[first];
	int low=first+1;         //初始情况 low指向子数组的第二个元素
	int high=last;           //high指向子数组的最后一个元素
	//主元大于前面的主元
	while(high>low) {
		while(low<=high&&list[low]<=pivot)    //从左侧查找第一个大于主元的元素
			low++;
        while(low<=high&&list[high]>pivot)    //从右侧查找第一个小于等于主元的元素
        	high--;
      
        if(high>low) {
        	int temp=list[high];
         	list[high]=list[low];
            list[low]=temp;
        }
	}
	while(high>first&&list[high]>=pivot)
		high--;
	if(pivot>list[high]) {
		list[first]=list[high];
		list[high]=pivot;
		return high;
	}else {                 //主元被移动,返回新下标
		return first;
	}
	}

	public static void main(String[] args) {
		int list[]= {12,652,23,56,2232,6,26,-23,-12,356,56};
		quickSort(list);
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
	}

	
}
