package main;

public class BinaryTree<T extends Comparable<T>> extends Tree<T>
{

	public BinaryTree(TreeNode<T> root) 
	{
		super(root);
	}
	
	
	public void insert(T data)
	{
		_root = insertHelp(_root, data);
	}
	
	
	private TreeNode<T> insertHelp(TreeNode<T> currentNode, T data)
	{
		if(currentNode == null) return new TreeNode<T>(null, data, null);
		
		else if (data.compareTo(currentNode._data) < 0)
		{
			currentNode._left = insertHelp(currentNode._left, data);
		}
		
		else if (data.compareTo(currentNode._data) > 0)
		{
			currentNode._right = insertHelp(currentNode._right, data);
		}
		
		return currentNode;
		
	}
	
	
}


