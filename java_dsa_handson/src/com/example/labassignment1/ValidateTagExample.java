package com.example.labassignment1;
import java.util.Stack;

/**
 * @author Ranjit Menon
 * 
 * This class validates if a tag '<' has a matching closing tag '>', it support isValid method which accepts
 * a string and validate that
 *
 */
public class ValidateTagExample {
	
	/***
     * this method will accept a string and validate if it has matching < and > tag, 
     * return a boolean depending upon if the value passed is valid
     * @param item
     */
	 public boolean isValid(String tag) {
		 
		 /*
		 if (tag == null || tag.isEmpty()) {
			 throw new IllegalArgumentException("tag cannot be null or empty.");
		 }
		 */
		 		 
		 //initialize a stack of type char
		 Stack<Character> stack = new Stack<>();

		  //iterate the string passed and loop through each tag
		  //if it has a start tag '<', push this into stack, and if it finds a 
		  // matching closing tag '>' then check if the opening is there in stack, 
		  //if yes return true else false
		 
	        for (char c : tag.toCharArray()) {
	            if (c == '<') {
	                stack.push(c);
	            } else if (c == '>') {
	                if (stack.isEmpty() || stack.peek() != '<') {
	                    return false;
	                }
	                stack.pop();
	            }
	        }

	        return stack.isEmpty();
	    }
	   
}
