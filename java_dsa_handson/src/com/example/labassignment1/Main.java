package com.example.labassignment1;

/**
 * @author Ranjit Menon
 * 
 * Starting point to test the method
 *
 */
public class Main {
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 ValidateTagExample validateTag = new ValidateTagExample();		  
		 String[] tags = {"<aa><bb>", "<<zz>>", "<xx>>", "<<yy", "<bb><cc>>>"};
	        
		 //this is iterate for each element in the array, seperated by comma and send it to isValid method
	        for (String tag : tags) {
	            if (validateTag.isValid(tag)) {
	                System.out.println(tag + " is a valid tag.");
	            } else {
	                System.out.println(tag + " is an invalid tag.");
	            }
	        }
}
}
