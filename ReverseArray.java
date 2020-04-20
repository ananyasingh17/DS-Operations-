package com.array;

import java.util.Scanner;

public	class ReverseArray
	{ 
		public static void main(String[] args) 
		{ 
			Scanner sc= new Scanner(System.in); 
			System.out.print("Enter a string: ");  
			String input= sc.nextLine();                 
			char[] temparray = input.toCharArray(); 
			int left, right=0; 
			right = temparray.length-1; 

			for (left=0; left < right ; left++ ,right--) 
			{ 
				char temp = temparray[left]; 
				temparray[left] = temparray[right]; 
				temparray[right]=temp; 
			} 

			for (char c : temparray) 
				System.out.print(c); 
			System.out.println(); 
		} 
	} 


