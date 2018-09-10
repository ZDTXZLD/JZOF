package SIXSIX;
//输入一个链表，反转链表后，输出新链表的表头
public class sixteen {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	    public ListNode ReverseList(ListNode head) {
		if(head==null) {return null;}
	    	ListNode newHead=null;
	    	ListNode pNode=head;
	    	ListNode pPrev=null;
	    	while(pNode!=null) {
	    		ListNode pNext=pNode.next;
	    		if(pNext==null) 
	    			newHead=pNode;
	    		pNode.next=pPrev;
	    		pPrev=pNode;
	    		pNode=pNext;
	    	}
	    	return newHead;
	    	
	    }
	}
}
