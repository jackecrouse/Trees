package main;

public final class TreeNode<T>
{
	
	protected TreeNode<T> _left;
	protected T _data;
	protected TreeNode<T> _right;
	
	public TreeNode(TreeNode<T> left, T data, TreeNode<T> right) 
	{
		_left = left;
		_data = data;
		_right = right;
	}
	
	public TreeNode(T data)
	{
		_left = null;
		_data = data;
		_right = null;
	}
	
	protected TreeNode<T>[] getChildren()
	{
		@SuppressWarnings("unchecked")
		
		TreeNode<T>[] res = new TreeNode[2];
		if(_left != null) res[0] = _left;
		if(_right != null) res[1] = _right;
		
		return res;
	}
	
}
