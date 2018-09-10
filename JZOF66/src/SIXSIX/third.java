package SIXSIX;

import java.util.ArrayList;

/* 从头到尾打印链表
 * 
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * 
 * */



public class third {
	 class ListNode {
	      int val;
	      ListNode next = null;
	       ListNode(int val) {
	         this.val = val;
	        }
	    }
	    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	        ArrayList<Integer> list=new ArrayList<Integer>();
	        ArrayList<Integer> list2=new ArrayList<Integer>();
	        ListNode n =listNode;
	        while(n!=null){
	            list.add(n.val);
	            n=n.next;
	        }
	          for (int i = list.size() - 1; i >= 0; i--) {
	            list2.add(list.get(i));
	            System.out.println(list.get(i));
	        }
	        return list2;
	    }
	}

