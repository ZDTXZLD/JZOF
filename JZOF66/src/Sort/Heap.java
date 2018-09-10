package Sort;


//������   O(nlogN)
public class Heap <E extends Comparable<E>>{

    private java.util.ArrayList<E> list= new java.util.ArrayList<>();
    
    public Heap() {}
    public Heap(E[] objects) {
    	for(int i=0;i<objects.length;i++) {
    		add(objects[i]);
    		
    	}
    }
    /*
     * Heap  ������ArrayList����һ��������
     * ������λ��0��
     * �����ӽڵ���λ��һ��λ��2
     * ����λ��i�Ľڵ�
     * ���ӽڵ���2i+1��   ���ӽڵ���2i+2��  ���ڵ���(i-1)/2��
     * */
    /*add������ʵ��
     * 
     * �����һ�������Ϊ��ǰ���
     * while(��ǰ���������ĸ��ڵ�){
     * ����ǰ�������ĸ��ڵ㽻��
     * �����ڵ�ǰ����������һ�����
     * }
  
     * */
	private void add(E newObject) {
		list.add(newObject);
		int currentIndex=list.size()-1;     //the index of the last node
		while(currentIndex>0) {
			int parentIndex=(currentIndex-1)/2;
			if(list.get(currentIndex).compareTo(list.get(parentIndex))>0) { //��ǰ�ڵ���ڸ��ڵ�
				E temp=list.get(currentIndex);
				list.set(currentIndex, list.get(parentIndex));
				list.set(parentIndex, temp);	//����
			}else 
	          break;
          currentIndex=parentIndex;
		}
	}
	
	
	/*ɾ�����ڵ�
	 * 
	 * �����һ���ڵ��滻���ڵ�
	 * �ø��ڵ��Ϊ��ǰ�ڵ�
	 * while(��ǰ�ڵ�����ӽڵ㲢�ҵ�ǰ�ڵ�С�������ӽڵ�){
	 * ����ǰ�ڵ�����Ľϴ��ӽڵ㽻��
	 * ���ڵĵ�ǰ�ڵ���������һ�����
	 * }
	 * 
	 * 
	 * */
	public E remove() {
	if(list.size()==0) return null;
	E removeObject=list.get(0);   //��ȡ��ǰ�ĸ��ڵ�
	list.set(0, list.get(list.size()-1));       //�õ�ǰ���ڵ�Ϊ���һ��Ԫ��
	list.remove(list.size()-1);                 //�Ƴ����һ���ֽڵ�
	
	int currentIndex=0;            
	while(currentIndex<list.size()) {          //��ǰ�ڵ�߱��ӽڵ��ҵ�ǰ�ڵ�С�������ӽڵ�
		int leftChildIndex=2*currentIndex+1;     //��������
		int rightChildIndex=2*currentIndex+2;    //����������
		if(leftChildIndex>=list.size())  break;    //the tree is a heap
		int maxIndex=leftChildIndex;          //��ǰ�������Ϊ����
		if(rightChildIndex<list.size()) {          //���滹�нڵ�
			if(list.get(maxIndex).compareTo(list.get(rightChildIndex))<0) {
				//��list����������ҽڵ����Ƚ�
				maxIndex=rightChildIndex;   //�����������Ϊ�ҽڵ�
			}
		}
		
		if(list.get(currentIndex).compareTo(list.get(maxIndex))<0) {
			E temp=list.get(maxIndex);
			list.set(maxIndex, list.get(currentIndex));
			list.set(currentIndex, temp);
			currentIndex=maxIndex;
		}
		else break;
	}
	return  removeObject;		
	}
	
	public int  getsize() {
		return list.size();
	}
	
	/*
	 * ʹ��Heap�ഴ��һ������
	 * ����add����������Ԫ�ؼӵ�����
	 * ����remove�����Ӷ���ɾ������Ԫ��
	 * ʹ�ý���ɾ��Ԫ��,������ǴӴ�С
	 * */
	public static <E extends Comparable<E>> void heapSort(E[]list) {
		Heap<E> heap=new Heap<>();
		for(int i=0;i<list.length;i++) {
			heap.add(list[i]);
		}
		for(int i=list.length-1;i>=0;i--) {
			list[i]=heap.remove();
		}
	}
	
	public static void main(String[] args) {
		Integer list[]= {40,50,53,39,42,35};  //ʹ�������������Ͷ���
		heapSort(list);
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
	}
}
