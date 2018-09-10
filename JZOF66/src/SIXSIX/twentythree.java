package SIXSIX;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/*
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * */
public class twentythree {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		   ArrayList<Integer> list=new ArrayList<Integer>();
	        ArrayList<TreeNode> tree=new ArrayList<TreeNode>();
	        if(root==null)
	            return list;
	        tree.add(root);
	        for(int i=0;i<tree.size();i++){
	            TreeNode node=tree.get(i);
	            if(node.left!=null)
	                tree.add(node.left);
	            if(node.right!=null)
	                tree.add(node.right);
	            list.add(node.val);
	        }
	        return list;
	}
}
