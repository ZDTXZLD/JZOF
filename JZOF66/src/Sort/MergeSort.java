package Sort;
//�鲢����
public class MergeSort {

	private static void merge(int[] list) {
	if(list.length>1) {
		int [] firstHalf=new int[list.length/2];
		//src:Դ���飻	srcPos:Դ����Ҫ���Ƶ���ʼλ�ã�
		//dest:Ŀ�����飻	destPos:Ŀ��������õ���ʼλ�ã�	length:���Ƶĳ��ȡ�
	    System.arraycopy(list, 0, firstHalf, 0, list.length/2);
		merge(firstHalf);    //�ݹ�����
		
		int secondHalflength=list.length-list.length/2;
		int []secondHalf=new int[secondHalflength];
		System.arraycopy(list, list.length/2, secondHalf, 0, secondHalflength);
		merge(secondHalf);
		
		
		combine(firstHalf,secondHalf,list);
	} 
		
	}
	
	private static void combine(int[] firstHalf, int[] secondHalf, int[] list) {
	   int current1=0;             //firstHalf������
	   int current2=0;             //secondHalf������
	   int current3=0;             //list���������
	   
	   //��ǰ����״̬�İ�˳�������,Ҫ�������ϲ���һ������
	   //����ǰ������С�ڳ���ʱ
	   while(current1<firstHalf.length && current2<secondHalf.length) {
		   if(firstHalf[current1]<secondHalf[current2])
			   list[current3++]=firstHalf[current1++];
		   else
			   list[current3++]=secondHalf[current2++];   
	   }
	   
	   //���������������δ�ƶ���Ԫ��,�����ƶ���list������
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
