package SIXSIX;
/*
 * �������ö�����A��B���ж�B�ǲ���A���ӽṹ��
 * (ps������Լ��������������һ�������ӽṹ)
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
       //��Tree1��Tree2�����������ʱ��,���бȽ�,����ֱ�ӷ���false
       if(root2!=null && root1!=null) {
    	   //����ҵ��˶�Ӧ��Tree2�ĸ��ڵ�ĵ�
    	   if(root1.val==root2.val) {
    		   //��������ڵ�Ϊ����ж��Ƿ����Tree2
    		   result=doesTree1HaveTree2(root1,root2);
    	   }
    	   //����Ҳ���,��ô��ȥroot�����ӵ������,ȥ�ж�ʱ�����Tree2
    	   if(!result) {
    		   result=HasSubtree(root1.left,root2);
    	   }
    	   //������Ҳ���
    	   if(!result) {
    		   result=HasSubtree(root1.right, root2);
    	   }
       }
       return result;
    }
	public static boolean doesTree1HaveTree2(TreeNode node1,TreeNode node2) {
		//���Tree2�Ѿ��������˶��ܶ�Ӧ�ϣ�����true
		if(node2==null) {return true;}
	    //���Tree2��û�б�����,Tree1��������,����false
		if(node1==null) {return false;}
	    //�������һ����û����,����false
		if(node1.val!=node2.val) {
			return false;
		}
		//������ڵ��Ӧ����,�Ǿ�ȥ����Լ��ӽڵ���ƥ��
	  return doesTree1HaveTree2(node1.left, node2.left)&&doesTree1HaveTree2(node1.right, node2.right);
	}
	
}
