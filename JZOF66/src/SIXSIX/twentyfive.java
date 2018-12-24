package SIXSIX;

import java.util.ArrayList;

/*
 * ����һ�Ŷ������ĸ��ڵ��һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
 * ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����4
 * (ע��: �ڷ���ֵ��list�У����鳤�ȴ�����鿿ǰ)
 * 
 * */
//DFS��������㷨
public class twentyfive {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;
	    }
	}	

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
      ArrayList<ArrayList<Integer>> paths=new ArrayList<ArrayList<Integer>>();
      if(root==null) return paths;
      find(paths,new ArrayList<Integer>(),root,target);
      return paths;
    }

	private void find(ArrayList<ArrayList<Integer>> paths, ArrayList<Integer> path, TreeNode root, int target) {
		path.add(root.val);
		if(root.left==null&&root.right==null) {
			if(target==root.val) {
				paths.add(path);
			}
			return;
		}
		ArrayList<Integer> path2=new ArrayList<>();
		path2.addAll(path);
		if(root.left!=null) find(paths,path,root.left,target-root.val);
		if(root.right!=null) find(paths,path2,root.right,target-root.val);
		
	}
}
