package SIXSIX;
/*
 * ����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬
 * һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩��
 * ���ؽ��Ϊ���ƺ��������head��
 * ��ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
 * */
public class twentysix {
		
	public class RandomListNode {
	    int label;
	    RandomListNode next = null;
	    RandomListNode random = null;

	    RandomListNode(int label) {
	        this.label = label;
	    }
	}
	public RandomListNode Clone(RandomListNode pHead) {
			 if(pHead==null) return null;
			 RandomListNode currentNode=pHead;
			 //1.����ÿ�����,�縴�ƽڵ㵽A�õ�A1,�����A1�嵽���A����
			 while(currentNode!=null) {
				 RandomListNode cloneNode=new RandomListNode(currentNode.label);
				 RandomListNode nextNode = currentNode.next;
			     currentNode.next=cloneNode;
			     cloneNode.next=nextNode;
			     currentNode=nextNode;
			 }
			 currentNode=pHead;
			 //2.���±�������,�����Ͻ������ָ����½ڵ�,��A1.random=A.random
			 while(currentNode!=null) {
				 currentNode.next.random=currentNode.random==null?null:currentNode.random.next;
				 currentNode=currentNode.next.next;
			 }
			 //3.�������,��������Ϊԭ����͸��ƺ������
			 currentNode =pHead;
			 RandomListNode pCloneHead=pHead.next;
			 while(currentNode!=null) {
				 RandomListNode  cloneNode=currentNode.next;
				 currentNode.next=cloneNode.next;
				 cloneNode.next=cloneNode.next==null?null:cloneNode.next.next;
				 currentNode=currentNode.next;
			 }
			 return pCloneHead;
		 }
		    
			
		       
		   
}
