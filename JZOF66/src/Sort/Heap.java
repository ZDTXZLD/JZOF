package Sort;


//堆排序   O(nlogN)
public class Heap <E extends Comparable<E>>{

    private java.util.ArrayList<E> list= new java.util.ArrayList<>();
    
    public Heap() {}
    public Heap(E[] objects) {
    	for(int i=0;i<objects.length;i++) {
    		add(objects[i]);
    		
    	}
    }
    /*
     * Heap  可以在ArrayList或者一个数组中
     * 树根在位置0处
     * 两个子节点在位置一和位置2
     * 对于位置i的节点
     * 左子节点在2i+1处   右子节点在2i+2处  父节点在(i-1)/2处
     * */
    /*add方法的实现
     * 
     * 将最后一个结点最为当前结点
     * while(当前结点大于它的父节点){
     * 将当前结点和它的父节点交换
     * 现在在当前结点上面进了一个层次
     * }
  
     * */
	private void add(E newObject) {
		list.add(newObject);
		int currentIndex=list.size()-1;     //the index of the last node
		while(currentIndex>0) {
			int parentIndex=(currentIndex-1)/2;
			if(list.get(currentIndex).compareTo(list.get(parentIndex))>0) { //当前节点大于父节点
				E temp=list.get(currentIndex);
				list.set(currentIndex, list.get(parentIndex));
				list.set(parentIndex, temp);	//交换
			}else 
	          break;
          currentIndex=parentIndex;
		}
	}
	
	
	/*删除根节点
	 * 
	 * 用最后一个节点替换跟节点
	 * 让跟节点成为当前节点
	 * while(当前节点具有子节点并且当前节点小于它的子节点){
	 * 将当前节点和它的较大子节点交换
	 * 现在的当前节点往下退了一个层次
	 * }
	 * 
	 * 
	 * */
	public E remove() {
	if(list.size()==0) return null;
	E removeObject=list.get(0);   //获取当前的根节点
	list.set(0, list.get(list.size()-1));       //让当前根节点为最后一个元素
	list.remove(list.size()-1);                 //移除最后一个街节点
	
	int currentIndex=0;            
	while(currentIndex<list.size()) {          //当前节点具备子节点且当前节点小于它的子节点
		int leftChildIndex=2*currentIndex+1;     //左孩子索引
		int rightChildIndex=2*currentIndex+2;    //右左孩子索引
		if(leftChildIndex>=list.size())  break;    //the tree is a heap
		int maxIndex=leftChildIndex;          //当前最大索引为左孩子
		if(rightChildIndex<list.size()) {          //后面还有节点
			if(list.get(maxIndex).compareTo(list.get(rightChildIndex))<0) {
				//用list最大索引与右节点做比较
				maxIndex=rightChildIndex;   //设置最大索引为右节点
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
	 * 使用Heap类创建一个对象
	 * 先用add方法将所有元素加到堆中
	 * 再用remove方法从堆中删除所有元素
	 * 使用降序删除元素,排序就是从大到小
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
		Integer list[]= {40,50,53,39,42,35};  //使用引用数据类型定义
		heapSort(list);
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
	}
}
