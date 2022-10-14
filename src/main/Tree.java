package main;
import java.util.LinkedList;
import java.util.Queue;


public abstract class Tree<T extends Comparable<T>> {

	protected TreeNode<T> _root;
	
	public Tree(TreeNode<T> root) 
	{	
		_root = root; 
	}
	
	public TreeNode<T> getRoot()
	{
		return _root;
	}
	
	public void setRoot(T data)
	{
		_root._data = data;
	}
	
	
	public void inOrder()
	{
		inOrderHelp(_root);
	}
	
	private void inOrderHelp(TreeNode<T> currentNode)
	{
		if(currentNode == null) return;
		
		inOrderHelp(currentNode._left);
		System.out.println(currentNode._data);
		inOrderHelp(currentNode._right);
	}
	
	
	public void preOrder()
	{
		preOrderHelp(_root);
	}
	
	private void preOrderHelp(TreeNode<T> currentNode)
	{
		if(currentNode == null) return;
		
		System.out.println(currentNode._data);
		preOrderHelp(currentNode._left);
		preOrderHelp(currentNode._right);
	}
	
	public void postOrder()
	{
		postOrderHelp(_root);
	}
	
	private void postOrderHelp(TreeNode<T> currentNode)
	{
		if(currentNode == null) return;
		
		postOrderHelp(currentNode._left);
		postOrderHelp(currentNode._right);
		System.out.println(currentNode._data);
	}
	
	
	public void levelOrder()
	{
		Queue<TreeNode<T>> q = new LinkedList<TreeNode<T>>();
		
		q.add(_root); //init with root
		
		while(!q.isEmpty())
		{
			TreeNode<T> top = q.poll();
			
			System.out.println(top._data); //print each node
			
			for(var child: top.getChildren())
			{
				if(child != null) q.add(child);
			}
		}
	}
	
}
