package Sort;
//��������; Ƕ��for �ڲ�ѭ����list[i]�����list[0]��list[i-1]�������Ա�
public class InsertionSort {

	private static void InsertSort(int[] list) {
		for(int i=1;i<list.length;i++) {
			int currentElement=list[i];
			int k;                          
			for(k=i-1;k>=0&&list[k]>currentElement;k--) {
				list[k+1]=list[k];                      //�Ա����ڵ�Ԫ��
			}
		}
	}
	
	public static void main(String[] args) {
	int list[]= {12,652,23,56,2232,6,26,-23,-12,356,56};
	InsertSort(list);
	for(int i=0;i<list.length;i++) {
		System.out.print(list[i]+"  ");
	}
	}


}
