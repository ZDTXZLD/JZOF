package SIXSIX;

/*
 * ����һ����������������е�����k����㡣
 * */
public class fifteen {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
		 public static ListNode FindKthToTail(ListNode head,int k) {
		        ListNode p, q;
		        p = q = head;
		        int i = 0;
		        for (; p != null; i++) {
		            if (i >= k)
		                q = q.next;
		            p = p.next;
		        }
		        return i < k ? null : q;
		    }
		
	
	
}
