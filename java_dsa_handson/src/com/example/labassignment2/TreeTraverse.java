/**
 * 
 */
package com.example.labassignment2;

/**
 * @author ranjit09
 * main class we will be having all the logics for tree traversal, search and print
 * This class contains method to insert, search and print 
 */
public class TreeTraverse {
	
	/***
     * insert method will allow data to be inserted into the tree structure
     * @param root - root node in which data will be inserted
     * @param data - the actual int data that will be inserted into either left of right side of the node
     */	
	 public Node insert(Node root, int data) {
	        if (root == null) {
	            return new Node(data); // if no node exists, add the data and return it
	        }
	        
	        if (data < root.data) {
	            root.left = insert(root.left, data); // add to the left side
	        } else if (data > root.data) {
	            root.right = insert(root.right, data); // add to the right side
	        }
	        
	        return root;
	    }

	 	/***
	     * search method will find the node adn return if the root of the node and data matches
	     * else it will keep calling recursively either left or right based on the critera
	     * @param root - root node in which data will be inserted
	     * @param data - the actual int data that will be inserted into either left of right side of the node
	    */
	    public Node search(Node root, int data) {
	        if (root == null || root.data == data) {
	            return root;
	        }
	        
	        if (data < root.data) {
	            return search(root.left, data); //if less then the parent then call recursively for left node
	        } else {
	            return search(root.right, data);  //if greater then the parent then call recursively for right node
	        }
	    }

	    /***
	     * private helper method for printing the ancestors, it is a recursive call. 
	     * @param root - root node in which data will be printed
	     * @param data - the actual int data that will be inserted into either left of right side of the node
	    */
	    private static void printAncestors(Node root, int data) {
	        if (root == null) {
	            return;
	        }

	        if (root.data == data) {
	            return;
	        }

	        if (data < root.data) {
	            System.out.print(root.data + " ");
	            printAncestors(root.left, data);  //if less then the parent node, then print left side of the node
	        } else {
	            System.out.print(root.data + " ");
	            printAncestors(root.right, data); //if greater then the parent node, print the right side of the node
	        }
	    }

	    /***
	     * private helper method for printing the descendants, it is a recursive call. 
	     * @param root - root node in which data will be printed	     
	    */
	    private static void printDescendants(Node node) {
	        if (node == null) {
	            return;
	        }

	        //the node here just need to be printed, so the node that comes in
	        //we need to print all the child of it for both left and right.
	        //this will go till the end unless there is no child nodes.
	        System.out.print(node.data + " ");
	        printDescendants(node.left); 
	        printDescendants(node.right);
	    }
	    
	    /***
	     * print method for entire thing and internally it will call the helper method.	   
	     * @param root - root node that is at the top of the tree
	     * @param node - the current node that is currently being printed
	     * @param data - the actual int data that will be either left of right side of the node
	    */
	    public void printNodes(Node root, Node node, int data) {
	    	//System.out.println("node : " + node.data);
	    	//System.out.println("data : " + data);
	    	
	    	 if (node != null) {
		            System.out.println("Input: N = " + data);
		            System.out.print("Output: Ancestors: ");
		            TreeTraverse.printAncestors(root, data);		            
		            System.out.print(", Descendants: ");
		            TreeTraverse.printDescendants(node.left);
		            TreeTraverse.printDescendants(node.right);
		        } else {
		            System.out.println("No Node found for : " + data);
		        }
	    	 
	    }
}
