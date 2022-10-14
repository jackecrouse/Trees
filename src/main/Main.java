package main;

public class Main {

	public static void main(String[] args) {
		
		TreeNode<Integer> root = new TreeNode<Integer>(5);
		BinaryTree<Integer> tree = new BinaryTree<Integer>(root); 
		
		tree.insert(4);
		tree.insert(10);
		tree.insert(7);
		tree.insert(25);
		tree.insert(17);
		tree.insert(3);
		
		//Tree is 5, 4, 10, 7, 25, 17, 3
		
		/*         5
				  / \
				 4  10
				/  /  \
			   3  7   25
			          /  
				     17  
		*/
		
		System.out.println("---Inorder Traversal---");
		tree.inOrder();
		
		System.out.println("---Preorder Traversal---");
		tree.preOrder();
		
		System.out.println("---Postorder Traversal---");
		tree.postOrder();

		System.out.println("---Levelorder Traversal---");
		tree.levelOrder();
		
	}

}
