package SIXSIX;
/*
 * ����һ�ö��������������ö���������ת����һ�������˫������
Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
 * */
/*
 *
����˼·��
1.�������������˫��������������ͷ�ڵ㡣
2.��λ��������˫�������һ���ڵ㡣
3.�������������Ϊ�յĻ�������ǰroot׷�ӵ�����������
4.�������������˫��������������ͷ�ڵ㡣
5.�������������Ϊ�յĻ�����������׷�ӵ�root�ڵ�֮��
6.���������������Ƿ�Ϊ��ȷ�����صĽڵ㡣
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
	        //1.�������������˫��������������ͷ�ڵ㡣
	        TreeNode left=Convert(root.left);
	        TreeNode p=left;
	        //2.��λ��������˫�������һ���ڵ㡣
	        while(p!=null&&p.right!=null)
	        	p=p.right;
	        //3.�������������Ϊ�յĻ�,����ǰroot׷�ӵ�����������
	        if(left!=null) {
	        	p.right=root;
	        	root.left=p;
	        }
	        //4.�������������˫����,����������ͷ�ڵ�
	        TreeNode right=Convert(root.right);
	        //5.�������������Ϊ�յĻ�,��������׷�ӵ�root�ڵ�֮��
	        if(right!=null) {
	        	right.left=root;
	        	root.right=right;
	        }
	        return left!=null?left:root;
	        
	 }
}
/**


//�ݹ���� �� �� �� ����
public class Solution {
   //˫����������ͷ�����ұ�ͷ�ڵ�
  TreeNode leftHead = null;
  TreeNode rightHead = null;
  public TreeNode Convert(TreeNode pRootOfTree) {
       //�ݹ����Ҷ�ӽڵ�����ҽڵ㷵��null
      if(pRootOfTree==null) return null;
        //��һ������ʱ������ʹ�����Ҷ�ӽڵ�Ϊ�����һ���ڵ�
      Convert(pRootOfTree.left);
      if(rightHead==null){
          leftHead= rightHead = pRootOfTree;
      }else{
          //�Ѹ��ڵ���뵽˫�������ұߣ�rightHead����ƶ�
         rightHead.right = pRootOfTree;
         pRootOfTree.left = rightHead;
         rightHead = pRootOfTree;
      }
       //����Ҷ�ӽڵ�Ҳ���뵽˫������rightHead��ȷ����ֱ�Ӳ��룩
      Convert(pRootOfTree.right);
       //�������ͷ���
      return leftHead;
  }
}
* /
*/