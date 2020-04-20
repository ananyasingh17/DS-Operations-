package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
	static Node root;
	
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			super();
			this.data = data;
			
		}
		public int getData() {
			return data;
		}
		public Node getLeft() {
			return left;
		}
		public Node getRight() {
			return right;
		}
		
		
		
		
	}
	
	
	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.getLeft());
		System.out.println(root.getData());
		inorder(root.getRight());
		
	}
	
	public static void preorder(Node root) {
		if(root == null) {
			return;
		}
		System.out.println(root.getData());
		preorder(root.getLeft());
	    preorder(root.getRight());
	}
	
	
	public static void postorder(Node root) {
	    if(root == null) {
	    	return;
	    }
	    postorder(root.getLeft());
	    postorder(root.getRight());
	    System.out.println(root.getData());
	}
	
	static Node createNode(int value){
	   Node newNode = new Node(value);
	    newNode.data = value;
	    newNode.left = null;
	    newNode.right = null;

	    return newNode;
	}
	
	 static Node insertLeft(Node root, int value) {
	    root.left = createNode(value);
	    return root.left;
	} 


	 static Node insertright(Node root, int value) {
		    root.right = createNode(value);
		    return root.right;
		} 
	 
	 static void levelOrder() {
			// make a queue for level order. Queue is Interface and LinkedList is class
			Queue<Node> queue = new LinkedList<Node>();
			queue.add(root);
			while (!queue.isEmpty()) {
				Node presentNode = queue.remove();
				System.out.print(presentNode.getData() + " ");
				if (presentNode.getLeft() != null) {
					queue.add(presentNode.getLeft());
				}
				if (presentNode.getRight() != null)
					queue.add(presentNode.getRight());
			}
	 }
	 
public static void main(String[] args) {
	Node root1=new Node(1);
	
	insertLeft(root1, 12);
    insertright(root1, 9);
    
    insertLeft(root1.left, 5);
    insertright(root1.left, 6);
    
    System.out.println("Inorder traversal \n");
    inorder(root1);

    System.out.println("Inorder traversal \n");
    preorder(root1);

    System.out.println("Inorder traversal \n");
    postorder(root1);
    
    System.out.println("Levelorder traversal \n");
    levelOrder();
	
	
}
}
