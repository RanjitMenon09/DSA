package com.example.app;

public class Main {

	/**
	 * main method to invoke the ArrayExample.java class.
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("**** Array Example starts *****");
		
		int[] arr_value = {20,25,55,7,40};
        int position = 2;
        int element = 3;
        
        ArrayExample arrObj = new ArrayExample(arr_value);
        arr_value = arrObj.insertElementAt(position, element);
        
        //Print the array after insertion
        for (int num : arr_value) {
            System.out.print(num + " ");
        }
        
        System.out.print("\n");
        
        int del_position = 3; 
        ArrayExample arrDelObj = new ArrayExample(arr_value);
        int[] arr_deleted_value = arrDelObj.deleteElementAt(del_position);
        
        //Print the array after deletion
        for (int num : arr_deleted_value) {
            System.out.print(num + " ");
        }
        
        System.out.print("\n");
        
        //sorting functionality
        ArrayExample arrSortObj = new ArrayExample(arr_value);
        int[] arr_sorted_value = arrSortObj.sortArray();
        
        //Print the array after sorting
        for (int num : arr_sorted_value) {
            System.out.print(num + " ");
        }
        
        System.out.print("\n");
        System.out.println("**** Array Example ends *****");
        
        System.out.print("\n");
        System.out.println("**** Stack Example starts *****");
        
        StackExample stack = new StackExample(9);
        stack.push('d');
        stack.push('e');
        stack.push('s');
        stack.push('s');
        stack.push('e');
        stack.push('r');
        stack.push('t');
        stack.push('s');

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        
        System.out.print("\n");
        System.out.println("**** Stack Example ends *****");

	}

}
