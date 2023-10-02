package com.example.app;

/**
 * @author Ranjit Menon
 * 
 * Class which handles the insertion of element at a given position of Array
 *
 */
public class ArrayExample {
	
	private int[] arr_value;
	
	/**
	 * Constructor to pass array that will be used to add the element 
	 * @param array to which element will be passed
	 * 
	 */
	public ArrayExample(int[] array) {
		this.arr_value = array;	
	}
	
	/**
	 * Method that will be used to add the element to array at a given position
	 * 
	 * @param position the index where the element should be inserted
     * @param element the element to be inserted
	 */
	public int[] insertElementAt(int position, int element) {
		
		//Create a new tempArray to store the value from the orignal array
		int[] tempArray = new int[arr_value.length + 1];
		
		//copy the array value that we originally had into the temp array upto the postion
		//so if position is 4 , then copy from 0-3 position
		for(int i=0; i  < position; i++) {
			tempArray[i] = arr_value[i];
		}
		
		//now insert the element at the given position 
		tempArray[position] = element;
		
		// Copy elements after the specified position
        for (int i = position; i < arr_value.length; i++) {
            tempArray[i + 1] = arr_value[i];
        }
	
        //return the updated Array
        return tempArray;      
        
	}
	
	
	 /**
     * Deletes the element at the specified position in the array.
     *
     * @param position the index of the element to be deleted
     */
    public int[] deleteElementAt(int position) {
    	
        // Create a new array with reduced size
        int[] tempArray = new int[arr_value.length - 1];
        
        // Copy elements before the specified position
        for (int i = 0; i < position; i++) {
            tempArray[i] = arr_value[i];
        }
        
        // Copy elements after the specified position
        for (int i = position + 1; i < arr_value.length; i++) {
            tempArray[i - 1] = arr_value[i];
        }
        
        //return the updated value
        return tempArray;
    }
    
    /**
     * Sorts the elements in the array in ascending order using the Bubble Sort algorithm.
     */
    public int[] sortArray() {
        int n = arr_value.length;

        //start the outer loop for the first position
        for (int i = 0; i < n - 1; i++) {
        	//loop the entire loop and compare the first position
            for (int j = 0; j < n - i - 1; j++) {
                if (arr_value[j] > arr_value[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = arr_value[j];                    
                    arr_value[j] = arr_value[j + 1];
                    arr_value[j + 1] = temp;
                }
            }
        }
        return arr_value;
    }
}
