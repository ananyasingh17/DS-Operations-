package com.array;

import java.util.Scanner;

public class SecondLargest {

		public static void secondlargest(int array[], 
										int array_size) 
		{ 
			int i, first, second; 
		
			if (array_size < 2) 
			{ 
				System.out.print(" Invalid Input "); 
				return; 
			} 
		
			first = second = Integer.MIN_VALUE; 
			for (i = 0; i < array_size ; i++) 
			{ 
			
				if (array[i] > first) 
				{ 
					second = first; 
					first = array[i]; 
				} 
		
				
				else if (array[i] > second && array[i] != first) 
					second = array[i]; 
			} 
			
			if (second == Integer.MIN_VALUE) 
				System.out.print("Second largest doesn't exists"+ 
									" element\n"); 
			else
				System.out.print("The second largest element"+ 
										" is "+ second); 
		} 
		
		public static void main(String[] args) 
		{ 
			
			  Scanner s = new Scanner(System.in);
			   int array[] = new int[100];
		        System.out.println("Enter all the elements:");
		        for(int i = 0; i < 5; i++)
		        {
		            array[i] = s.nextInt();
		            
		        }
		
			//	int array[] = {12, 35, 1, 10, 34, 1}; 
				int n = array.length; 
				secondlargest(array, n); 
		} 
	} 
	

