package SIXSIX;
/*
 * 输入两个链表，找出它们的第一个公共结点。
 * 
 * */
public class thirtyseven {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	 public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		if(pHead1==null||pHead2==null) return null;
		if(pHead1==pHead2)  return pHead1;
		int len1=0;
		int len2=0;
		ListNode curr1=pHead1;
		ListNode curr2=pHead2;
		while(curr1!=null) {
			len1++;
			curr1=curr1.next;
		}
		while(curr2!=null) {
			len2++;
			curr2=curr2.next;
		}
		curr1=pHead1;
		curr2=pHead2;
		if(len1>len2) {
			int moreLen=len1-len2;
			while(moreLen!=0) {
				curr1=curr1.next;
				moreLen--;
			}
		}
		else {
			int moreLen=len2-len1;
			while(moreLen!=0) {
				curr2=curr2.next;
				moreLen--;
			}
		}
		while(curr1!=curr2&&curr1!=null) {
			curr1=curr1.next;
			curr2=curr2.next;
		}
		return curr1; 
	    }
}
