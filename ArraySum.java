package array;

import java.util.Scanner;

public class ArraySum {
	

		int subArraySum(int arr[], int n, int sum) 
			{ 
				int originalSum = arr[0], start = 0, i; 

			
				for (i = 1; i <= n; i++) 
				{ 
					while (originalSum > sum && start < i-1) 
					{ 
						originalSum = originalSum - arr[start]; 
						start++; 
					} 
					
		
					if (originalSum == sum) 
					{ 
						int p = i-1; 
						System.out.println("Sum between indexes " + start 
								+ " and " + p); 
						return 1; 
					} 
					
					if (i < n) 
					originalSum = originalSum + arr[i]; 
					
				} 

				System.out.println("No subarray found"); 
				return 0; 
			} 

			public static void main(String[] args) 
			{ 

				  Scanner s = new Scanner(System.in);
				   int arr[] = new int[100];
			        System.out.println("Enter all the elements:");
			        for(int i = 0; i < 5; i++)
			        {
			            arr[i] = s.nextInt();
			            
			        }
			
				//	int array[] = {12, 35, 1, 10, 34, 1}; 
					int n = arr.length; 
			
				ArraySum arraysum = new ArraySum(); 
				//int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
				//int n = arr.length; 
				int sum = 23; 
				arraysum.subArraySum(arr, n, sum); 
			} 
		} 




