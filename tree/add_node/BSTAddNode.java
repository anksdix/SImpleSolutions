
public class BSTAddNode {

	Node root;
	
	static class Node{
	
		public Node(int data) {
			this.data  = data;
			left = null;
			right = null;
		}
		
		int data;
		Node left;
		Node right;
	}
	
	public Node addNode(Node node,int data) {
		
		if(root == null) {	
			root = new Node(data);
			return root;
		}
		
		if(data == node.data)
			return root;
		
		if(data < node.data)
		{
			if(node.left == null) {
				node.left = new Node(data);
				return root;
			}
			addNode(node.left,data);
		}else {
			if(node.right == null) {
				node.right = new Node(data);
				return root;
			}
			addNode(node.right,data);
		}
		
		return null;
		
	}
	
	public void inOrder(Node node) {
		
		if(node ==null)
			return;
		
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
	
	}
	
	public static void main(String[] args) {
		BSTAddNode tree = new BSTAddNode();
			tree.addNode(tree.root, 50);
	        tree.addNode(tree.root, 30);
	        tree.addNode(tree.root, 20);
	        tree.addNode(tree.root, 40);
	        tree.addNode(tree.root, 70);
	        tree.addNode(tree.root, 60);
	        tree.addNode(tree.root, 80);
	 
	        // print inorder traversal of the BST
	        tree.inOrder(tree.root);
		

	}
}
