package Sort;

public class quickSort {

	private static void quickSort(int[] list) {
	quickSort(list,0,list.length-1);
		
	}
	
	//ʹ����Ԫ��������
	private static void quickSort(int[] list, int first, int last) {
	   if(last>first) {
		   int pivotIndex=partition(list,first,last);
		   quickSort(list,first,pivotIndex-1);
		   quickSort(list,pivotIndex+1,last);
	   }
		
	}


	private static int partition(int[] list, int first, int last) {
	int pivot=list[first];
	int low=first+1;         //��ʼ��� lowָ��������ĵڶ���Ԫ��
	int high=last;           //highָ������������һ��Ԫ��
	//��Ԫ����ǰ�����Ԫ
	while(high>low) {
		while(low<=high&&list[low]<=pivot)    //�������ҵ�һ��������Ԫ��Ԫ��
			low++;
        while(low<=high&&list[high]>pivot)    //���Ҳ���ҵ�һ��С�ڵ�����Ԫ��Ԫ��
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
	}else {                 //��Ԫ���ƶ�,�������±�
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
