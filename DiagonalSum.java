package array;

public class DiagonalSum {

	static void printDiagonalSums(int[][] mat, int n) {
		int principal = 0, secondary = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {


				if (i == j)
					principal += mat[i][j];

 
				if ((i + j) == (n - 1))
					secondary += mat[i][j];
			}
		}

		System.out.println("Principal Diagonal:" + principal);

		System.out.println("Secondary Diagonal:" + secondary);
	}


static public void main (String[] args) 
{ 

int [][]a = { { 9, 2, 7, 1 }, 
{ 1, 6, 9, 8 },  
{ 9, 5, 3, 9 }, 
{ 1, 9, 3, 2 } }; 

printDiagonalSums(a, 4); 
} 
} 


