package com.bloc.recursion;

import java.util.*;

public class RecursionUtils extends Object {
	/*
	 * findMaxRecursively
	 *
	 * Takes a list of numbers and finds the largest among them
	 * using recursive calls.
	 *
	 * @param numbers a list of numbers, can be odd or even numbered
	 * @return the largest number in the list
	 *
	 * Hint: your base case may be a comparison of 2 numbers
	 */
	public static final int findMaxRecursively(List<Integer> numbers) {
		/************************************************
	 	 *	ASSIGNMENT:
	 	 *	Implement this method, the return value must
	 	 *	change
		/************************************************/
                      
                        ///Base case
                   //if list size is == 2
                        //return the largest value
            
                  if(numbers.size() == 2) {
                      if(numbers.get(0) <= numbers.get(1)) {
                          return numbers.get(1);
                      } else
                          return numbers.get(0);
                  }
                  
                    //if the size of the list == 1 return that value
                  if(numbers.size() == 1) {
                      return numbers.get(0);
                  }
                  
                  if(numbers.isEmpty()){
                      return 0;
                  }
            
                   // otherwise...
                    // find the max of a list of...
                    
                    List<Integer> list = new ArrayList<>();
                    
                    list.add(findMaxRecursively
                            (numbers.subList(0, numbers.size()/2)));
                    
                    list.add(findMaxRecursively
                            (numbers.subList(numbers.size()/2, numbers.size())));
                        
                    return findMaxRecursively(list);
                 
	}
}