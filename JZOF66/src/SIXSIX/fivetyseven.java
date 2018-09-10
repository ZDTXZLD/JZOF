package SIXSIX;
/*
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 * */
public class fivetyseven {
	 public class ListNode {
		    int val;
		    ListNode next = null;
		 
		    ListNode(int val) {
		        this.val = val;
		    }
		}
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null||pHead.next==null) return null;
        ListNode n1=pHead;
        ListNode n2=pHead;
        while (n2 != null && n2.next != null) {
            n1 = n1.next;
            n2 = n2.next.next;
            if (n2 == null) {
                return null;
            }
            if (n1 == n2) {
                break;
            }
        }
        n1 = pHead;
        while (n1 != n2) {
            n1 = n1.next;
            n2 = n2.next;
        }
        return n1;
    }

}
