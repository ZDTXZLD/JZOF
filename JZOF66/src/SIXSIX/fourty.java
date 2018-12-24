package SIXSIX;

import SIXSIX.eighteen.TreeNode;

/*
 *����һ�ö��������жϸö������Ƿ���ƽ���������
 * */
public class fourty {
	  public boolean IsBalanced_Solution(TreeNode root) {
	        if(root==null) return true;
	        return  Math.abs(maxDepth(root.left)-maxDepth(root.right))<=1&&
	        IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
	    }

	private int maxDepth(TreeNode root) {
		if(root==null) return 0;
		return  1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}
	
	//�ڶ��ַ���
	public boolean IsBalanced_Solution1(TreeNode root) {
		return getDepth(root)!=-1;
	}
	private int getDepth(TreeNode root) {
		if(root==null) return 0;
		int left=getDepth(root.left);
		if(left==-1)  return -1;
		int right=getDepth(root.right);
		if(right==-1) return -1;
		return Math.abs(left-right)>1?-1:1+Math.max(left,right);
	}
	
}
