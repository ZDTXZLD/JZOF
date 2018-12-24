package SIXSIX;
/*
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * */
/*
 *
解题思路：
1.将左子树构造成双链表，并返回链表头节点。
2.定位至左子树双链表最后一个节点。
3.如果左子树链表不为空的话，将当前root追加到左子树链表。
4.将右子树构造成双链表，并返回链表头节点。
5.如果右子树链表不为空的话，将该链表追加到root节点之后。
6.根据左子树链表是否为空确定返回的节点。
 * */

public class twentySeven {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	 public TreeNode Convert(TreeNode root) {
	        if(root==null) return null;
	        if(root.left==null&&root.right==null) return root;
	        //1.将左子树构造成双链表，并返回链表头节点。
	        TreeNode left=Convert(root.left);
	        TreeNode p=left;
	        //2.定位至左子树双链表最后一个节点。
	        while(p!=null&&p.right!=null)
	        	p=p.right;
	        //3.如果左子树链表不为空的话,讲当前root追加到左子树链表
	        if(left!=null) {
	        	p.right=root;
	        	root.left=p;
	        }
	        //4.讲右子树构造成双链表,并返回链表头节点
	        TreeNode right=Convert(root.right);
	        //5.如果右子树链表不为空的话,将该链表追加到root节点之后
	        if(right!=null) {
	        	right.left=root;
	        	root.right=right;
	        }
	        return left!=null?left:root;
	        
	 }
}
/**


//递归调用 左 根 右 遍历
public class Solution {
   //双向链表的左边头结点和右边头节点
  TreeNode leftHead = null;
  TreeNode rightHead = null;
  public TreeNode Convert(TreeNode pRootOfTree) {
       //递归调用叶子节点的左右节点返回null
      if(pRootOfTree==null) return null;
        //第一次运行时，它会使最左边叶子节点为链表第一个节点
      Convert(pRootOfTree.left);
      if(rightHead==null){
          leftHead= rightHead = pRootOfTree;
      }else{
          //把根节点插入到双向链表右边，rightHead向后移动
         rightHead.right = pRootOfTree;
         pRootOfTree.left = rightHead;
         rightHead = pRootOfTree;
      }
       //把右叶子节点也插入到双向链表（rightHead已确定，直接插入）
      Convert(pRootOfTree.right);
       //返回左边头结点
      return leftHead;
  }
}
* /
*/