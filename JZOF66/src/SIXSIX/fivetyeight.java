package SIXSIX;
/*
 * ��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻������
 * ��������ͷָ�롣 ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
 * */
public class fivetyeight {
	 public class ListNode {
		    int val;
		    ListNode next = null;

		    ListNode(int val) {
		        this.val = val;
		    }
		}
	 public ListNode deleteDuplication(ListNode pHead)
	    {
		 if(pHead==null)  return null;
		   ListNode p = pHead;
	        ListNode n = new ListNode(0);
	        ListNode pre = n;
	        n.next = pHead;
	        boolean flag = false;
	        while (p != null) {
	            ListNode q = p.next;
	            if (q == null) break;
	            if (q.val == p.val) {
	                while (q != null && q.val == p.val) {
	                    q = q.next;
	                }
	                pre.next = q;
	                p = q;
	            } else {
	                if (!flag) {
	                    n.next = p;
	                    flag = true;
	                }
	                pre = p;
	                p = q;
	            }
	        }
	        return n.next;

	    }
}
