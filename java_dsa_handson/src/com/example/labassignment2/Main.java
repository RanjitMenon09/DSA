package com.example.labassignment2;

/**
 * @author Ranjit Menon
 * 
 * Starting point to test the method
 *
 */

public class Main {
	
	/***
     * this method is the main method and will be called to execute the program
     * @param args
     */
	
	 public static void main(String[] args) {
		 //declare a node object and initialize an array with the value to be inserted into node
		  Node root = null;
	        int[] data = {8, 3, 10, 1, 6, 14, 4, 7, 13};
	        
	        //initialize the TreeTraverse object to call helper methods on the same.
	        TreeTraverse tree = new TreeTraverse();
	        //iterate the array and call insert method on 
	        for (int value : data) {
	            root = tree.insert(root, value);
	        }

	        int searchData = 3;  //enter the number to search in the tree
	        Node searchResult = tree.search(root, searchData);
	        //System.out.println("first node found : " + searchResult.data);
	        //System.out.println("search data : " + searchData);
	        	       
	        tree.printNodes(root, searchResult, searchData);  //print the nodes
	 }	 

}
