package com.example.app;

/**
 * @author Ranjit Menon
 * 
 * Class which handles insertion and deletion of Stack, this class suppports
 * Push for adding item and Pop for removing item. this is implemented using 
 * Array
 *
 */
public class StackExample {
	
    private char[] stack;
    private int top;

    /**
     * Constructor to pass initial capacity for the Stack to be initialized.
     * Initialize the top to -1
     * @param capacity
     */
    public StackExample(int capacity) {
        stack = new char[capacity];
        top = -1;
    }

    /***
     * push method to add the item into Stack, accept item of type char
     * @param item
     */
    public void push(char item) {
    	//if top is equal to the initial capacity, then throw an exception
        if (top == stack.length - 1) {
            throw new IllegalStateException("Stack is full");
        }
        top++;
        stack[top] = item;
    }

    /***
     * pop will return the value in LIFO, last in first out mode.
     * @return value of char stored in stack
     */
    public char pop() {
        if (isEmpty()) { 
            throw new IllegalStateException("Stack is empty");
        }
        char item = stack[top];
        top--;
        return item;
    }   
    
    
    /***
     * check if the stack is empty by comparing the top with -1
     * @return boolean value indicating if stack is empty or not
     */
    
    public boolean isEmpty() {
        return top == -1;
    }
}
