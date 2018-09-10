package SIXSIX;

import java.util.LinkedList;
import java.util.Queue;

/*
 * ����һ�ö����������������ȡ�
 * �Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·��
 * �·���ĳ���Ϊ������ȡ�
 * 
 * */
public class thirtynine {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	//�ݹ�ʵ��
	  public int TreeDepth(TreeNode root) {
	   if(root==null)  return 0;
	   int nLeft=TreeDepth(root.left);
	   int nRight=TreeDepth(root.right);
	   return nLeft>nRight?(nLeft+1):(nRight+1);		  
	  }
	  //�ǵݹ�ʵ��
	  public int TreeDepth2(TreeNode root) {
		  if(root==null)  return 0;
		  Queue<TreeNode> queue=new LinkedList<TreeNode>();
	      queue.add(root);
	  int depth=0,count=0,nextCount=1;
	  while(queue.size()!=0) {
		  TreeNode top=queue.poll();
		  count++;
		  if(top.left!=null) {
			  queue.add(top.left);
		  }
		  if(top.right!=null) {
			  queue.add(top.right);
		  }
		  if(count==nextCount) {
			  nextCount=queue.size();
			  count=0;
			  depth++;
		  }
	  }
	  return depth;
	  
	  }
	  
	
}
