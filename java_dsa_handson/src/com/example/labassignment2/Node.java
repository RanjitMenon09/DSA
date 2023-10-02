package com.example.labassignment2;

/**
 * @author Ranjit Menon
 * 
 * Node class to hold the left and right nodes which will start from the root node,
 * this will also hold the data for that respective node element.
 *
 */

public class Node {
    public int data;
    public Node left;
    public Node right;

    //constructor to initialize the node object
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

