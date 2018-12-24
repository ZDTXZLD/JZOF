package SIXSIX;
/*
 * 输入两棵二叉树A，B，判断B是不是A的子结构。
 * (ps：我们约定空树不是任意一个树的子结构)
 * */
public class eighteen {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
       boolean result=false;
       //当Tree1和Tree2都不等于零的时候,进行比较,否则直接返回false
       if(root2!=null && root1!=null) {
    	   //如果找到了对应的Tree2的根节点的点
    	   if(root1.val==root2.val) {
    		   //以这个根节点为起点判断是否包含Tree2
    		   result=doesTree1HaveTree2(root1,root2);
    	   }
    	   //如果找不到,那么再去root的左孩子当作起点,去判断时候包含Tree2
    	   if(!result) {
    		   result=HasSubtree(root1.left,root2);
    	   }
    	   //如果还找不到
    	   if(!result) {
    		   result=HasSubtree(root1.right, root2);
    	   }
       }
       return result;
    }
	public static boolean doesTree1HaveTree2(TreeNode node1,TreeNode node2) {
		//如果Tree2已经遍历完了都能对应上，返回true
		if(node2==null) {return true;}
	    //如果Tree2还没有遍历完,Tree1遍历完了,返回false
		if(node1==null) {return false;}
	    //如果当中一个点没对上,返回false
		if(node1.val!=node2.val) {
			return false;
		}
		//如果根节点对应的上,那就去别的自己子节点里匹配
	  return doesTree1HaveTree2(node1.left, node2.left)&&doesTree1HaveTree2(node1.right, node2.right);
	}
	
}
